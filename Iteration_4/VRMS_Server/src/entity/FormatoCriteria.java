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

public class FormatoCriteria extends AbstractORMCriteria {
	public final StringExpression nome_formato;
	public final FloatExpression costo;
	
	public FormatoCriteria(Criteria criteria) {
		super(criteria);
		nome_formato = new StringExpression("nome_formato", this);
		costo = new FloatExpression("costo", this);
	}
	
	public FormatoCriteria(PersistentSession session) {
		this(session.createCriteria(Formato.class));
	}
	
	public FormatoCriteria() throws PersistentException {
		this(entity.ProvaSVNPersistentManager.instance().getSession());
	}
	
	public FilmCriteria createFilmsCriteria() {
		return new FilmCriteria(createCriteria("ORM_Films"));
	}
	
	public Formato uniqueFormato() {
		return (Formato) super.uniqueResult();
	}
	
	public Formato[] listFormato() {
		java.util.List list = super.list();
		return (Formato[]) list.toArray(new Formato[list.size()]);
	}
}

