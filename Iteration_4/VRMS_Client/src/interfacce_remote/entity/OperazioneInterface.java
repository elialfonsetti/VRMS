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
public interface OperazioneInterface extends Remote{

        public int getID() throws RemoteException;

	public int getORMID()throws RemoteException;
	public void setAperto(boolean value) throws RemoteException;
	public boolean getAperto()throws RemoteException;

	public void setOrigine_noleggio(TerminaleInterface value)throws RemoteException;

	public TerminaleInterface getOrigine_noleggio() throws RemoteException;

	public void setTessera(TesseraInterface value)throws RemoteException;
	public TesseraInterface getTessera() throws RemoteException;
}
