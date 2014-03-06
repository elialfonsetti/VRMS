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

import java.rmi.RemoteException;
import org.orm.*;
import org.hibernate.Query;
import java.util.List;

public class FilmDAO {
	public static Film loadFilmByORMID(int ID) throws PersistentException {
		try {
			PersistentSession session = entity.ProvaSVNPersistentManager.instance().getSession();
			return loadFilmByORMID(session, ID);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Film getFilmByORMID(int ID) throws PersistentException {
		try {
			PersistentSession session = entity.ProvaSVNPersistentManager.instance().getSession();
			return getFilmByORMID(session, ID);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Film loadFilmByORMID(int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = entity.ProvaSVNPersistentManager.instance().getSession();
			return loadFilmByORMID(session, ID, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Film getFilmByORMID(int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = entity.ProvaSVNPersistentManager.instance().getSession();
			return getFilmByORMID(session, ID, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Film loadFilmByORMID(PersistentSession session, int ID) throws PersistentException {
		try {
			return (Film) session.load(entity.Film.class, new Integer(ID));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Film getFilmByORMID(PersistentSession session, int ID) throws PersistentException {
		try {
			return (Film) session.get(entity.Film.class, new Integer(ID));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Film loadFilmByORMID(PersistentSession session, int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Film) session.load(entity.Film.class, new Integer(ID), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Film getFilmByORMID(PersistentSession session, int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Film) session.get(entity.Film.class, new Integer(ID), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Film[] listFilmByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = entity.ProvaSVNPersistentManager.instance().getSession();
			return listFilmByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Film[] listFilmByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = entity.ProvaSVNPersistentManager.instance().getSession();
			return listFilmByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Film[] listFilmByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From entity.Film as Film");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			List list = query.list();
			return (Film[]) list.toArray(new Film[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Film[] listFilmByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From entity.Film as Film");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("this", lockMode);
			List list = query.list();
			return (Film[]) list.toArray(new Film[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Film loadFilmByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = entity.ProvaSVNPersistentManager.instance().getSession();
			return loadFilmByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Film loadFilmByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = entity.ProvaSVNPersistentManager.instance().getSession();
			return loadFilmByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Film loadFilmByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		Film[] films = listFilmByQuery(session, condition, orderBy);
		if (films != null && films.length > 0)
			return films[0];
		else
			return null;
	}
	
	public static Film loadFilmByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		Film[] films = listFilmByQuery(session, condition, orderBy, lockMode);
		if (films != null && films.length > 0)
			return films[0];
		else
			return null;
	}
	
	public static java.util.Iterator iterateFilmByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = entity.ProvaSVNPersistentManager.instance().getSession();
			return iterateFilmByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateFilmByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = entity.ProvaSVNPersistentManager.instance().getSession();
			return iterateFilmByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateFilmByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From entity.Film as Film");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateFilmByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From entity.Film as Film");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("this", lockMode);
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Film createFilm() throws RemoteException {
		return new entity.Film();
	}
	
	public static boolean save(entity.Film film) throws PersistentException {
		try {
			entity.ProvaSVNPersistentManager.instance().saveObject(film);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean delete(entity.Film film) throws PersistentException {
		try {
			entity.ProvaSVNPersistentManager.instance().deleteObject(film);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(entity.Film film)throws PersistentException {
		try {
			if(film.getFormato_film() != null) {
				
			}
			
			return delete(film);
		}
		catch(Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(entity.Film film, org.orm.PersistentSession session)throws PersistentException {
		try {
			if(film.getFormato_film() != null) {
				
			}
			
			try {
				session.delete(film);
				return true;
			} catch (Exception e) {
				return false;
			}
		}
		catch(Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean refresh(entity.Film film) throws PersistentException {
		try {
			entity.ProvaSVNPersistentManager.instance().getSession().refresh(film);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean evict(entity.Film film) throws PersistentException {
		try {
			entity.ProvaSVNPersistentManager.instance().getSession().evict(film);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Film loadFilmByCriteria(FilmCriteria filmCriteria) {
		Film[] films = listFilmByCriteria(filmCriteria);
		if(films == null || films.length == 0) {
			return null;
		}
		return films[0];
	}
	
	public static Film[] listFilmByCriteria(FilmCriteria filmCriteria) {
		return filmCriteria.listFilm();
	}

        public static boolean update(entity.Film film) throws PersistentException {
		try {

			entity.ProvaSVNPersistentManager.instance().saveObject(film);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
}
