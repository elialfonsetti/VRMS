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

public class RichiestaCriteria extends AbstractORMCriteria {
	public final IntegerExpression ID;
	public final BooleanExpression aperto;
	public final DateExpression data_ordine;
	public final StringExpression titolo;
	public final StringExpression fornitore;
	public final StringExpression formato;
	
	public RichiestaCriteria(Criteria criteria) {
		super(criteria);
		ID = new IntegerExpression("ID", this);
		aperto = new BooleanExpression("aperto", this);
		data_ordine = new DateExpression("data_ordine", this);
		titolo = new StringExpression("titolo", this);
		fornitore = new StringExpression("fornitore", this);
		formato = new StringExpression("formato", this);
	}
	
	public RichiestaCriteria(PersistentSession session) {
		this(session.createCriteria(Richiesta.class));
	}
	
	public RichiestaCriteria() throws PersistentException {
		this(entity.ProvaSVNPersistentManager.instance().getSession());
	}
	
	public TesseraCriteria createTesseraCriteria() {
		return new TesseraCriteria(createCriteria("tessera"));
	}
	
	public TerminaleCriteria createOrigine_noleggioCriteria() {
		return new TerminaleCriteria(createCriteria("origine_noleggio"));
	}
	
	public Richiesta uniqueRichiesta() {
		return (Richiesta) super.uniqueResult();
	}
	
	public Richiesta[] listRichiesta() {
		java.util.List list = super.list();
		return (Richiesta[]) list.toArray(new Richiesta[list.size()]);
	}
}

