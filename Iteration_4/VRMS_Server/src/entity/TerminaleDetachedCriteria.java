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

public class TerminaleDetachedCriteria extends AbstractORMDetachedCriteria {
	public final StringExpression codice;
	
	public TerminaleDetachedCriteria() {
		super(entity.Terminale.class, entity.TerminaleCriteria.class);
		codice = new StringExpression("codice", this.getDetachedCriteria());
	}
	
	public TerminaleDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, entity.TerminaleCriteria.class);
		codice = new StringExpression("codice", this.getDetachedCriteria());
	}
	
	public Terminale uniqueTerminale(PersistentSession session) {
		return (Terminale) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public Terminale[] listTerminale(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Terminale[]) list.toArray(new Terminale[list.size()]);
	}
}

