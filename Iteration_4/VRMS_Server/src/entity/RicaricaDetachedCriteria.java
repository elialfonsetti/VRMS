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

public class RicaricaDetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression ID;
	public final DateExpression data;
	public final FloatExpression ammontare;
	
	public RicaricaDetachedCriteria() {
		super(entity.Ricarica.class, entity.RicaricaCriteria.class);
		ID = new IntegerExpression("ID", this.getDetachedCriteria());
		data = new DateExpression("data", this.getDetachedCriteria());
		ammontare = new FloatExpression("ammontare", this.getDetachedCriteria());
	}
	
	public RicaricaDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, entity.RicaricaCriteria.class);
		ID = new IntegerExpression("ID", this.getDetachedCriteria());
		data = new DateExpression("data", this.getDetachedCriteria());
		ammontare = new FloatExpression("ammontare", this.getDetachedCriteria());
	}
	
	public TesseraDetachedCriteria createTesseraCriteria() {
		return new TesseraDetachedCriteria(createCriteria("tessera"));
	}
	
	public CassiereDetachedCriteria createCassiereCriteria() {
		return new CassiereDetachedCriteria(createCriteria("cassiere"));
	}
	
	public Ricarica uniqueRicarica(PersistentSession session) {
		return (Ricarica) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public Ricarica[] listRicarica(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Ricarica[]) list.toArray(new Ricarica[list.size()]);
	}
}

