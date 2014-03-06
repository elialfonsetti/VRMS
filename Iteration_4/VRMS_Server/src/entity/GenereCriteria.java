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

public class GenereCriteria extends AbstractORMCriteria {
	public final StringExpression nome;
	
	public GenereCriteria(Criteria criteria) {
		super(criteria);
		nome = new StringExpression("nome", this);
	}
	
	public GenereCriteria(PersistentSession session) {
		this(session.createCriteria(Genere.class));
	}
	
	public GenereCriteria() throws PersistentException {
		this(entity.ProvaSVNPersistentManager.instance().getSession());
	}
	
	public Genere uniqueGenere() {
		return (Genere) super.uniqueResult();
	}
	
	public Genere[] listGenere() {
		java.util.List list = super.list();
		return (Genere[]) list.toArray(new Genere[list.size()]);
	}
}

