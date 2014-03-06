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

public class FilmCriteria extends AbstractORMCriteria {
	public final IntegerExpression ID;
	public final BooleanExpression disponibile;
	
	public FilmCriteria(Criteria criteria) {
		super(criteria);
		ID = new IntegerExpression("ID", this);
		disponibile = new BooleanExpression("disponibile", this);
	}
	
	public FilmCriteria(PersistentSession session) {
		this(session.createCriteria(Film.class));
	}
	
	public FilmCriteria() throws PersistentException {
		this(entity.ProvaSVNPersistentManager.instance().getSession());
	}
	
	public FormatoCriteria createFormato_filmCriteria() {
		return new FormatoCriteria(createCriteria("formato_film"));
	}
	
	public DescrizioneCriteria createDescrizione_filmCriteria() {
		return new DescrizioneCriteria(createCriteria("descrizione_film"));
	}
	
	public Film uniqueFilm() {
		return (Film) super.uniqueResult();
	}
	
	public Film[] listFilm() {
		java.util.List list = super.list();
		return (Film[]) list.toArray(new Film[list.size()]);
	}
}

