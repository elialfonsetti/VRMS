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

public class MagazzinoDetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression ID;
	public final StringExpression indirizzo;
	
	public MagazzinoDetachedCriteria() {
		super(entity.Magazzino.class, entity.MagazzinoCriteria.class);
		ID = new IntegerExpression("ID", this.getDetachedCriteria());
		indirizzo = new StringExpression("indirizzo", this.getDetachedCriteria());
	}
	
	public MagazzinoDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, entity.MagazzinoCriteria.class);
		ID = new IntegerExpression("ID", this.getDetachedCriteria());
		indirizzo = new StringExpression("indirizzo", this.getDetachedCriteria());
	}
	
	public FilmDetachedCriteria createLista_film___List_Film_Criteria() {
		return new FilmDetachedCriteria(createCriteria("ORM_Lista_film___List_Film_"));
	}
	
	public Magazzino uniqueMagazzino(PersistentSession session) {
		return (Magazzino) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public Magazzino[] listMagazzino(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Magazzino[]) list.toArray(new Magazzino[list.size()]);
	}
}

