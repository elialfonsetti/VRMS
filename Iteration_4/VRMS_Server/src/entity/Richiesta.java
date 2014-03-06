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

import interfacce_remote.entity.RichiestaInterface;
import java.io.Serializable;
import java.rmi.RemoteException;
public class Richiesta extends entity.Operazione implements Serializable, RichiestaInterface {
	public Richiesta() throws RemoteException{
	}
	
	private java.util.Date data_ordine;
	
	private String titolo;
	
	private String fornitore;
	
	private String formato;
	
	public void setData_ordine(java.util.Date value) {
		this.data_ordine = value;
	}
	
	public java.util.Date getData_ordine() {
		return data_ordine;
	}
	
	public void setTitolo(String value) {
		this.titolo = value;
	}
	
	public String getTitolo() {
		return titolo;
	}
	
	public void setFornitore(String value) {
		this.fornitore = value;
	}
	
	public String getFornitore() {
		return fornitore;
	}
	
	public void setFormato(String value) {
		this.formato = value;
	}
	
	public String getFormato() {
		return formato;
	}
	
	public String toString() {
		return super.toString();
	}
	
}
