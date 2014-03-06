/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package control;

import entity.*;
import interfacce_remote.control.ControllerLoginInterface;
import interfacce_remote.entity.CassiereInterface;
import interfacce_remote.entity.ClienteInterface;
import interfacce_remote.entity.FilmInterface;
import interfacce_remote.entity.PagamentoInterface;
import interfacce_remote.entity.TerminaleInterface;
import interfacce_remote.entity.TransizioneInterface;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.orm.PersistentException;

/**
 *
 * @author Antonio
 */
public class ControllerLogin extends UnicastRemoteObject implements ControllerLoginInterface {
    private static ControllerLogin instance;
   // private Cliente cliente;
   // private Cassiere cassiere;
    private int n_noleggi;
    private String login;
    private boolean dis=true;
    private Map<String,Cliente> clienti = new HashMap();
    private Map<String,Cassiere> cassieri = new HashMap();
    public ControllerLogin()  throws RemoteException {
    }
   
public TerminaleInterface CaricaTerminale() throws RemoteException {

        Terminale  t=new Terminale();
        t.setCodice("1");
        return t;
    }
 

    public String getLogin() throws RemoteException {
        return login;
    }

    public void setLogin(String login) throws RemoteException {
        this.login = login;
    }

    public  ClienteInterface getCliente(String t) throws RemoteException{
        if(clienti.size()!=0)
             return clienti.get(t);
        return null;
    }

    public  void setCliente(ClienteInterface cliente) throws RemoteException{
       cliente = (Cliente) cliente;
    }

    public CassiereInterface getCassiere(String terminale) {
        return cassieri.get(terminale);
    }

