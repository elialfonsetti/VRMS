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

public class GenereDetachedCriteria extends AbstractORMDetachedCriteria {
	public final StringExpression nome;
	
	public GenereDetachedCriteria() {
		super(entity.Genere.class, entity.GenereCriteria.class);
		nome = new StringExpression("nome", this.getDetachedCriteria());
	}
	
	public GenereDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, entity.GenereCriteria.class);
		nome = new StringExpression("nome", this.getDetachedCriteria());
	}
	
	public Genere uniqueGenere(PersistentSession session) {
		return (Genere) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public Genere[] listGenere(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Genere[]) list.toArray(new Genere[list.size()]);
	}
}

