/**
 * "Visual Paradigm: DO NOT MODIFY THIS FILE!"
 * 
 * This is an automatic generated file. It will be regenerated every time 
 * you generate persistence class.
 * 
 * Modifying its content may cause the program not work, or your work may lost.
 */

/**
 * Licensee: DuKe TeAm
 * License Type: Purchased
 */
package entity;

import interfacce_remote.entity.DescrizioneInterface;
import interfacce_remote.entity.FilmInterface;
import interfacce_remote.entity.FormatoInterface;
import java.io.Serializable;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
public class Film extends UnicastRemoteObject implements Serializable,FilmInterface {
	public Film() throws RemoteException{
	}
	
	private void this_setOwner(Object owner, int key) {
		if (key == entity.ORMConstants.KEY_FILM_DESCRIZIONE_FILM) {
			this.descrizione_film = (entity.Descrizione) owner;
		}
		
		else if (key == entity.ORMConstants.KEY_FILM_FORMATO_FILM) {
			this.formato_film = (entity.Formato) owner;
		}
	}
	
	org.orm.util.ORMAdapter _ormAdapter = new org.orm.util.AbstractORMAdapter() {
		public void setOwner(Object owner, int key) {
			this_setOwner(owner, key);
		}
		
	};
	
	private int ID;
	
	private entity.Formato formato_film;
	
	private entity.Descrizione descrizione_film;
	
	private boolean disponibile;
	
	private void setID(int value) {
		this.ID = value;
	}
	
	public int getID() {
		return ID;
	}
	
	public int getORMID() {
		return getID();
	}
	
	public void setDisponibile(boolean value) {
		this.disponibile = value;
	}
	
	public boolean getDisponibile() {
		return disponibile;
	}
	
	public void setDescrizione_film(DescrizioneInterface value) {
		this.descrizione_film =(Descrizione) value;
	}
	
	public DescrizioneInterface getDescrizione_film() {
		return descrizione_film;
	}
	
	
	
	public FormatoInterface getFormato_film() {
		return formato_film;
	}
	
	/**
	 * This method is for internal use only.
	 */
	public void setORM_Formato_film(entity.Formato value) {
		this.formato_film = value;
	}
	
	private entity.Formato getORM_Formato_film() {
		return formato_film;
	}
	
	
	
	public String toString() {
		return String.valueOf(getID());
	}

    public void setFormato_film(FormatoInterface value) throws RemoteException {
        throw new UnsupportedOperationException("Not supported yet.");
    }
	
}