    public  void setCassiere(CassiereInterface cas,String terminale) throws RemoteException {
        try {
            cassieri.put(terminale, CassiereDAO.loadCassiereByORMID(cas.getID()));
        } catch (PersistentException ex) {
            Logger.getLogger(ControllerLogin.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public  int getN_noleggi(String ter) throws RemoteException {
        return contaNoleggi(clienti.get(ter).getTessera_personale().getCodice());
    }

    public  void setN_noleggi(int n) throws RemoteException {
    
       n_noleggi = n_noleggi + n;
    }

    
    public static ControllerLogin getInstance() throws RemoteException {
         if (instance == null) {
            instance = new ControllerLogin();
        }
        return instance;
    }


    public void Login(String codice, String terminale) throws RemoteException {
        if(!codice.isEmpty())
        {
            try {
                ClienteCriteria criteria = new ClienteCriteria();
                criteria.createTessera_personaleCriteria().codice.eq(codice);
                Cliente[] cl = ClienteDAO.listClienteByCriteria(criteria);
                int lunghezza = cl.length;
                System.out.print(cl.length);
                if (lunghezza != 0 && cl[0].getTessera_personale().getAttiva()) {
                    clienti.put(terminale, cl[0]);
                    n_noleggi = contaNoleggi(cl[0].getTessera_personale().getCodice());
                    
                } else {
                    
                    n_noleggi = 0;
                }
            } catch (Exception ex) {
                Logger.getLogger(ControllerLogin.class.getName()).log(Level.SEVERE, null, ex);
            }
}

    }
     public void LoginCassiere(String pin ,String terminale) throws PersistentException, RemoteException {

        CassiereCriteria criteria= new CassiereCriteria();
        criteria.PIN.eq(pin);
        Cassiere [] ca=CassiereDAO.listCassiereByCriteria(criteria);
        int lunghezza= ca.length;
        if(lunghezza!= 0)

        {
            cassieri.put(terminale,  ca[0]);
           
        }
        else

        {
            cassieri.remove(terminale);
           }
       CheckOut();
        CheckIn();


    }
    public int contaNoleggi(String id_t) throws RemoteException {
         Transizione[] n=null;
        try {
            TransizioneCriteria criteria = new TransizioneCriteria();
            criteria.createTesseraCriteria().codice.eq(id_t);
            // criteria.createTesseraCriteria().createTessera_personaleCriteria().ID.eq(id_t);
            criteria.aperto.eq(true);
            criteria.tipo.eq("noleggio");
            n = TransizioneDAO.listTransizioneByCriteria(criteria);

        } catch (PersistentException ex) {
            Logger.getLogger(ControllerLogin.class.getName()).log(Level.SEVERE, null, ex);
        }
        return n.length;
    }

    public void Logout(String ter){
      
      clienti.remove(ter);
    }
     public void LogoutCassiere(String terminale) throws PersistentException{
         
         cassieri.remove(terminale);
      
      
    }

    private void CheckIn() throws PersistentException, RemoteException {

        Transizione [] ris;
   
    
        TransizioneCriteria criteria= new TransizioneCriteria();
        criteria.data_inizio.eq(new Date());
        criteria.tipo.eq("Prenotazione");
        criteria.aperto.eq(Boolean.TRUE);
        ris= TransizioneDAO.listTransizioneByCriteria(criteria);
        ArrayList<Transizione> al = new ArrayList(Arrays.asList(ris));
        Iterator <Transizione> it =al.iterator();
        TransizioneInterface d;
        int i=0;
        while (it.hasNext())
        {  d=((TransizioneInterface)it.next());
           dis=CheckCopia(d.getFilm_noleggiato().getID());
           
           if(!dis)
             { Transizione tr=TransizioneDAO.loadTransizioneByORMID(d.getORMID());
               tr.setAperto(false);

               TransizioneDAO.update(tr);
               SendMail(al.get(i).getTessera().getORMID());
             }

        i++;
        }
      
    }

    private boolean CheckCopia(int iD) throws PersistentException, RemoteException{
        Film ris=new Film();
        TransizioneCriteria criteria= new TransizioneCriteria();
        criteria.createFilm_noleggiatoCriteria().ID.eq(iD);
        criteria.tipo.eq("noleggio");
        criteria.aperto.eq(Boolean.TRUE);

        Transizione[] t= TransizioneDAO.listTransizioneByCriteria(criteria);

        if(t.length==0)
            return true;

        return false;


       
       


    }



    private void SendMail(String oRMID)  throws PersistentException, RemoteException {
        
        ClienteCriteria criteria = new ClienteCriteria();
        criteria.createTessera_personaleCriteria().codice.eq(oRMID);
        Cliente cliente= ClienteDAO.loadClienteByCriteria(criteria);
        System.out.print("Il Film da te prenotato non è ancora disponibile,le abbiamo accreditato un bonus sulla sua tessera per l'inconveniente" + cliente.getEmail());
        Tessera t= (Tessera) cliente.getTessera_personale();
        float credito= t.getCredito() + 1;
        t.setCredito(credito);
        TesseraDAO.update(t);
        

    }

    private void CheckOut() throws PersistentException, RemoteException{

        Transizione [] ris;
      
        TransizioneCriteria criteria= new TransizioneCriteria();
        Calendar calendar = Calendar.getInstance();
	calendar.setTime(new Date());
	calendar.add(Calendar.DATE, -1);
        Date data = calendar.getTime();
        criteria.data_fine.eq(data);
        criteria.tipo.eq("prenotazione");
        criteria.aperto.eq(Boolean.TRUE);
        ris= TransizioneDAO.listTransizioneByCriteria(criteria);
        ArrayList<Transizione> al = new ArrayList(Arrays.asList(ris));
        Iterator <Transizione>it =al.iterator();
        int i=0;
      while (it.hasNext())
        { 
           Transizione t =it.next();
           Malus( t.getTessera().getORMID());
           t.setAperto(false);
           TransizioneDAO.update(al.get(i));
           ControllerNoleggio cn= ControllerNoleggio.getInstance();
           dis=CheckCopia(al.get(i).getFilm_noleggiato().getID());
           if(dis)
           {
               cn.CheckTransizioni(t.getFilm_noleggiato().getID());
            }
        i++;
        }
     
    }

    private void Malus(String oRMID) throws PersistentException, RemoteException{
        PagamentoInterface p = new NormalePagamento();
        Tessera t = TesseraDAO.loadTesseraByORMID(oRMID);
       
        float credito = t.getCredito() - p.getMalus_prenotazione();
        t.setCredito(credito);
    }




}
