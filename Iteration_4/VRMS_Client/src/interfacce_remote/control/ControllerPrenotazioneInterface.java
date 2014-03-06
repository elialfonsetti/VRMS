/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package interfacce_remote.control;

import interfacce_remote.entity.ClienteInterface;
import interfacce_remote.entity.DescrizioneInterface;
import interfacce_remote.entity.FilmInterface;
import interfacce_remote.entity.TerminaleInterface;
import interfacce_remote.entity.TransizioneInterface;
import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.ArrayList;

/**
 *
 * @author Antonio
 */
public interface ControllerPrenotazioneInterface extends Remote {
     public String getFormato()throws Exception,RemoteException;
     public void setFormato(String Formato)throws Exception,RemoteException;
     public FilmInterface CercaCopia(int id_film) throws Exception,RemoteException;
     public int ConfermaPrenotazione(TransizioneInterface Transizione, ClienteInterface cliente, float costo) throws Exception,RemoteException;
     public TerminaleInterface CaricaTerminale()throws Exception,RemoteException;
     public java.util.ArrayList<FilmInterface> OttieniCopie(int iD) throws Exception,RemoteException;
     public DescrizioneInterface OttieniDescrizione(int iD) throws Exception,RemoteException;
     public ArrayList<TransizioneInterface> RiepilogoPrenotazioni(ClienteInterface cliente) throws Exception,RemoteException;
     public TransizioneInterface ottieniTransizione(int id)  throws Exception,RemoteException;
     public void RitiraPrenotazione(TransizioneInterface transizione, ClienteInterface cliente) throws Exception,RemoteException;
     public TransizioneInterface CaricaNoleggio(int id_Transizione) throws Exception,RemoteException;
     public ArrayList<TransizioneInterface> OttieniTransizioni(int iD, String formato) throws Exception,RemoteException;
     public TransizioneInterface NuovaTransizione()throws Exception,RemoteException;
}
