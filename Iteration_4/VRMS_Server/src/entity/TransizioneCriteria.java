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

public class TransizioneCriteria extends AbstractORMCriteria {
	public final IntegerExpression ID;
	public final BooleanExpression aperto;
	public final DateExpression data_inizio;
	public final DateExpression data_fine;
	public final StringExpression tipo;
	public final FloatExpression costo_totale;
	
	public TransizioneCriteria(Criteria criteria) {
		super(criteria);
		ID = new IntegerExpression("ID", this);
		aperto = new BooleanExpression("aperto", this);
		data_inizio = new DateExpression("data_inizio", this);
		data_fine = new DateExpression("data_fine", this);
		tipo = new StringExpression("tipo", this);
		costo_totale = new FloatExpression("costo_totale", this);
	}
	
	public TransizioneCriteria(PersistentSession session) {
		this(session.createCriteria(Transizione.class));
	}
	
	public TransizioneCriteria() throws PersistentException {
		this(entity.ProvaSVNPersistentManager.instance().getSession());
	}
	
	public FilmCriteria createFilm_noleggiatoCriteria() {
		return new FilmCriteria(createCriteria("film_noleggiato"));
	}
	
	public TesseraCriteria createTesseraCriteria() {
		return new TesseraCriteria(createCriteria("tessera"));
	}
	
	public TerminaleCriteria createOrigine_noleggioCriteria() {
		return new TerminaleCriteria(createCriteria("origine_noleggio"));
	}
	
	public Transizione uniqueTransizione() {
		return (Transizione) super.uniqueResult();
	}
	
	public Transizione[] listTransizione() {
		java.util.List list = super.list();
		return (Transizione[]) list.toArray(new Transizione[list.size()]);
	}
}

