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

public class OperazioneCriteria extends AbstractORMCriteria {
	public final IntegerExpression ID;
	public final BooleanExpression aperto;
	
	public OperazioneCriteria(Criteria criteria) {
		super(criteria);
		ID = new IntegerExpression("ID", this);
		aperto = new BooleanExpression("aperto", this);
	}
	
	public OperazioneCriteria(PersistentSession session) {
		this(session.createCriteria(Operazione.class));
	}
	
	public OperazioneCriteria() throws PersistentException {
		this(entity.ProvaSVNPersistentManager.instance().getSession());
	}
	
	public TesseraCriteria createTesseraCriteria() {
		return new TesseraCriteria(createCriteria("tessera"));
	}
	
	public TerminaleCriteria createOrigine_noleggioCriteria() {
		return new TerminaleCriteria(createCriteria("origine_noleggio"));
	}
	
	public Operazione uniqueOperazione() {
		return (Operazione) super.uniqueResult();
	}
	
	public Operazione[] listOperazione() {
		java.util.List list = super.list();
		return (Operazione[]) list.toArray(new Operazione[list.size()]);
	}
}

