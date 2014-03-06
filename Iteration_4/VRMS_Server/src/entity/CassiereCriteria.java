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

public class CassiereCriteria extends AbstractORMCriteria {
	public final IntegerExpression ID;
	public final StringExpression nome;
	public final StringExpression cognome;
	public final StringExpression telefono;
	public final StringExpression PIN;
	
	public CassiereCriteria(Criteria criteria) {
		super(criteria);
		ID = new IntegerExpression("ID", this);
		nome = new StringExpression("nome", this);
		cognome = new StringExpression("cognome", this);
		telefono = new StringExpression("telefono", this);
		PIN = new StringExpression("PIN", this);
	}
	
	public CassiereCriteria(PersistentSession session) {
		this(session.createCriteria(Cassiere.class));
	}
	
	public CassiereCriteria() throws PersistentException {
		this(entity.ProvaSVNPersistentManager.instance().getSession());
	}
	
	public Cassiere uniqueCassiere() {
		return (Cassiere) super.uniqueResult();
	}
	
	public Cassiere[] listCassiere() {
		java.util.List list = super.list();
		return (Cassiere[]) list.toArray(new Cassiere[list.size()]);
	}
}

