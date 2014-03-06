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

public class MagazzinoCriteria extends AbstractORMCriteria {
	public final IntegerExpression ID;
	public final StringExpression indirizzo;
	
	public MagazzinoCriteria(Criteria criteria) {
		super(criteria);
		ID = new IntegerExpression("ID", this);
		indirizzo = new StringExpression("indirizzo", this);
	}
	
	public MagazzinoCriteria(PersistentSession session) {
		this(session.createCriteria(Magazzino.class));
	}
	
	public MagazzinoCriteria() throws PersistentException {
		this(entity.ProvaSVNPersistentManager.instance().getSession());
	}
	
	public FilmCriteria createLista_film___List_Film_Criteria() {
		return new FilmCriteria(createCriteria("ORM_Lista_film___List_Film_"));
	}
	
	public Magazzino uniqueMagazzino() {
		return (Magazzino) super.uniqueResult();
	}
	
	public Magazzino[] listMagazzino() {
		java.util.List list = super.list();
		return (Magazzino[]) list.toArray(new Magazzino[list.size()]);
	}
}

