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

import java.io.Serializable;
public class Ricarica implements Serializable {
	public Ricarica() {
	}
	
	private int ID;
	
	private entity.Tessera tessera;
	
	private entity.Cassiere cassiere;
	
	private java.util.Date data;
	
	private float ammontare;
	
	private void setID(int value) {
		this.ID = value;
	}
	
	public int getID() {
		return ID;
	}
	
	public int getORMID() {
		return getID();
	}
	
	public void setData(java.util.Date value) {
		this.data = value;
	}
	
	public java.util.Date getData() {
		return data;
	}
	
	public void setAmmontare(float value) {
		this.ammontare = value;
	}
	
	public float getAmmontare() {
		return ammontare;
	}
	
	public void setCassiere(entity.Cassiere value) {
		this.cassiere = value;
	}
	
	public entity.Cassiere getCassiere() {
		return cassiere;
	}
	
	public void setTessera(entity.Tessera value) {
		this.tessera = value;
	}
	
	public entity.Tessera getTessera() {
		return tessera;
	}
	
	public String toString() {
		return String.valueOf(getID());
	}
	
}
