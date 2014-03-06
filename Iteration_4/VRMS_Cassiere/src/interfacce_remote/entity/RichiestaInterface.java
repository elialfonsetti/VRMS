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
public interface RichiestaInterface extends OperazioneInterface{

    public java.util.Date getData_ordine() throws RemoteException;

	public void setTitolo(String value) throws RemoteException;

	public String getTitolo()throws RemoteException;

	public void setFornitore(String value) throws RemoteException;

	public String getFornitore() throws RemoteException;

	public void setFormato(String value) throws RemoteException;

	public String getFormato() throws RemoteException;

}
