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

import java.util.List;
import org.hibernate.criterion.DetachedCriteria;
import org.orm.PersistentSession;
import org.orm.criteria.*;

public class ProdottoFornitoreDetachedCriteria extends AbstractORMDetachedCriteria {
	public final StringExpression nome;
	public final IntegerExpression ID;
	public final IntegerExpression tempo;
	public final StringExpression genere;
	public final StringExpression supporto;
	public final IntegerExpression anno_produzione;
	
	public ProdottoFornitoreDetachedCriteria() {
		super(entity.ProdottoFornitore.class, entity.ProdottoFornitoreCriteria.class);
		nome = new StringExpression("nome", this.getDetachedCriteria());
		ID = new IntegerExpression("ID", this.getDetachedCriteria());
		tempo = new IntegerExpression("tempo", this.getDetachedCriteria());
		genere = new StringExpression("genere", this.getDetachedCriteria());
		supporto = new StringExpression("supporto", this.getDetachedCriteria());
		anno_produzione = new IntegerExpression("anno_produzione", this.getDetachedCriteria());
	}
	
	public ProdottoFornitoreDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, entity.ProdottoFornitoreCriteria.class);
		nome = new StringExpression("nome", this.getDetachedCriteria());
		ID = new IntegerExpression("ID", this.getDetachedCriteria());
		tempo = new IntegerExpression("tempo", this.getDetachedCriteria());
		genere = new StringExpression("genere", this.getDetachedCriteria());
		supporto = new StringExpression("supporto", this.getDetachedCriteria());
		anno_produzione = new IntegerExpression("anno_produzione", this.getDetachedCriteria());
	}
	
	public FornitoreDetachedCriteria createFornitoreCriteria() {
		return new FornitoreDetachedCriteria(createCriteria("fornitore"));
	}
	
	public ProdottoFornitore uniqueProdottoFornitore(PersistentSession session) {
		return (ProdottoFornitore) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public ProdottoFornitore[] listProdottoFornitore(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (ProdottoFornitore[]) list.toArray(new ProdottoFornitore[list.size()]);
	}
}

