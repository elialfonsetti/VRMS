/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package interfacce_remote.entity;


import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 *
 * @author Antonio
 */
public interface TransizioneInterface extends OperazioneInterface {

       public PagamentoInterface getPagamento_strategy() throws RemoteException;

      

	public void setData_inizio(java.util.Date value) throws RemoteException;
	public java.util.Date getData_inizio() throws RemoteException;

	public void setData_fine(java.util.Date value) throws RemoteException;

	public java.util.Date getData_fine()throws RemoteException;

	public void setTipo(String value)  throws RemoteException;

	public String getTipo()throws RemoteException;

	public void setCosto_totale(float value) throws RemoteException;

	public float getCosto_totale()throws RemoteException;

	public void setFilm_noleggiato(FilmInterface value)throws RemoteException;

	public FilmInterface getFilm_noleggiato() throws RemoteException;

}
