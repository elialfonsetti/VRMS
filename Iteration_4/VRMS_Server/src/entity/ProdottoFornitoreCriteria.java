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

import org.hibernate.Criteria;
import org.orm.PersistentException;
import org.orm.PersistentSession;
import org.orm.criteria.*;

public class ProdottoFornitoreCriteria extends AbstractORMCriteria {
	public final StringExpression nome;
	public final IntegerExpression ID;
	public final IntegerExpression tempo;
	public final StringExpression genere;
	public final StringExpression supporto;
	public final IntegerExpression anno_produzione;
	
	public ProdottoFornitoreCriteria(Criteria criteria) {
		super(criteria);
		nome = new StringExpression("nome", this);
		ID = new IntegerExpression("ID", this);
		tempo = new IntegerExpression("tempo", this);
		genere = new StringExpression("genere", this);
		supporto = new StringExpression("supporto", this);
		anno_produzione = new IntegerExpression("anno_produzione", this);
	}
	
	public ProdottoFornitoreCriteria(PersistentSession session) {
		this(session.createCriteria(ProdottoFornitore.class));
	}
	
	public ProdottoFornitoreCriteria() throws PersistentException {
		this(entity.ProvaSVNPersistentManager.instance().getSession());
	}
	
	public FornitoreCriteria createFornitoreCriteria() {
		return new FornitoreCriteria(createCriteria("fornitore"));
	}
	
	public ProdottoFornitore uniqueProdottoFornitore() {
		return (ProdottoFornitore) super.uniqueResult();
	}
	
	public ProdottoFornitore[] listProdottoFornitore() {
		java.util.List list = super.list();
		return (ProdottoFornitore[]) list.toArray(new ProdottoFornitore[list.size()]);
	}
}

