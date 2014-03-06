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

public class FilmDetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression ID;
	public final BooleanExpression disponibile;
	
	public FilmDetachedCriteria() {
		super(entity.Film.class, entity.FilmCriteria.class);
		ID = new IntegerExpression("ID", this.getDetachedCriteria());
		disponibile = new BooleanExpression("disponibile", this.getDetachedCriteria());
	}
	
	public FilmDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, entity.FilmCriteria.class);
		ID = new IntegerExpression("ID", this.getDetachedCriteria());
		disponibile = new BooleanExpression("disponibile", this.getDetachedCriteria());
	}
	
	public FormatoDetachedCriteria createFormato_filmCriteria() {
		return new FormatoDetachedCriteria(createCriteria("formato_film"));
	}
	
	public DescrizioneDetachedCriteria createDescrizione_filmCriteria() {
		return new DescrizioneDetachedCriteria(createCriteria("descrizione_film"));
	}
	
	public Film uniqueFilm(PersistentSession session) {
		return (Film) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public Film[] listFilm(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Film[]) list.toArray(new Film[list.size()]);
	}
}

