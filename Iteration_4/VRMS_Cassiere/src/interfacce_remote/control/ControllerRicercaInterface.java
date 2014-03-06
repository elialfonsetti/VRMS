/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package interfacce_remote.control;



import interfacce_remote.entity.*;
import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.ArrayList;

/**
 *
 * @author Antonio
 */
public interface ControllerRicercaInterface extends Remote{
    public DescrizioneInterface getDesc(String codice)throws RemoteException;

    public void setDesc(DescrizioneInterface desc,String codice) throws RemoteException;
    public String getOrdine(String codice) throws RemoteException;
    public void setOrdine(String terminale, String titolo) throws RemoteException ;
    public java.util.ArrayList<DescrizioneInterface> caricaCatalogo() throws RemoteException;
    public java.util.ArrayList<GenereInterface> listaGeneri()  throws RemoteException;
    public java.util.ArrayList<DescrizioneInterface> elencoPerGenere(String g) throws RemoteException;
    public java.util.ArrayList<DescrizioneInterface> CercaFilm(String titolo, String genere) throws RemoteException;
    public DescrizioneInterface ottieniFilm(int id) throws RemoteException;
    public ProdottoInterface ottieniFilmOrdinato(int id) throws RemoteException;
    public ClienteInterface CaricaCliente(int n) throws RemoteException;
    public ArrayList<ProdottoInterface> CatalogoFilmOrdinabili (String text)throws RemoteException;
    public boolean CreaOrdine(int id, String cod,TerminaleInterface ter) throws RemoteException;
    public ArrayList<RichiestaInterface> RiepilogoOrdini(String cod) throws RemoteException;
    public TerminaleInterface CaricaTerminale() throws RemoteException;
}
