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

public class TesseraDetachedCriteria extends AbstractORMDetachedCriteria {
	public final StringExpression codice;
	public final FloatExpression credito;
	public final BooleanExpression attiva;
	public final StringExpression tipo_tariffa;
	
	public TesseraDetachedCriteria() {
		super(entity.Tessera.class, entity.TesseraCriteria.class);
		codice = new StringExpression("codice", this.getDetachedCriteria());
		credito = new FloatExpression("credito", this.getDetachedCriteria());
		attiva = new BooleanExpression("attiva", this.getDetachedCriteria());
		tipo_tariffa = new StringExpression("tipo_tariffa", this.getDetachedCriteria());
	}
	
	public TesseraDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, entity.TesseraCriteria.class);
		codice = new StringExpression("codice", this.getDetachedCriteria());
		credito = new FloatExpression("credito", this.getDetachedCriteria());
		attiva = new BooleanExpression("attiva", this.getDetachedCriteria());
		tipo_tariffa = new StringExpression("tipo_tariffa", this.getDetachedCriteria());
	}
	
	public Tessera uniqueTessera(PersistentSession session) {
		return (Tessera) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public Tessera[] listTessera(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Tessera[]) list.toArray(new Tessera[list.size()]);
	}
}

