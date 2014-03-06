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

public class TerminaleCriteria extends AbstractORMCriteria {
	public final StringExpression codice;
	
	public TerminaleCriteria(Criteria criteria) {
		super(criteria);
		codice = new StringExpression("codice", this);
	}
	
	public TerminaleCriteria(PersistentSession session) {
		this(session.createCriteria(Terminale.class));
	}
	
	public TerminaleCriteria() throws PersistentException {
		this(entity.ProvaSVNPersistentManager.instance().getSession());
	}
	
	public Terminale uniqueTerminale() {
		return (Terminale) super.uniqueResult();
	}
	
	public Terminale[] listTerminale() {
		java.util.List list = super.list();
		return (Terminale[]) list.toArray(new Terminale[list.size()]);
	}
}

