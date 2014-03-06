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
public interface CassiereInterface extends UtenteInterface {

    public void setPIN(String value) throws RemoteException;

	public String getPIN() throws RemoteException;

}
