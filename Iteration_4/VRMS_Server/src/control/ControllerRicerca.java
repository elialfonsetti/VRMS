package control;
import Factory.CatalogoFactory;
import entity.Catalogo;
import interfacce_remote.entity.ProdottoInterface;
import Utilita.PropertyListener;
import entity.*;
import interfacce_remote.control.ControllerRicercaInterface;
import interfacce_remote.entity.ClienteInterface;
import interfacce_remote.entity.DescrizioneInterface;
import interfacce_remote.entity.GenereInterface;
import interfacce_remote.entity.RichiestaInterface;
import interfacce_remote.entity.TerminaleInterface;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.orm.PersistentException;


public class ControllerRicerca extends UnicastRemoteObject implements ControllerRicercaInterface {
        private Map <String,Descrizione> descrizioni= new HashMap();
        private Map <String,String> ordini= new HashMap();
        private Catalogo catalogo_strategy;

    public Catalogo getCatalogo_strategy() {
        return catalogo_strategy;
    }

    public void setCatalogo_strategy(Catalogo catalogo_strategy) {
        this.catalogo_strategy = catalogo_strategy;
    }
       

        ArrayList<PropertyListener> ascoltatori;
        private static ControllerRicerca instance;

    public static ControllerRicerca getInstance()throws RemoteException {
         if (instance == null) {
            instance = new ControllerRicerca();
        }
        return instance;
    }

	
	

   private ControllerRicerca() throws RemoteException{
        ascoltatori=new ArrayList();
    }

    public String getOrdine(String codice) throws RemoteException {
        return ordini.get(codice);
    }
    public void setOrdine(String terminale, String titolo) throws RemoteException {
        ordini.put(terminale, titolo);
    }



    public Descrizione getDesc(String codice) {
        return descrizioni.get(codice);
    }

    public void setDesc(DescrizioneInterface desc,String codice) throws RemoteException {
        Descrizione descrizione= new Descrizione();
        try {
            descrizione = DescrizioneDAO.loadDescrizioneByORMID(desc.getORMID());
        } catch (PersistentException ex) {
            Logger.getLogger(ControllerRicerca.class.getName()).log(Level.SEVERE, null, ex);
        }
        descrizioni.put(codice, descrizione);
    }

    /**
     *
     * @return
     */

    public java.util.ArrayList<DescrizioneInterface> caricaCatalogo()  throws RemoteException{
        CatalogoFactory factory= CatalogoFactory.getInstance();
        catalogo_strategy = factory.CreaCatalogo("consigliato");
        return catalogo_strategy.caricaCatalogo();

    }


    public java.util.ArrayList<GenereInterface> listaGeneri() {

        try {
            Genere[] l = GenereDAO.listGenereByQuery(null, "nome");
            ArrayList al = new ArrayList(Arrays.asList(l));
            return al;
            //return Genere.getElencoGeneri();
        } catch (PersistentException ex) {
            Logger.getLogger(ControllerRicerca.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
	}
     public java.util.ArrayList<DescrizioneInterface> elencoPerGenere(String g) {
        try {
            //String condizione = "GenereNome=";
            DescrizioneCriteria criteria = new DescrizioneCriteria();
            criteria.createGenereCriteria().nome.like("%" + g + "%");
            Descrizione[] l = DescrizioneDAO.listDescrizioneByCriteria(criteria);
            ArrayList al = new ArrayList(Arrays.asList(l));
            return al;
        } catch (PersistentException ex) {
            Logger.getLogger(ControllerRicerca.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
     }
     public java.util.ArrayList<DescrizioneInterface> CercaFilm(String tit, String genere)
    {   
        try {
            DescrizioneCriteria criteria = new DescrizioneCriteria();
            criteria.titolo.like("%" + tit + "%");
            if (!genere.equals("Tutti")) {
                criteria.createGenereCriteria().nome.like("%" + genere + "%");
            }
            Descrizione[] l = DescrizioneDAO.listDescrizioneByCriteria(criteria);
            ArrayList al = new ArrayList(Arrays.asList(l));
            return al;
        }  catch (PersistentException ex) {
            Logger.getLogger(ControllerRicerca.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
     }
     public DescrizioneInterface ottieniFilm(int id)  {
        try {
            return DescrizioneDAO.getDescrizioneByORMID(id);
        } catch (PersistentException ex) {
            Logger.getLogger(ControllerRicerca.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
     public ProdottoInterface ottieniFilmOrdinato(int id) throws RemoteException  {
      
            AdapterProdotto ap = new AdapterProdotto();
            return ap.ottieniFilmOrdinato(id);
        


    }
    

    

     public ClienteInterface CaricaCliente(int n)  {
        try {
            Cliente cliente = ClienteDAO.getClienteByORMID(n);
            return cliente;
        } catch (PersistentException ex) {
            Logger.getLogger(ControllerRicerca.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    public ArrayList<ProdottoInterface> CatalogoFilmOrdinabili (String text) throws RemoteException{
       
            AdapterProdotto a = new AdapterProdotto();
            ArrayList ap = new ArrayList();
            ap =a.ListaFilm(text);
            return ap;
        
    }



   public boolean CreaOrdine(int id, String cod,TerminaleInterface ter) {
        try {
            Tessera t = TesseraDAO.getTesseraByORMID(cod);
            Terminale origine=new Terminale();
            origine.setCodice(ter.getCodice());
            ProdottoInterface a = new AdapterProdotto();
            AdapterProdotto ap = new AdapterProdotto();
            ap = a.ottieniFilmOrdinato(id);
            if (ap != null) {
                Richiesta richiesta = new Richiesta();
                richiesta.setTessera(t);
                richiesta.setTitolo(ap.getTitolo());
                richiesta.setOrigine_noleggio(origine);
                richiesta.setAperto(false);
                Date data = new Date();
                richiesta.setFormato(ap.getFormato());
                richiesta.setFornitore(ap.getAdaptee().getFornitore().getNome());
                richiesta.setData_ordine(data);
                RichiestaDAO.save(richiesta);
                return true;
            } else {
                return false;
            }
        } catch (RemoteException ex) {
            Logger.getLogger(ControllerRicerca.class.getName()).log(Level.SEVERE, null, ex);
        } catch (PersistentException ex) {
            Logger.getLogger(ControllerRicerca.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    public ArrayList<RichiestaInterface> RiepilogoOrdini(String cod) {
        try {
            RichiestaCriteria criteria = new RichiestaCriteria();
            criteria.createTesseraCriteria().codice.eq(cod);
            Richiesta[] r = RichiestaDAO.listRichiestaByCriteria(criteria);
            ArrayList richieste = new ArrayList(Arrays.asList(r));
            return richieste;
        } catch (PersistentException ex) {
            Logger.getLogger(ControllerRicerca.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;


    } 

   public TerminaleInterface CaricaTerminale() throws RemoteException {

        Terminale  t=new Terminale();
        t.setCodice("1");
        return t;
    }


   

   

}

