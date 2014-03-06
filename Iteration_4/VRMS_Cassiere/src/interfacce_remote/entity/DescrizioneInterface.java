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
public interface DescrizioneInterface extends Remote {

    public int getID() throws RemoteException;

	public int getORMID() throws RemoteException;

	public void setTitolo(String value) throws RemoteException;

	public String getTitolo() throws RemoteException;

	public void setDurata(String value) throws RemoteException;

	public String getDurata() throws RemoteException;

	public void setAnno(int value) throws RemoteException;

	public int getAnno() throws RemoteException;

	public void setCosto(float value) throws RemoteException;

	public float getCosto() throws RemoteException;

	public void setLocandina(String value) throws RemoteException;

	public String getLocandina() throws RemoteException;

	public void setTrama(String value) throws RemoteException;

	public String getTrama() throws RemoteException;

	public void setGenere(GenereInterface value) throws RemoteException;

	public GenereInterface getGenere()throws RemoteException;

        public void setConsigliato(boolean value)throws RemoteException;
	public boolean getConsigliato()throws RemoteException;

}
