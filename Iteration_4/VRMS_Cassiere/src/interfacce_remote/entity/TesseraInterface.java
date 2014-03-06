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
public interface TesseraInterface extends Remote {
public void setCodice(String value) throws RemoteException;

	public String getCodice()throws RemoteException;

	public String getORMID() throws RemoteException;

	public void setCredito(float value) throws RemoteException;

	public float getCredito() throws RemoteException;

	public void setAttiva(boolean value) throws RemoteException;

	public boolean getAttiva() throws RemoteException;

	public void setTipo_tariffa(String value)throws RemoteException;

	public String getTipo_tariffa()throws RemoteException;
}
