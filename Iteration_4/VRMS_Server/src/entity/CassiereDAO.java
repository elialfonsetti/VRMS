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

public class CassiereDAO {
	public static Cassiere loadCassiereByORMID(int ID) throws PersistentException {
		try {
			PersistentSession session = entity.ProvaSVNPersistentManager.instance().getSession();
			return loadCassiereByORMID(session, ID);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Cassiere getCassiereByORMID(int ID) throws PersistentException {
		try {
			PersistentSession session = entity.ProvaSVNPersistentManager.instance().getSession();
			return getCassiereByORMID(session, ID);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Cassiere loadCassiereByORMID(int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = entity.ProvaSVNPersistentManager.instance().getSession();
			return loadCassiereByORMID(session, ID, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Cassiere getCassiereByORMID(int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = entity.ProvaSVNPersistentManager.instance().getSession();
			return getCassiereByORMID(session, ID, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Cassiere loadCassiereByORMID(PersistentSession session, int ID) throws PersistentException {
		try {
			return (Cassiere) session.load(entity.Cassiere.class, new Integer(ID));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Cassiere getCassiereByORMID(PersistentSession session, int ID) throws PersistentException {
		try {
			return (Cassiere) session.get(entity.Cassiere.class, new Integer(ID));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Cassiere loadCassiereByORMID(PersistentSession session, int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Cassiere) session.load(entity.Cassiere.class, new Integer(ID), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Cassiere getCassiereByORMID(PersistentSession session, int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Cassiere) session.get(entity.Cassiere.class, new Integer(ID), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Cassiere[] listCassiereByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = entity.ProvaSVNPersistentManager.instance().getSession();
			return listCassiereByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Cassiere[] listCassiereByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = entity.ProvaSVNPersistentManager.instance().getSession();
			return listCassiereByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Cassiere[] listCassiereByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From entity.Cassiere as Cassiere");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			List list = query.list();
			return (Cassiere[]) list.toArray(new Cassiere[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Cassiere[] listCassiereByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From entity.Cassiere as Cassiere");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("this", lockMode);
			List list = query.list();
			return (Cassiere[]) list.toArray(new Cassiere[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Cassiere loadCassiereByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = entity.ProvaSVNPersistentManager.instance().getSession();
			return loadCassiereByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Cassiere loadCassiereByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = entity.ProvaSVNPersistentManager.instance().getSession();
			return loadCassiereByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Cassiere loadCassiereByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		Cassiere[] cassieres = listCassiereByQuery(session, condition, orderBy);
		if (cassieres != null && cassieres.length > 0)
			return cassieres[0];
		else
			return null;
	}
	
	public static Cassiere loadCassiereByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		Cassiere[] cassieres = listCassiereByQuery(session, condition, orderBy, lockMode);
		if (cassieres != null && cassieres.length > 0)
			return cassieres[0];
		else
			return null;
	}
	
	public static java.util.Iterator iterateCassiereByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = entity.ProvaSVNPersistentManager.instance().getSession();
			return iterateCassiereByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateCassiereByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = entity.ProvaSVNPersistentManager.instance().getSession();
			return iterateCassiereByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateCassiereByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From entity.Cassiere as Cassiere");
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
	
	public static java.util.Iterator iterateCassiereByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From entity.Cassiere as Cassiere");
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
	
	public static Cassiere createCassiere() throws RemoteException {
		return new entity.Cassiere();
	}
	
	public static boolean save(entity.Cassiere cassiere) throws PersistentException {
		try {
			entity.ProvaSVNPersistentManager.instance().saveObject(cassiere);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean delete(entity.Cassiere cassiere) throws PersistentException {
		try {
			entity.ProvaSVNPersistentManager.instance().deleteObject(cassiere);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean refresh(entity.Cassiere cassiere) throws PersistentException {
		try {
			entity.ProvaSVNPersistentManager.instance().getSession().refresh(cassiere);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean evict(entity.Cassiere cassiere) throws PersistentException {
		try {
			entity.ProvaSVNPersistentManager.instance().getSession().evict(cassiere);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Cassiere loadCassiereByCriteria(CassiereCriteria cassiereCriteria) {
		Cassiere[] cassieres = listCassiereByCriteria(cassiereCriteria);
		if(cassieres == null || cassieres.length == 0) {
			return null;
		}
		return cassieres[0];
	}
	
	public static Cassiere[] listCassiereByCriteria(CassiereCriteria cassiereCriteria) {
		return cassiereCriteria.listCassiere();
	}
}
