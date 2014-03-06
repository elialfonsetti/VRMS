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

public class DescrizioneDetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression ID;
	public final StringExpression titolo;
	public final StringExpression durata;
	public final IntegerExpression anno;
	public final FloatExpression costo;
	public final StringExpression locandina;
	public final StringExpression trama;
	public final BooleanExpression consigliato;
	
	public DescrizioneDetachedCriteria() {
		super(entity.Descrizione.class, entity.DescrizioneCriteria.class);
		ID = new IntegerExpression("ID", this.getDetachedCriteria());
		titolo = new StringExpression("titolo", this.getDetachedCriteria());
		durata = new StringExpression("durata", this.getDetachedCriteria());
		anno = new IntegerExpression("anno", this.getDetachedCriteria());
		costo = new FloatExpression("costo", this.getDetachedCriteria());
		locandina = new StringExpression("locandina", this.getDetachedCriteria());
		trama = new StringExpression("trama", this.getDetachedCriteria());
		consigliato = new BooleanExpression("consigliato", this.getDetachedCriteria());
	}
	
	public DescrizioneDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, entity.DescrizioneCriteria.class);
		ID = new IntegerExpression("ID", this.getDetachedCriteria());
		titolo = new StringExpression("titolo", this.getDetachedCriteria());
		durata = new StringExpression("durata", this.getDetachedCriteria());
		anno = new IntegerExpression("anno", this.getDetachedCriteria());
		costo = new FloatExpression("costo", this.getDetachedCriteria());
		locandina = new StringExpression("locandina", this.getDetachedCriteria());
		trama = new StringExpression("trama", this.getDetachedCriteria());
		consigliato = new BooleanExpression("consigliato", this.getDetachedCriteria());
	}
	
	public GenereDetachedCriteria createGenereCriteria() {
		return new GenereDetachedCriteria(createCriteria("genere"));
	}
	
	public Descrizione uniqueDescrizione(PersistentSession session) {
		return (Descrizione) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public Descrizione[] listDescrizione(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Descrizione[]) list.toArray(new Descrizione[list.size()]);
	}
}

