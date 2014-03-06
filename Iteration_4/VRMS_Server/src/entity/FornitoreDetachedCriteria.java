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

public class FornitoreDetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression ID;
	public final StringExpression nome;
	
	public FornitoreDetachedCriteria() {
		super(entity.Fornitore.class, entity.FornitoreCriteria.class);
		ID = new IntegerExpression("ID", this.getDetachedCriteria());
		nome = new StringExpression("nome", this.getDetachedCriteria());
	}
	
	public FornitoreDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, entity.FornitoreCriteria.class);
		ID = new IntegerExpression("ID", this.getDetachedCriteria());
		nome = new StringExpression("nome", this.getDetachedCriteria());
	}
	
	public Fornitore uniqueFornitore(PersistentSession session) {
		return (Fornitore) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public Fornitore[] listFornitore(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Fornitore[]) list.toArray(new Fornitore[list.size()]);
	}
}

