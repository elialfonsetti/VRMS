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

public class FornitoreCriteria extends AbstractORMCriteria {
	public final IntegerExpression ID;
	public final StringExpression nome;
	
	public FornitoreCriteria(Criteria criteria) {
		super(criteria);
		ID = new IntegerExpression("ID", this);
		nome = new StringExpression("nome", this);
	}
	
	public FornitoreCriteria(PersistentSession session) {
		this(session.createCriteria(Fornitore.class));
	}
	
	public FornitoreCriteria() throws PersistentException {
		this(entity.ProvaSVNPersistentManager.instance().getSession());
	}
	
	public Fornitore uniqueFornitore() {
		return (Fornitore) super.uniqueResult();
	}
	
	public Fornitore[] listFornitore() {
		java.util.List list = super.list();
		return (Fornitore[]) list.toArray(new Fornitore[list.size()]);
	}
}

