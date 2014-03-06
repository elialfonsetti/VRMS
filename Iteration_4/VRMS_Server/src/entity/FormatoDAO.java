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
import org.hibernate.LockMode;
import org.orm.*;
import org.hibernate.Query;
import java.util.List;

public class FormatoDAO {
	public static Formato loadFormatoByORMID(String nome_formato) throws PersistentException {
		try {
			PersistentSession session = entity.ProvaSVNPersistentManager.instance().getSession();
			return loadFormatoByORMID(session, nome_formato);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Formato getFormatoByORMID(String nome_formato) throws PersistentException {
		try {
			PersistentSession session = entity.ProvaSVNPersistentManager.instance().getSession();
			return getFormatoByORMID(session, nome_formato);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Formato loadFormatoByORMID(String nome_formato, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = entity.ProvaSVNPersistentManager.instance().getSession();
			return loadFormatoByORMID(session, nome_formato, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Formato getFormatoByORMID(String nome_formato, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = entity.ProvaSVNPersistentManager.instance().getSession();
			return getFormatoByORMID(session, nome_formato, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Formato loadFormatoByORMID(PersistentSession session, String nome_formato) throws PersistentException {
		try {
			return (Formato) session.load(entity.Formato.class, nome_formato);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Formato getFormatoByORMID(PersistentSession session, String nome_formato) throws PersistentException {
		try {
			return (Formato) session.get(entity.Formato.class, nome_formato);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Formato loadFormatoByORMID(PersistentSession session, String nome_formato, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Formato) session.load(entity.Formato.class, nome_formato, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Formato getFormatoByORMID(PersistentSession session, String nome_formato, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Formato) session.get(entity.Formato.class, nome_formato, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Formato[] listFormatoByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = entity.ProvaSVNPersistentManager.instance().getSession();
			return listFormatoByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Formato[] listFormatoByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = entity.ProvaSVNPersistentManager.instance().getSession();
			return listFormatoByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Formato[] listFormatoByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From entity.Formato as Formato");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			List list = query.list();
			return (Formato[]) list.toArray(new Formato[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Formato[] listFormatoByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From entity.Formato as Formato");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("this", lockMode);
			List list = query.list();
			return (Formato[]) list.toArray(new Formato[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Formato loadFormatoByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = entity.ProvaSVNPersistentManager.instance().getSession();
			return loadFormatoByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Formato loadFormatoByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = entity.ProvaSVNPersistentManager.instance().getSession();
			return loadFormatoByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Formato loadFormatoByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		Formato[] formatos = listFormatoByQuery(session, condition, orderBy);
		if (formatos != null && formatos.length > 0)
			return formatos[0];
		else
			return null;
	}
	
	public static Formato loadFormatoByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		Formato[] formatos = listFormatoByQuery(session, condition, orderBy, lockMode);
		if (formatos != null && formatos.length > 0)
			return formatos[0];
		else
			return null;
	}
	
	public static java.util.Iterator iterateFormatoByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = entity.ProvaSVNPersistentManager.instance().getSession();
			return iterateFormatoByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateFormatoByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = entity.ProvaSVNPersistentManager.instance().getSession();
			return iterateFormatoByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateFormatoByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From entity.Formato as Formato");
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
	
	public static java.util.Iterator iterateFormatoByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From entity.Formato as Formato");
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
	
	public static Formato createFormato() throws RemoteException {
		return new entity.Formato();
	}
	
	public static boolean save(entity.Formato formato) throws PersistentException {
		try {
			entity.ProvaSVNPersistentManager.instance().saveObject(formato);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean delete(entity.Formato formato) throws PersistentException {
		try {
			entity.ProvaSVNPersistentManager.instance().deleteObject(formato);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(entity.Formato formato)throws PersistentException {
		try {
			entity.Film[] lFilmss = formato.films.toArray();
			for(int i = 0; i < lFilmss.length; i++) {
				lFilmss[i].setFormato_film(null);
			}
			return delete(formato);
		}
		catch(Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(entity.Formato formato, org.orm.PersistentSession session)throws PersistentException {
		try {
			entity.Film[] lFilmss = formato.films.toArray();
			for(int i = 0; i < lFilmss.length; i++) {
				lFilmss[i].setFormato_film(null);
			}
			try {
				session.delete(formato);
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
	
	public static boolean refresh(entity.Formato formato) throws PersistentException {
		try {
			entity.ProvaSVNPersistentManager.instance().getSession().refresh(formato);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean evict(entity.Formato formato) throws PersistentException {
		try {
			entity.ProvaSVNPersistentManager.instance().getSession().evict(formato);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Formato loadFormatoByCriteria(FormatoCriteria formatoCriteria) {
		Formato[] formatos = listFormatoByCriteria(formatoCriteria);
		if(formatos == null || formatos.length == 0) {
			return null;
		}
		return formatos[0];
	}
	
	public static Formato[] listFormatoByCriteria(FormatoCriteria formatoCriteria) {
		return formatoCriteria.listFormato();
	}


}
