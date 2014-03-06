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

public class OperazioneDetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression ID;
	public final BooleanExpression aperto;
	
	public OperazioneDetachedCriteria() {
		super(entity.Operazione.class, entity.OperazioneCriteria.class);
		ID = new IntegerExpression("ID", this.getDetachedCriteria());
		aperto = new BooleanExpression("aperto", this.getDetachedCriteria());
	}
	
	public OperazioneDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, entity.OperazioneCriteria.class);
		ID = new IntegerExpression("ID", this.getDetachedCriteria());
		aperto = new BooleanExpression("aperto", this.getDetachedCriteria());
	}
	
	public TesseraDetachedCriteria createTesseraCriteria() {
		return new TesseraDetachedCriteria(createCriteria("tessera"));
	}
	
	public TerminaleDetachedCriteria createOrigine_noleggioCriteria() {
		return new TerminaleDetachedCriteria(createCriteria("origine_noleggio"));
	}
	
	public Operazione uniqueOperazione(PersistentSession session) {
		return (Operazione) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public Operazione[] listOperazione(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Operazione[]) list.toArray(new Operazione[list.size()]);
	}
}

