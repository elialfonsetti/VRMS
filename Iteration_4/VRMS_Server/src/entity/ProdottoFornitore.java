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
import java.util.ArrayList;
import java.util.Arrays;
import org.orm.PersistentException;
public class ProdottoFornitore implements Serializable {
	public ProdottoFornitore() {
	}
	
	public boolean equals(Object aObj) {
		if (aObj == this)
			return true;
		if (!(aObj instanceof ProdottoFornitore))
			return false;
		ProdottoFornitore prodottofornitore = (ProdottoFornitore)aObj;
		if ((getNome() != null && !getNome().equals(prodottofornitore.getNome())) || (getNome() == null && prodottofornitore.getNome() != null))
			return false;
		return true;
	}
	
	public int hashCode() {
		int hashcode = 0;
		hashcode = hashcode + (getNome() == null ? 0 : getNome().hashCode());
		return hashcode;
	}
	
	private String nome;
	
	private entity.Fornitore fornitore;
	
	private int ID;
	
	private int tempo;
	
	private String genere;
	
	private String supporto;
	
	private int anno_produzione;
	
	public void setID(int value) {
		this.ID = value;
	}
	
	public int getID() {
		return ID;
	}
	
	public void setNome(String value) {
		this.nome = value;
	}
	
	public String getNome() {
		return nome;
	}
	
	public String getORMID() {
		return getNome();
	}
	
	public void setTempo(int value) {
		this.tempo = value;
	}
	
	public int getTempo() {
		return tempo;
	}
	
	public void setGenere(String value) {
		this.genere = value;
	}
	
	public String getGenere() {
		return genere;
	}
	
	public void setSupporto(String value) {
		this.supporto = value;
	}
	
	public String getSupporto() {
		return supporto;
	}
	
	public void setAnno_produzione(int value) {
		this.anno_produzione = value;
	}
	
	public int getAnno_produzione() {
		return anno_produzione;
	}
	
	public void setFornitore(entity.Fornitore value) {
		this.fornitore = value;
	}
	
	public entity.Fornitore getFornitore() {
		return fornitore;
	}
	
	public String toString() {
		return String.valueOf(getNome());
	}

    public ProdottoFornitore ottieniFilm(int id) throws PersistentException {
        ProdottoFornitoreCriteria criteria = new ProdottoFornitoreCriteria();
        criteria.ID.eq(id);
        ProdottoFornitore pf = ProdottoFornitoreDAO.loadProdottoFornitoreByCriteria(criteria);
        return pf;
    }

    public ArrayList<ProdottoFornitore> CatalogoFilm(String text)throws PersistentException {
         ProdottoFornitoreCriteria criteria;
         criteria = new ProdottoFornitoreCriteria();
         criteria.nome.like("%"+text +"%");
         ProdottoFornitore [] p = ProdottoFornitoreDAO.listProdottoFornitoreByCriteria(criteria);
         ArrayList<ProdottoFornitore> ap = new ArrayList(Arrays.asList(p));
         return ap;
     
    }
	
}
