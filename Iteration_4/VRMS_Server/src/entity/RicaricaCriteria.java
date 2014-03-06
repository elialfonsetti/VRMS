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

public class RicaricaCriteria extends AbstractORMCriteria {
	public final IntegerExpression ID;
	public final DateExpression data;
	public final FloatExpression ammontare;
	
	public RicaricaCriteria(Criteria criteria) {
		super(criteria);
		ID = new IntegerExpression("ID", this);
		data = new DateExpression("data", this);
		ammontare = new FloatExpression("ammontare", this);
	}
	
	public RicaricaCriteria(PersistentSession session) {
		this(session.createCriteria(Ricarica.class));
	}
	
	public RicaricaCriteria() throws PersistentException {
		this(entity.ProvaSVNPersistentManager.instance().getSession());
	}
	
	public TesseraCriteria createTesseraCriteria() {
		return new TesseraCriteria(createCriteria("tessera"));
	}
	
	public CassiereCriteria createCassiereCriteria() {
		return new CassiereCriteria(createCriteria("cassiere"));
	}
	
	public Ricarica uniqueRicarica() {
		return (Ricarica) super.uniqueResult();
	}
	
	public Ricarica[] listRicarica() {
		java.util.List list = super.list();
		return (Ricarica[]) list.toArray(new Ricarica[list.size()]);
	}
}

