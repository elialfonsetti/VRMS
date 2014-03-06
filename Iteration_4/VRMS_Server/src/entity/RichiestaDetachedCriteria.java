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

public class RichiestaDetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression ID;
	public final BooleanExpression aperto;
	public final DateExpression data_ordine;
	public final StringExpression titolo;
	public final StringExpression fornitore;
	public final StringExpression formato;
	
	public RichiestaDetachedCriteria() {
		super(entity.Richiesta.class, entity.RichiestaCriteria.class);
		ID = new IntegerExpression("ID", this.getDetachedCriteria());
		aperto = new BooleanExpression("aperto", this.getDetachedCriteria());
		data_ordine = new DateExpression("data_ordine", this.getDetachedCriteria());
		titolo = new StringExpression("titolo", this.getDetachedCriteria());
		fornitore = new StringExpression("fornitore", this.getDetachedCriteria());
		formato = new StringExpression("formato", this.getDetachedCriteria());
	}
	
	public RichiestaDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, entity.RichiestaCriteria.class);
		ID = new IntegerExpression("ID", this.getDetachedCriteria());
		aperto = new BooleanExpression("aperto", this.getDetachedCriteria());
		data_ordine = new DateExpression("data_ordine", this.getDetachedCriteria());
		titolo = new StringExpression("titolo", this.getDetachedCriteria());
		fornitore = new StringExpression("fornitore", this.getDetachedCriteria());
		formato = new StringExpression("formato", this.getDetachedCriteria());
	}
	
	public TesseraDetachedCriteria createTesseraCriteria() {
		return new TesseraDetachedCriteria(createCriteria("tessera"));
	}
	
	public TerminaleDetachedCriteria createOrigine_noleggioCriteria() {
		return new TerminaleDetachedCriteria(createCriteria("origine_noleggio"));
	}
	
	public Richiesta uniqueRichiesta(PersistentSession session) {
		return (Richiesta) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public Richiesta[] listRichiesta(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Richiesta[]) list.toArray(new Richiesta[list.size()]);
	}
}

