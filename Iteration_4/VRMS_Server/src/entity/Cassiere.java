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

import interfacce_remote.entity.CassiereInterface;
import java.io.Serializable;
import java.rmi.RemoteException;
public class Cassiere extends entity.Utente implements Serializable, CassiereInterface {
	public Cassiere()throws RemoteException {
	}
	
	private String PIN;
	
	public void setPIN(String value) {
		this.PIN = value;
	}
	
	public String getPIN() {
		return PIN;
	}
	
	public String toString() {
		return super.toString();
	}
	
}
