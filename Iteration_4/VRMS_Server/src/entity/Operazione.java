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

import interfacce_remote.entity.OperazioneInterface;
import interfacce_remote.entity.TerminaleInterface;
import interfacce_remote.entity.TesseraInterface;
import java.io.Serializable;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.orm.PersistentException;
public class Operazione extends UnicastRemoteObject implements Serializable,OperazioneInterface{
	public Operazione() throws RemoteException {
	}
	
	private int ID;
	
	private entity.Tessera tessera;
	
	private entity.Terminale origine_noleggio;
	
	private boolean aperto;
	
	private void setID(int value) {
		this.ID = value;
	}
	
	public int getID() {
		return ID;
	}
	
	public int getORMID() {
		return getID();
	}
	
	public void setAperto(boolean value) {
		this.aperto = value;
	}
	
	public boolean getAperto() {
		return aperto;
	}
	
	public void setOrigine_noleggio(TerminaleInterface value) {
        try {
            Terminale t = new Terminale();
            t.setCodice(value.getCodice());
            this.origine_noleggio = t;
        } catch (RemoteException ex) {
            Logger.getLogger(Operazione.class.getName()).log(Level.SEVERE, null, ex);
        }
	}
	
	public TerminaleInterface getOrigine_noleggio() {
		return origine_noleggio;
	}
	
	public void setTessera(TesseraInterface value) throws RemoteException {
        try {
            this.tessera = TesseraDAO.loadTesseraByORMID(value.getORMID());
        } catch (PersistentException ex) {
            Logger.getLogger(Operazione.class.getName()).log(Level.SEVERE, null, ex);
        }
	}
	
	public TesseraInterface getTessera() {
		return tessera;
	}
	
	public String toString() {
		return String.valueOf(getID());
	}

    
	
}
