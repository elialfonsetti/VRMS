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
public interface FormatoInterface extends Remote{



	public void setNome_formato(String value) throws RemoteException;

	public String getNome_formato() throws RemoteException;
	public String getORMID() throws RemoteException;

	public void setCosto(float value)throws RemoteException;

	public float getCosto()throws RemoteException;


	

}
