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

import interfacce_remote.entity.FormatoInterface;
import java.io.Serializable;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
public class Formato extends UnicastRemoteObject implements Serializable,FormatoInterface {
	
    public Formato() throws RemoteException{
	}
	
	public boolean equals(Object aObj) {
		if (aObj == this)
			return true;
		if (!(aObj instanceof Formato))
			return false;
		Formato formato = (Formato)aObj;
		if ((getNome_formato() != null && !getNome_formato().equals(formato.getNome_formato())) || (getNome_formato() == null && formato.getNome_formato() != null))
			return false;
		return true;
	}
	
	public int hashCode() {
		int hashcode = 0;
		hashcode = hashcode + (getNome_formato() == null ? 0 : getNome_formato().hashCode());
		return hashcode;
	}
	
	private java.util.Set this_getSet (int key) {
		if (key == entity.ORMConstants.KEY_FORMATO_FILMS) {
			return ORM_films;
		}
		
		return null;
	}
	
	org.orm.util.ORMAdapter _ormAdapter = new org.orm.util.AbstractORMAdapter() {
		public java.util.Set getSet(int key) {
			return this_getSet(key);
		}
		
	};
	
	private String nome_formato;
	
	private float costo;
	
	private java.util.Set ORM_films = new java.util.HashSet();
	
	public void setNome_formato(String value) {
		this.nome_formato = value;
	}
	
	public String getNome_formato() {
		return nome_formato;
	}
	
	public String getORMID() {
		return getNome_formato();
	}
	
	public void setCosto(float value) {
		this.costo = value;
	}
	
	public float getCosto() {
		return costo;
	}
	
	private void setORM_Films(java.util.Set value) {
		this.ORM_films = value;
	}
	
	private java.util.Set getORM_Films() {
		return ORM_films;
	}
	
	public final entity.FilmSetCollection films = new entity.FilmSetCollection(this, _ormAdapter, entity.ORMConstants.KEY_FORMATO_FILMS, entity.ORMConstants.KEY_FILM_FORMATO_FILM, entity.ORMConstants.KEY_MUL_ONE_TO_MANY);
	
	public String toString() {
		return String.valueOf(getNome_formato());
	}
	
}
