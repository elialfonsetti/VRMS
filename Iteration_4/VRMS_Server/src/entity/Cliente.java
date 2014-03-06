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

import interfacce_remote.entity.ClienteInterface;
import interfacce_remote.entity.TesseraInterface;
import java.io.Serializable;
import java.rmi.RemoteException;
public class Cliente extends entity.Utente implements Serializable, ClienteInterface {
	public Cliente() throws RemoteException {
	}
	
	private entity.Tessera tessera_personale;
	
	private String id_card;
	
	private String email;
	
	public void setId_card(String value) {
		this.id_card = value;
	}
	
	public String getId_card() {
		return id_card;
	}
	
	public void setEmail(String value) {
		this.email = value;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setTessera_personale(TesseraInterface value) {
		this.tessera_personale = (Tessera) value;
	}
	
	public TesseraInterface getTessera_personale() {
		return tessera_personale;
	}
	
	public String toString() {
		return super.toString();
	}

   
	
}
