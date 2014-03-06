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

import interfacce_remote.entity.TesseraInterface;
import java.io.Serializable;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
public class Tessera extends UnicastRemoteObject implements Serializable, TesseraInterface {
	public Tessera() throws RemoteException{
	}
	
	public boolean equals(Object aObj) {
		if (aObj == this)
			return true;
		if (!(aObj instanceof Tessera))
			return false;
		Tessera tessera = (Tessera)aObj;
		if ((getCodice() != null && !getCodice().equals(tessera.getCodice())) || (getCodice() == null && tessera.getCodice() != null))
			return false;
		return true;
	}
	
	public int hashCode() {
		int hashcode = 0;
		hashcode = hashcode + (getCodice() == null ? 0 : getCodice().hashCode());
		return hashcode;
	}
	
	private String codice;
	
	private float credito;
	
	private boolean attiva;
	
	private String tipo_tariffa;
	
	public void setCodice(String value) {
		this.codice = value;
	}
	
	public String getCodice() {
		return codice;
	}
	
	public String getORMID() {
		return getCodice();
	}
	
	public void setCredito(float value) {
		this.credito = value;
	}
	
	public float getCredito() {
		return credito;
	}
	
	public void setAttiva(boolean value) {
		this.attiva = value;
	}
	
	public boolean getAttiva() {
		return attiva;
	}
	
	public void setTipo_tariffa(String value) {
		this.tipo_tariffa = value;
	}
	
	public String getTipo_tariffa() {
		return tipo_tariffa;
	}
	
	public String toString() {
		return String.valueOf(getCodice());
	}
	
}
