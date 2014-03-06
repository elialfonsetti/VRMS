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

public class TesseraCriteria extends AbstractORMCriteria {
	public final StringExpression codice;
	public final FloatExpression credito;
	public final BooleanExpression attiva;
	public final StringExpression tipo_tariffa;
	
	public TesseraCriteria(Criteria criteria) {
		super(criteria);
		codice = new StringExpression("codice", this);
		credito = new FloatExpression("credito", this);
		attiva = new BooleanExpression("attiva", this);
		tipo_tariffa = new StringExpression("tipo_tariffa", this);
	}
	
	public TesseraCriteria(PersistentSession session) {
		this(session.createCriteria(Tessera.class));
	}
	
	public TesseraCriteria() throws PersistentException {
		this(entity.ProvaSVNPersistentManager.instance().getSession());
	}
	
	public Tessera uniqueTessera() {
		return (Tessera) super.uniqueResult();
	}
	
	public Tessera[] listTessera() {
		java.util.List list = super.list();
		return (Tessera[]) list.toArray(new Tessera[list.size()]);
	}
}

