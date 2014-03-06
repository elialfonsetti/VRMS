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

public class TransizioneDetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression ID;
	public final BooleanExpression aperto;
	public final DateExpression data_inizio;
	public final DateExpression data_fine;
	public final StringExpression tipo;
	public final FloatExpression costo_totale;
	
	public TransizioneDetachedCriteria() {
		super(entity.Transizione.class, entity.TransizioneCriteria.class);
		ID = new IntegerExpression("ID", this.getDetachedCriteria());
		aperto = new BooleanExpression("aperto", this.getDetachedCriteria());
		data_inizio = new DateExpression("data_inizio", this.getDetachedCriteria());
		data_fine = new DateExpression("data_fine", this.getDetachedCriteria());
		tipo = new StringExpression("tipo", this.getDetachedCriteria());
		costo_totale = new FloatExpression("costo_totale", this.getDetachedCriteria());
	}
	
	public TransizioneDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, entity.TransizioneCriteria.class);
		ID = new IntegerExpression("ID", this.getDetachedCriteria());
		aperto = new BooleanExpression("aperto", this.getDetachedCriteria());
		data_inizio = new DateExpression("data_inizio", this.getDetachedCriteria());
		data_fine = new DateExpression("data_fine", this.getDetachedCriteria());
		tipo = new StringExpression("tipo", this.getDetachedCriteria());
		costo_totale = new FloatExpression("costo_totale", this.getDetachedCriteria());
	}
	
	public FilmDetachedCriteria createFilm_noleggiatoCriteria() {
		return new FilmDetachedCriteria(createCriteria("film_noleggiato"));
	}
	
	public TesseraDetachedCriteria createTesseraCriteria() {
		return new TesseraDetachedCriteria(createCriteria("tessera"));
	}
	
	public TerminaleDetachedCriteria createOrigine_noleggioCriteria() {
		return new TerminaleDetachedCriteria(createCriteria("origine_noleggio"));
	}
	
	public Transizione uniqueTransizione(PersistentSession session) {
		return (Transizione) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public Transizione[] listTransizione(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Transizione[]) list.toArray(new Transizione[list.size()]);
	}
}

