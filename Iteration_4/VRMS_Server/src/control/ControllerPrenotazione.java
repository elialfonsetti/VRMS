/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package control;

import entity.*;
import interfacce_remote.control.ControllerPrenotazioneInterface;
import interfacce_remote.entity.ClienteInterface;
import interfacce_remote.entity.FilmInterface;
import interfacce_remote.entity.TransizioneInterface;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.orm.PersistentException;

/**
 *
 * @author Antonio
 */
public class ControllerPrenotazione extends UnicastRemoteObject implements ControllerPrenotazioneInterface {
    private static ControllerPrenotazione instance;
    private String Formato;

    public ControllerPrenotazione() throws RemoteException {
    }

    public static ControllerPrenotazione getInstance() throws RemoteException {
         if (instance == null) {
            instance = new ControllerPrenotazione();
        }
        return instance;
    }

    public String getFormato() {
        return Formato;
    }

    public void setFormato(String Formato) {
        this.Formato = Formato;
    }



     public Film CercaCopia(int id_film) throws PersistentException {
        Film f;

        f= FilmDAO.getFilmByORMID(id_film);

        return f;

    }
        public int ConfermaPrenotazione(TransizioneInterface Transizione, ClienteInterface cliente, float costo) throws PersistentException, RemoteException {


        Transizione t= new Transizione();
        t.setAperto(Transizione.getAperto());
        t.setCosto_totale(costo);
        t.setData_fine(Transizione.getData_fine());
        t.setData_inizio(Transizione.getData_inizio());
        t.setFilm_noleggiato(FilmDAO.getFilmByORMID(Transizione.getFilm_noleggiato().getORMID()));
        t.setTessera(TesseraDAO.getTesseraByORMID(Transizione.getTessera().getORMID()));
        Terminale ter= new Terminale();
        ter.setCodice(Transizione.getOrigine_noleggio().getCodice());
        t.setOrigine_noleggio(ter);
        t.setTipo("Prenotazione");
        TransizioneDAO.save(t);
        
       
        TransizioneCriteria criteria= new TransizioneCriteria();
        criteria.data_fine.eq(Transizione.getData_fine());
        criteria.createFilm_noleggiatoCriteria().ID.eq(Transizione.getFilm_noleggiato().getID());
        criteria.aperto.eq(true);
        criteria.tipo.eq("Prenotazione");
        Transizione[] n =TransizioneDAO.listTransizioneByCriteria(criteria);

        return n[0].getID();
      }


      public Terminale CaricaTerminale() throws PersistentException, RemoteException {
        Terminale  t=new Terminale();
        t.setCodice("1");
        return t;
    }

      public java.util.ArrayList<FilmInterface> OttieniCopie(int iD) throws PersistentException {

        FilmCriteria criteria = new FilmCriteria();

        criteria.createDescrizione_filmCriteria().ID.eq(iD);
        criteria.disponibile.eq(Boolean.TRUE);
        Film [] l = FilmDAO.listFilmByCriteria(criteria);

        ArrayList al = new ArrayList(Arrays.asList(l));

        return al;
    }

      public Descrizione OttieniDescrizione(int iD) throws PersistentException {

          Descrizione al= DescrizioneDAO.getDescrizioneByORMID(iD);

        return al;
    }

       public ArrayList<TransizioneInterface> OttieniTransizioni(int iD, String formato) throws PersistentException, RemoteException {
        System.out.println(iD);
        System.out.println(formato);
        ArrayList<TransizioneInterface> d= new ArrayList();
        FilmCriteria criteria= new FilmCriteria();
        criteria.createDescrizione_filmCriteria().ID.eq(iD);
        criteria.createFormato_filmCriteria().nome_formato.eq(formato);
        Film[] f = FilmDAO.listFilmByCriteria(criteria);
        System.out.println(f.length);
       for (int i=0; i<f.length; i++)
        { 
            Transizione trans= CercaData(f[i].getID());
            d.add(trans);
                }
        return d;
    }

    private Transizione CercaData(int iD) throws PersistentException, RemoteException
    {
        System.out.println("CERCADATA: "+ iD);
        Date data=new Date();
        Transizione tr= new Transizione();
        TransizioneCriteria criteria= new TransizioneCriteria();
        criteria.createFilm_noleggiatoCriteria().ID.eq(iD);
        criteria.aperto.eq(true);
        Transizione [] t = TransizioneDAO.listTransizioneByCriteria(criteria);
        System.out.print(t.length);
        if(t.length !=  0){
            for(int i=0; i<t.length ; i++)
            {

                if(data.before(t[i].getData_fine()))
                {
                    data = t[i].getData_fine();
                    tr= t[i];
                }

            }
            }

             System.out.println(tr.getFilm_noleggiato().getDescrizione_film().getID());
                return tr;

    }

     public ArrayList<TransizioneInterface> RiepilogoPrenotazioni(ClienteInterface cliente) throws PersistentException, RemoteException{
        TransizioneCriteria criteria = new TransizioneCriteria();
        criteria.createTesseraCriteria().codice.eq(cliente.getTessera_personale().getCodice());
                
        criteria.aperto.eq(Boolean.TRUE);
        criteria.tipo.eq("Prenotazione");
        Date d = new Date();

        Transizione [] r = TransizioneDAO.listTransizioneByCriteria(criteria);

        ArrayList<TransizioneInterface> richieste =new ArrayList();
        for (int i=0; i<r.length;i++)
        { if (d.after(r[i].getData_inizio()) && d.before(r[i].getData_fine()))
                richieste.add(r[i]);
        }
        return richieste;
     }
      public Transizione ottieniTransizione(int id)  throws PersistentException{
         return TransizioneDAO.getTransizioneByORMID(id);
    }

     public void RitiraPrenotazione(TransizioneInterface transizione, ClienteInterface cliente) throws PersistentException{
         try {
            float costo = transizione.getCosto_totale();
            float credito = cliente.getTessera_personale().getCredito() - costo;
            cliente.getTessera_personale().setCredito(credito);
            ClienteDAO.update((ClienteDAO.getClienteByORMID(cliente.getID())));
            Transizione t=(TransizioneDAO.getTransizioneByORMID(transizione.getID()));
            t.setTipo("Noleggio");
            t.setCosto_totale(costo);
            TransizioneDAO.update(t);
          
        } catch (RemoteException ex) {
            Logger.getLogger(ControllerPrenotazione.class.getName()).log(Level.SEVERE, null, ex);
        }
         
    }

        public Transizione CaricaNoleggio(int id_Transizione) throws PersistentException {
        Transizione transizione= TransizioneDAO.getTransizioneByORMID(id_Transizione);

        return transizione;
    }

    public TransizioneInterface NuovaTransizione() throws Exception, RemoteException {
        return new Transizione();
    }
}
