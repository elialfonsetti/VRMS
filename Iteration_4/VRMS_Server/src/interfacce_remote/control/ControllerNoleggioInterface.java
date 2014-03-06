/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package interfacce_remote.control;

import entity.Terminale;
import interfacce_remote.entity.ClienteInterface;
import interfacce_remote.entity.DescrizioneInterface;
import interfacce_remote.entity.FilmInterface;
import interfacce_remote.entity.FormatoInterface;
import interfacce_remote.entity.TerminaleInterface;
import interfacce_remote.entity.TransizioneInterface;
import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Antonio
 */
public interface ControllerNoleggioInterface extends Remote{

   public TransizioneInterface getNoleggio(String terminale) throws  Exception,RemoteException;
   public void setNoleggio(TransizioneInterface noleggio,String terminale) throws  Exception,RemoteException;
   public void setClienteNoleggio(ClienteInterface c,String terminale)  throws  Exception,RemoteException;
   public java.util.ArrayList<FilmInterface> OttieniCopie(int iD)  throws  Exception,RemoteException;
   public ArrayList<FormatoInterface> OttieniFormati(int iD)  throws  Exception,RemoteException;
   public DescrizioneInterface OttieniDescrizione(int iD) throws  Exception,RemoteException;
   public float OttieniCostoFormato(String combo) throws  Exception,RemoteException;
   public float CalcolaTotale(String codice,TransizioneInterface t ,int giorni ) throws  Exception,RemoteException;
   public float CalcolaAggiuntaRestituzione(TransizioneInterface copia ,int giorni) throws  Exception,RemoteException;
   public TerminaleInterface CaricaTerminale() throws  Exception,RemoteException;



    public ClienteInterface CaricaCliente(int n) throws  Exception,RemoteException;

    public void ConfermaNoleggio(String codice,TransizioneInterface Transizione, float costo) throws  Exception,RemoteException;
    public FilmInterface CercaCopia(int id_film) throws  Exception,RemoteException;
    public TransizioneInterface CercaNoleggio(int id_copia)  throws  Exception,RemoteException;

    public void ChiudiNoleggio(TransizioneInterface transizione, ClienteInterface cliente)  throws Exception, RemoteException;

    public boolean CheckTransizioni(int id_film) throws  Exception,RemoteException;

    public TransizioneInterface NuovaTransizione()throws  Exception,RemoteException;

    public void BloccaCopia(String codice,int r)throws  Exception,RemoteException;

    public boolean ControllaCopia(FilmInterface get)throws  Exception,RemoteException;




}
