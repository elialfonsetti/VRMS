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
public interface FilmInterface extends Remote{

    public int getID() throws RemoteException;

	public int getORMID()throws RemoteException;
	public void setDisponibile(boolean value)throws RemoteException;

	public boolean getDisponibile() throws RemoteException;

	public void setDescrizione_film(DescrizioneInterface value)throws RemoteException;

	public DescrizioneInterface getDescrizione_film()throws RemoteException;

	public void setFormato_film(FormatoInterface value)throws RemoteException;

	public FormatoInterface getFormato_film() throws RemoteException;

	

}

