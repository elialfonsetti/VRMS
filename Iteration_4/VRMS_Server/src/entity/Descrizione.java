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
import interfacce_remote.entity.GenereInterface;
import java.io.Serializable;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
public class Descrizione extends UnicastRemoteObject implements Serializable,DescrizioneInterface {
	public Descrizione() throws RemoteException{
	}
	
	private int ID;
	
	private entity.Genere genere;
	
	private String titolo;
	
	private String durata;
	
	private int anno;
	
	private float costo;
	
	private String locandina;
	
	private String trama;
	
	private boolean consigliato;
	
	private void setID(int value) {
		this.ID = value;
	}
	
	public int getID() {
		return ID;
	}
	
	public int getORMID() {
		return getID();
	}
	
	public void setTitolo(String value) {
		this.titolo = value;
	}
	
	public String getTitolo() {
		return titolo;
	}
	
	public void setDurata(String value) {
		this.durata = value;
	}
	
	public String getDurata() {
		return durata;
	}
	
	public void setAnno(int value) {
		this.anno = value;
	}
	
	public int getAnno() {
		return anno;
	}
	
	public void setCosto(float value) {
		this.costo = value;
	}
	
	public float getCosto() {
		return costo;
	}
	
	public void setLocandina(String value) {
		this.locandina = value;
	}
	
	public String getLocandina() {
		return locandina;
	}
	
	public void setTrama(String value) {
		this.trama = value;
	}
	
	public String getTrama() {
		return trama;
	}
	
	public void setConsigliato(boolean value) {
		this.consigliato = value;
	}
	
	public boolean getConsigliato() {
		return consigliato;
	}
	
	public void setGenere(GenereInterface value) {
		this.genere = (Genere)value;
	}
	
	public GenereInterface getGenere() {
		return genere;
	}
	
	public String toString() {
		return String.valueOf(getID());
	}
	
}
