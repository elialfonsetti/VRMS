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
public interface UtenteInterface extends Remote{


         public int getID() throws RemoteException;
	public void setNome(String value) throws RemoteException;

	public String getNome() throws RemoteException;

	public void setCognome(String value)throws RemoteException;

	public String getCognome() throws RemoteException;

	public void setTelefono(String value) throws RemoteException;

	public String getTelefono() throws RemoteException;
}
