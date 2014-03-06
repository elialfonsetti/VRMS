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

import interfacce_remote.entity.FilmInterface;
import interfacce_remote.entity.PagamentoInterface;
import interfacce_remote.entity.TransizioneInterface;
import java.io.Serializable;
import java.rmi.RemoteException;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.orm.PersistentException;
public class Transizione extends entity.Operazione implements Serializable,TransizioneInterface {
	public Transizione() throws RemoteException{
	}
	
	private entity.Film film_noleggiato;
	
	private java.util.Date data_inizio;
	
	private java.util.Date data_fine;
	
	private String tipo;
	
	private float costo_totale;

        private Terminale origine_noleggio;

        private PagamentoInterface pagamento_strategy;

    public Terminale getOrigine_noleggio() {
        return origine_noleggio;
    }

    public void setOrigine_noleggio(Terminale origine_noleggio) {
        this.origine_noleggio = origine_noleggio;
    }


        public PagamentoInterface getPagamento_strategy() {
        return  pagamento_strategy;
         }


        public void setPagamento_strategy(PagamentoInterface pagamento_strategy) {
        this.pagamento_strategy = pagamento_strategy;
         }
	
	public void setData_inizio(java.util.Date value) {
		this.data_inizio = value;
	}
	
	public java.util.Date getData_inizio() {
		return data_inizio;
	}
	
	public void setData_fine(java.util.Date value) {
		this.data_fine = value;
	}
	
	public java.util.Date getData_fine() {
		return data_fine;
	}
	
	public void setTipo(String value) {
		this.tipo = value;
	}
	public String getTipo() {
		return tipo;
	}
	
	public void setCosto_totale(float value) {
		this.costo_totale = value;
	}
	
	public float getCosto_totale() {
		return costo_totale;
	}
	
	public void setFilm_noleggiato(FilmInterface value) throws RemoteException {
        try {
            this.film_noleggiato = FilmDAO.loadFilmByORMID(value.getORMID());
        } catch (PersistentException ex) {
            Logger.getLogger(Transizione.class.getName()).log(Level.SEVERE, null, ex);
        }
	}
	
	public Film getFilm_noleggiato() throws RemoteException {
               
		return film_noleggiato;
	}
	
	public String toString() {
		return super.toString();
	}

       public float CalcolaCosto(int n) throws RemoteException {
          return pagamento_strategy.CalcolaCosto(this.film_noleggiato.getDescrizione_film(), this.film_noleggiato.getFormato_film(), n);

    }
	
}
