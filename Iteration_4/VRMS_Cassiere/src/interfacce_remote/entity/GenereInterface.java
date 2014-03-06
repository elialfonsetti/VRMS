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
public interface GenereInterface extends Remote{

    public void setNome(String value) throws RemoteException;

	public String getNome() throws RemoteException;

	public String getORMID() throws RemoteException;
}
