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

import interfacce_remote.entity.TerminaleInterface;
import java.io.Serializable;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
public class Terminale extends UnicastRemoteObject implements Serializable, TerminaleInterface {
	public Terminale() throws RemoteException{
	}
	
	public boolean equals(Object aObj) {
		if (aObj == this)
			return true;
		if (!(aObj instanceof Terminale))
			return false;
		Terminale terminale = (Terminale)aObj;
		if ((getCodice() != null && !getCodice().equals(terminale.getCodice())) || (getCodice() == null && terminale.getCodice() != null))
			return false;
		return true;
	}
	
	public int hashCode() {
		int hashcode = 0;
		hashcode = hashcode + (getCodice() == null ? 0 : getCodice().hashCode());
		return hashcode;
	}
	
	private String codice;
	
	public void setCodice(String value) {
		this.codice = value;
	}
	
	public String getCodice() {
		return codice;
	}
	
	public String getORMID() {
		return getCodice();
	}
	
	public String toString() {
		return String.valueOf(getCodice());
	}
	
}
