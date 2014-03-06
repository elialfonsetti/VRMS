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

import interfacce_remote.entity.GenereInterface;
import java.io.Serializable;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
public class Genere extends UnicastRemoteObject implements Serializable, GenereInterface {
	public Genere() throws RemoteException{
	}
	
	public boolean equals(Object aObj) {
		if (aObj == this)
			return true;
		if (!(aObj instanceof Genere))
			return false;
		Genere genere = (Genere)aObj;
		if ((getNome() != null && !getNome().equals(genere.getNome())) || (getNome() == null && genere.getNome() != null))
			return false;
		return true;
	}
	
	public int hashCode() {
		int hashcode = 0;
		hashcode = hashcode + (getNome() == null ? 0 : getNome().hashCode());
		return hashcode;
	}
	
	private String nome;
	
	public void setNome(String value) {
		this.nome = value;
	}
	
	public String getNome() {
		return nome;
	}
	
	public String getORMID() {
		return getNome();
	}
	
	public String toString() {
		return String.valueOf(getNome());
	}
	
}
