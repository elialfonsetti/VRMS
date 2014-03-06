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
public class Magazzino implements Serializable {
	public Magazzino() {
	}
	
	private java.util.Set this_getSet (int key) {
		if (key == entity.ORMConstants.KEY_MAGAZZINO_LISTA_FILM___LIST_FILM_) {
			return ORM_lista_film___List_Film_;
		}
		
		return null;
	}
	
	org.orm.util.ORMAdapter _ormAdapter = new org.orm.util.AbstractORMAdapter() {
		public java.util.Set getSet(int key) {
			return this_getSet(key);
		}
		
	};
	
	private int ID;
	
	private String indirizzo;
	
	private java.util.Set ORM_lista_film___List_Film_ = new java.util.HashSet();
	
	private void setID(int value) {
		this.ID = value;
	}
	
	public int getID() {
		return ID;
	}
	
	public int getORMID() {
		return getID();
	}
	
	public void setIndirizzo(String value) {
		this.indirizzo = value;
	}
	
	public String getIndirizzo() {
		return indirizzo;
	}
	
	private void setORM_Lista_film___List_Film_(java.util.Set value) {
		this.ORM_lista_film___List_Film_ = value;
	}
	
	private java.util.Set getORM_Lista_film___List_Film_() {
		return ORM_lista_film___List_Film_;
	}
	
	public final entity.FilmSetCollection lista_film___List_Film_ = new entity.FilmSetCollection(this, _ormAdapter, entity.ORMConstants.KEY_MAGAZZINO_LISTA_FILM___LIST_FILM_, entity.ORMConstants.KEY_MUL_ONE_TO_MANY);
	
	public String toString() {
		return String.valueOf(getID());
	}
	
}
