/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package control;

import Factory.PagamentoFactory;
import entity.*;
import interfacce_remote.control.ControllerNoleggioInterface;
import interfacce_remote.entity.ClienteInterface;
import interfacce_remote.entity.FilmInterface;
import interfacce_remote.entity.FormatoInterface;
import interfacce_remote.entity.PagamentoInterface;
import interfacce_remote.entity.TerminaleInterface;
import interfacce_remote.entity.TransizioneInterface;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.hibernate.LockMode;
import org.orm.PersistentException;
import org.orm.PersistentTransaction;

/**
 *
 * @author Antonio
 */
public class ControllerNoleggio extends UnicastRemoteObject implements ControllerNoleggioInterface {
    private Map<String,Transizione> noleggi= new HashMap();
    private Map<String,Film> copie=new HashMap();
 



    private static ControllerNoleggio instance;

    public ControllerNoleggio() throws RemoteException {
    }

      
     public static ControllerNoleggio getInstance() throws RemoteException {
         if (instance == null) {
            instance = new ControllerNoleggio();
        }
        return instance;
    }

    public TransizioneInterface getNoleggio(String terminale) {
        return noleggi.get(terminale);
    }
   public void setNoleggio(TransizioneInterface n,String terminale) throws RemoteException, PersistentException {
       if (n != null)
       {
           TransizioneCriteria criteria = new TransizioneCriteria();
          criteria.tipo.eq("Noleggio");
          criteria.createFilm_noleggiatoCriteria().ID.eq(n.getFilm_noleggiato().getID());
          criteria.aperto.eq(Boolean.TRUE);
          Transizione noleggio= TransizioneDAO.loadTransizioneByCriteria(criteria);
          noleggi.put(terminale, noleggio);
       }
 }

    public void setClienteNoleggio(ClienteInterface c,String terminale) throws RemoteException, PersistentException {
        noleggi.get(terminale).setTessera(TesseraDAO.getTesseraByORMID(c.getTessera_personale().getORMID()));
    }

      public java.util.ArrayList<FilmInterface> OttieniCopie(int iD) throws PersistentException {
        
        FilmCriteria criteria = new FilmCriteria();
       
        criteria.createDescrizione_filmCriteria().ID.eq(iD);
        criteria.disponibile.eq(Boolean.TRUE);
        Film [] l = FilmDAO.listFilmByCriteria(criteria);
        ArrayList al = new ArrayList(Arrays.asList(l));
        return al;
    }

    public ArrayList<FormatoInterface> OttieniFormati(int ID) throws PersistentException, RemoteException {

        Formato[] l= FormatoDAO.listFormatoByQuery(null,"nome_formato");
        ArrayList al = new ArrayList(Arrays.asList(l));
        ArrayList al1=new ArrayList();
        Iterator<Formato> it= al.iterator();
        Formato f= new Formato();

          while (it.hasNext())
            {f = it.next();
             if(CheckFormato(f,ID))
                 al1.add(f);
                }
         return al1;

       

    }


    public Descrizione OttieniDescrizione(int iD) throws PersistentException {
        Descrizione al= DescrizioneDAO.getDescrizioneByORMID(iD);
      
        return al;
    }

    public float OttieniCostoFormato(String combo)throws PersistentException {

        Formato tipo=FormatoDAO.getFormatoByORMID(combo);

        float costo=tipo.getCosto();
        return costo;
    }
    public float CalcolaTotale(String terminale,TransizioneInterface t ,int giorni ) throws RemoteException {
        try {
            if (! noleggi.containsKey(terminale))
            noleggi.put(terminale, new Transizione());

            PagamentoFactory factory = PagamentoFactory.getInstance();
            Tessera tessera = TesseraDAO.loadTesseraByORMID(t.getTessera().getCodice());
            noleggi.get(terminale).setFilm_noleggiato(t.getFilm_noleggiato());
            noleggi.get(terminale).setPagamento_strategy(factory.CreaPagamento(tessera));
            float costo = noleggi.get(terminale).CalcolaCosto(giorni);
                    return costo;
        } catch (PersistentException ex) {
            Logger.getLogger(ControllerNoleggio.class.getName()).log(Level.SEVERE, null, ex);
        }
        return 0;
    }
    public float CalcolaAggiuntaRestituzione(TransizioneInterface copia ,int giorni) throws RemoteException {
        try {
            PagamentoInterface p;
            PagamentoFactory factory = PagamentoFactory.getInstance();
            float costo;
            p = factory.CreaPagamento(TesseraDAO.loadTesseraByORMID(copia.getTessera().getORMID()));
            costo = p.CalcolaMalusRestituzione(copia.getFilm_noleggiato().getDescrizione_film(), copia.getFilm_noleggiato().getFormato_film(), giorni);
            return costo;
        } catch (PersistentException ex) {
            Logger.getLogger(ControllerNoleggio.class.getName()).log(Level.SEVERE, null, ex);
        }
        return 0;
    }
   

    public Terminale CaricaTerminale() throws PersistentException, RemoteException {
        Terminale  t=new Terminale();
        t.setCodice("1");
        return t;
    }

    

    public ClienteInterface CaricaCliente(int n) throws PersistentException {
        Cliente cliente= ClienteDAO.getClienteByORMID(n);
        return cliente;
    }

