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

public class DescrizioneCriteria extends AbstractORMCriteria {
	public final IntegerExpression ID;
	public final StringExpression titolo;
	public final StringExpression durata;
	public final IntegerExpression anno;
	public final FloatExpression costo;
	public final StringExpression locandina;
	public final StringExpression trama;
	public final BooleanExpression consigliato;
	
	public DescrizioneCriteria(Criteria criteria) {
		super(criteria);
		ID = new IntegerExpression("ID", this);
		titolo = new StringExpression("titolo", this);
		durata = new StringExpression("durata", this);
		anno = new IntegerExpression("anno", this);
		costo = new FloatExpression("costo", this);
		locandina = new StringExpression("locandina", this);
		trama = new StringExpression("trama", this);
		consigliato = new BooleanExpression("consigliato", this);
	}
	
	public DescrizioneCriteria(PersistentSession session) {
		this(session.createCriteria(Descrizione.class));
	}
	
	public DescrizioneCriteria() throws PersistentException {
		this(entity.ProvaSVNPersistentManager.instance().getSession());
	}
	
	public GenereCriteria createGenereCriteria() {
		return new GenereCriteria(createCriteria("genere"));
	}
	
	public Descrizione uniqueDescrizione() {
		return (Descrizione) super.uniqueResult();
	}
	
	public Descrizione[] listDescrizione() {
		java.util.List list = super.list();
		return (Descrizione[]) list.toArray(new Descrizione[list.size()]);
	}
}

