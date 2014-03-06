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
public interface ClienteInterface extends UtenteInterface, Remote{


        public void setId_card(String value)throws RemoteException;
	public String getId_card()throws RemoteException;
	public void setEmail(String value)throws RemoteException;
	public String getEmail()throws RemoteException;

        public void setTessera_personale(TesseraInterface value) throws RemoteException;

	public TesseraInterface getTessera_personale() throws RemoteException;
	





}