    public void ConfermaNoleggio(String codice,TransizioneInterface Transizione, float costo) throws PersistentException, RemoteException {

        Transizione t= noleggi.get(codice);
        t.setAperto(Transizione.getAperto());
        t.setCosto_totale(costo);
        t.setData_fine(Transizione.getData_fine());
        t.setData_inizio(Transizione.getData_inizio());
        t.setFilm_noleggiato(FilmDAO.getFilmByORMID(Transizione.getFilm_noleggiato().getORMID()));
        t.setTessera(TesseraDAO.getTesseraByORMID(Transizione.getTessera().getORMID()));
        Terminale ter= new Terminale();
        ter.setCodice(codice);
        t.setOrigine_noleggio(ter);
        t.setTipo("Noleggio");
        TransizioneDAO.save(t);
        noleggi.remove(codice);
        noleggi.put(codice, t);
        Film copia=FilmDAO.getFilmByORMID(Transizione.getFilm_noleggiato().getORMID());
        copia.setDisponibile(false);
        FilmDAO.update(copia);
        float credito= Transizione.getTessera().getCredito() - costo;
        Tessera tessera= TesseraDAO.getTesseraByORMID(Transizione.getTessera().getORMID());
        tessera.setCredito(credito);
        TesseraDAO.update(tessera);
        
      }

  

  
  
     private ArrayList<Film> TrovaCopie(int id_desc, String formato) throws PersistentException {
        FilmCriteria criteria = new FilmCriteria();
        criteria.createDescrizione_filmCriteria().ID.eq(id_desc);
        criteria.createFormato_filmCriteria().nome_formato.eq(formato);
        Film[] f = FilmDAO.listFilmByCriteria(criteria);
        ArrayList al = new ArrayList(Arrays.asList(f));
        return al;
    }

     public Date ControllaPrenotazioni(int id_desc, String formato) throws PersistentException{
        ArrayList <Film> ar = TrovaCopie(id_desc,formato);
         Date d=cercaDataTransizione(ar.get(0).getID());

        
        Iterator it =ar.iterator();
        int i=0;
         while (it.hasNext())
        { Film fil = (Film) it.next();
          Date data = cercaDataTransizione(fil.getID());
          if (data.before(d))
              d=data;
          
        }
        
        return d;

    }

    private Date cercaDataTransizione(int iD) throws PersistentException {
        TransizioneCriteria criteria= new TransizioneCriteria();
        criteria.createFilm_noleggiatoCriteria().ID.eq(iD);
        criteria.aperto.eq(true);
        Transizione [] r= TransizioneDAO.listTransizioneByCriteria(criteria);
        
        return r[0].getData_fine();
    }

   

    public FilmInterface CercaCopia(int id_film) throws PersistentException {
        Film f;
       
        f= FilmDAO.getFilmByORMID(id_film);
        
        return f;

    }
    public TransizioneInterface CercaNoleggio(int id_copia) throws PersistentException {

        
        TransizioneCriteria criteria= new TransizioneCriteria();
        criteria.createFilm_noleggiatoCriteria().ID.eq(id_copia);
        criteria.aperto.eq(true);
        criteria.tipo.eq("Noleggio");
        
        Transizione [] r= TransizioneDAO.listTransizioneByCriteria(criteria);
        if (r.length>0)
             return r[0];
        return null;

    }

    public void ChiudiNoleggio(TransizioneInterface transizione, ClienteInterface cliente) throws PersistentException, RemoteException{
        
        
        ClienteDAO.update(ClienteDAO.getClienteByORMID(cliente.getID()));
        transizione.setAperto(false);
        TransizioneDAO.update(TransizioneDAO.getTransizioneByORMID(transizione.getORMID()));
        Film f= FilmDAO.getFilmByORMID(transizione.getFilm_noleggiato().getID());
        boolean disp=CheckTransizioni(f.getORMID());
        if(!disp)
        {
            f.setDisponibile(true);
            FilmDAO.update(f);
        }
        
    }

    public boolean CheckTransizioni(int id_film) throws PersistentException, RemoteException {

        TransizioneCriteria criteria = new TransizioneCriteria();
        criteria.aperto.eq(Boolean.TRUE);
        criteria.createFilm_noleggiatoCriteria().ID.eq(id_film);
        Transizione[] t= TransizioneDAO.listTransizioneByCriteria(criteria);
        if(t.length!=0)
        {
            SendMail(t[0].getTessera().getORMID());
             return true;
        }
        return false;
    }

    private void SendMail(String oRMID) throws PersistentException  {
        ClienteCriteria criteria = new ClienteCriteria();
        criteria.createTessera_personaleCriteria().codice.eq(oRMID);
        Cliente cliente= ClienteDAO.loadClienteByCriteria(criteria);
        System.out.print("A: " + cliente.getEmail()+"\nIl Film da te prenotato è adesso disponibile, passa a ritirarlo nel periodo da te indicato per la prenotazione altrimenti riceverai un malus");

    }

    public TransizioneInterface NuovaTransizione() throws Exception, RemoteException {
        return new Transizione();
    }

    public void BloccaCopia(String codice,int r) throws Exception, RemoteException {

        Film f=FilmDAO.getFilmByORMID(r);
        if (copie.containsKey(codice))
            copie.put(codice, f);
        else
        {
             copie.remove(codice);
             copie.put(codice, f);
        }
        
       }

    public boolean ControllaCopia(FilmInterface get) throws Exception, RemoteException {
        Film f= FilmDAO.loadFilmByORMID(get.getID());
        if(copie.containsValue(f))
            return true;
        return false;
    }

    private boolean CheckFormato(Formato f, int ID) throws PersistentException {
        FilmCriteria criteria = new FilmCriteria();
        criteria.createFormato_filmCriteria().nome_formato.eq(f.getNome_formato());
        criteria.createDescrizione_filmCriteria().ID.eq(ID);
        Film[] elenco= FilmDAO.listFilmByCriteria(criteria);
        System.out.print(elenco.length);
        if(elenco.length!=0)
            return true;
        return false;

    
    }
 
}
