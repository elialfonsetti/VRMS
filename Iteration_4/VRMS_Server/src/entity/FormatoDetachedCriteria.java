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

public class FormatoDetachedCriteria extends AbstractORMDetachedCriteria {
	public final StringExpression nome_formato;
	public final FloatExpression costo;
	
	public FormatoDetachedCriteria() {
		super(entity.Formato.class, entity.FormatoCriteria.class);
		nome_formato = new StringExpression("nome_formato", this.getDetachedCriteria());
		costo = new FloatExpression("costo", this.getDetachedCriteria());
	}
	
	public FormatoDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, entity.FormatoCriteria.class);
		nome_formato = new StringExpression("nome_formato", this.getDetachedCriteria());
		costo = new FloatExpression("costo", this.getDetachedCriteria());
	}
	
	public FilmDetachedCriteria createFilmsCriteria() {
		return new FilmDetachedCriteria(createCriteria("ORM_Films"));
	}
	
	public Formato uniqueFormato(PersistentSession session) {
		return (Formato) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public Formato[] listFormato(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Formato[]) list.toArray(new Formato[list.size()]);
	}
}

