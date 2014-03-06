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

public class TesseraDAO {
	public static Tessera loadTesseraByORMID(String codice) throws PersistentException {
		try {
			PersistentSession session = entity.ProvaSVNPersistentManager.instance().getSession();
			return loadTesseraByORMID(session, codice);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Tessera getTesseraByORMID(String codice) throws PersistentException {
		try {
			PersistentSession session = entity.ProvaSVNPersistentManager.instance().getSession();
			return getTesseraByORMID(session, codice);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Tessera loadTesseraByORMID(String codice, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = entity.ProvaSVNPersistentManager.instance().getSession();
			return loadTesseraByORMID(session, codice, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Tessera getTesseraByORMID(String codice, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = entity.ProvaSVNPersistentManager.instance().getSession();
			return getTesseraByORMID(session, codice, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Tessera loadTesseraByORMID(PersistentSession session, String codice) throws PersistentException {
		try {
			return (Tessera) session.load(entity.Tessera.class, codice);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Tessera getTesseraByORMID(PersistentSession session, String codice) throws PersistentException {
		try {
			return (Tessera) session.get(entity.Tessera.class, codice);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Tessera loadTesseraByORMID(PersistentSession session, String codice, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Tessera) session.load(entity.Tessera.class, codice, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Tessera getTesseraByORMID(PersistentSession session, String codice, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Tessera) session.get(entity.Tessera.class, codice, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Tessera[] listTesseraByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = entity.ProvaSVNPersistentManager.instance().getSession();
			return listTesseraByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Tessera[] listTesseraByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = entity.ProvaSVNPersistentManager.instance().getSession();
			return listTesseraByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Tessera[] listTesseraByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From entity.Tessera as Tessera");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			List list = query.list();
			return (Tessera[]) list.toArray(new Tessera[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Tessera[] listTesseraByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From entity.Tessera as Tessera");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("this", lockMode);
			List list = query.list();
			return (Tessera[]) list.toArray(new Tessera[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Tessera loadTesseraByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = entity.ProvaSVNPersistentManager.instance().getSession();
			return loadTesseraByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Tessera loadTesseraByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = entity.ProvaSVNPersistentManager.instance().getSession();
			return loadTesseraByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Tessera loadTesseraByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		Tessera[] tesseras = listTesseraByQuery(session, condition, orderBy);
		if (tesseras != null && tesseras.length > 0)
			return tesseras[0];
		else
			return null;
	}
	
	public static Tessera loadTesseraByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		Tessera[] tesseras = listTesseraByQuery(session, condition, orderBy, lockMode);
		if (tesseras != null && tesseras.length > 0)
			return tesseras[0];
		else
			return null;
	}
	
	public static java.util.Iterator iterateTesseraByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = entity.ProvaSVNPersistentManager.instance().getSession();
			return iterateTesseraByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateTesseraByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = entity.ProvaSVNPersistentManager.instance().getSession();
			return iterateTesseraByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateTesseraByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From entity.Tessera as Tessera");
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
	
	public static java.util.Iterator iterateTesseraByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From entity.Tessera as Tessera");
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
	
	public static Tessera createTessera() throws RemoteException {
		return new entity.Tessera();
	}
	
	public static boolean save(entity.Tessera tessera) throws PersistentException {
		try {
			entity.ProvaSVNPersistentManager.instance().saveObject(tessera);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean delete(entity.Tessera tessera) throws PersistentException {
		try {
			entity.ProvaSVNPersistentManager.instance().deleteObject(tessera);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean refresh(entity.Tessera tessera) throws PersistentException {
		try {
			entity.ProvaSVNPersistentManager.instance().getSession().refresh(tessera);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean evict(entity.Tessera tessera) throws PersistentException {
		try {
			entity.ProvaSVNPersistentManager.instance().getSession().evict(tessera);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Tessera loadTesseraByCriteria(TesseraCriteria tesseraCriteria) {
		Tessera[] tesseras = listTesseraByCriteria(tesseraCriteria);
		if(tesseras == null || tesseras.length == 0) {
			return null;
		}
		return tesseras[0];
	}
	
	public static Tessera[] listTesseraByCriteria(TesseraCriteria tesseraCriteria) {
		return tesseraCriteria.listTessera();
	}

     public static boolean update(Tessera tessera_personale) throws PersistentException {
       try {

			entity.ProvaSVNPersistentManager.instance().saveObject(tessera_personale);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
    }
}
