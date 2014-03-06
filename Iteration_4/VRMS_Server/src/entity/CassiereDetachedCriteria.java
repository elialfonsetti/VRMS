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

public class CassiereDetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression ID;
	public final StringExpression nome;
	public final StringExpression cognome;
	public final StringExpression telefono;
	public final StringExpression PIN;
	
	public CassiereDetachedCriteria() {
		super(entity.Cassiere.class, entity.CassiereCriteria.class);
		ID = new IntegerExpression("ID", this.getDetachedCriteria());
		nome = new StringExpression("nome", this.getDetachedCriteria());
		cognome = new StringExpression("cognome", this.getDetachedCriteria());
		telefono = new StringExpression("telefono", this.getDetachedCriteria());
		PIN = new StringExpression("PIN", this.getDetachedCriteria());
	}
	
	public CassiereDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, entity.CassiereCriteria.class);
		ID = new IntegerExpression("ID", this.getDetachedCriteria());
		nome = new StringExpression("nome", this.getDetachedCriteria());
		cognome = new StringExpression("cognome", this.getDetachedCriteria());
		telefono = new StringExpression("telefono", this.getDetachedCriteria());
		PIN = new StringExpression("PIN", this.getDetachedCriteria());
	}
	
	public Cassiere uniqueCassiere(PersistentSession session) {
		return (Cassiere) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public Cassiere[] listCassiere(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Cassiere[]) list.toArray(new Cassiere[list.size()]);
	}
}

