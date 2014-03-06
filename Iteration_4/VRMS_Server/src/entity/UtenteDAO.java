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

public class UtenteDAO {
	public static Utente loadUtenteByORMID(int ID) throws PersistentException {
		try {
			PersistentSession session = entity.ProvaSVNPersistentManager.instance().getSession();
			return loadUtenteByORMID(session, ID);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Utente getUtenteByORMID(int ID) throws PersistentException {
		try {
			PersistentSession session = entity.ProvaSVNPersistentManager.instance().getSession();
			return getUtenteByORMID(session, ID);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Utente loadUtenteByORMID(int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = entity.ProvaSVNPersistentManager.instance().getSession();
			return loadUtenteByORMID(session, ID, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Utente getUtenteByORMID(int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = entity.ProvaSVNPersistentManager.instance().getSession();
			return getUtenteByORMID(session, ID, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Utente loadUtenteByORMID(PersistentSession session, int ID) throws PersistentException {
		try {
			return (Utente) session.load(entity.Utente.class, new Integer(ID));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Utente getUtenteByORMID(PersistentSession session, int ID) throws PersistentException {
		try {
			return (Utente) session.get(entity.Utente.class, new Integer(ID));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Utente loadUtenteByORMID(PersistentSession session, int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Utente) session.load(entity.Utente.class, new Integer(ID), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Utente getUtenteByORMID(PersistentSession session, int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Utente) session.get(entity.Utente.class, new Integer(ID), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Utente[] listUtenteByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = entity.ProvaSVNPersistentManager.instance().getSession();
			return listUtenteByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Utente[] listUtenteByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = entity.ProvaSVNPersistentManager.instance().getSession();
			return listUtenteByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Utente[] listUtenteByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From entity.Utente as Utente");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			List list = query.list();
			return (Utente[]) list.toArray(new Utente[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Utente[] listUtenteByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From entity.Utente as Utente");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("this", lockMode);
			List list = query.list();
			return (Utente[]) list.toArray(new Utente[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Utente loadUtenteByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = entity.ProvaSVNPersistentManager.instance().getSession();
			return loadUtenteByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Utente loadUtenteByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = entity.ProvaSVNPersistentManager.instance().getSession();
			return loadUtenteByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Utente loadUtenteByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		Utente[] utentes = listUtenteByQuery(session, condition, orderBy);
		if (utentes != null && utentes.length > 0)
			return utentes[0];
		else
			return null;
	}
	
	public static Utente loadUtenteByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		Utente[] utentes = listUtenteByQuery(session, condition, orderBy, lockMode);
		if (utentes != null && utentes.length > 0)
			return utentes[0];
		else
			return null;
	}
	
	public static java.util.Iterator iterateUtenteByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = entity.ProvaSVNPersistentManager.instance().getSession();
			return iterateUtenteByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateUtenteByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = entity.ProvaSVNPersistentManager.instance().getSession();
			return iterateUtenteByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateUtenteByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From entity.Utente as Utente");
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
	
	public static java.util.Iterator iterateUtenteByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From entity.Utente as Utente");
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
	
	public static Utente createUtente() throws RemoteException {
		return new entity.Utente();
	}
	
	public static boolean save(entity.Utente utente) throws PersistentException {
		try {
			entity.ProvaSVNPersistentManager.instance().saveObject(utente);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean delete(entity.Utente utente) throws PersistentException {
		try {
			entity.ProvaSVNPersistentManager.instance().deleteObject(utente);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean refresh(entity.Utente utente) throws PersistentException {
		try {
			entity.ProvaSVNPersistentManager.instance().getSession().refresh(utente);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean evict(entity.Utente utente) throws PersistentException {
		try {
			entity.ProvaSVNPersistentManager.instance().getSession().evict(utente);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Utente loadUtenteByCriteria(UtenteCriteria utenteCriteria) {
		Utente[] utentes = listUtenteByCriteria(utenteCriteria);
		if(utentes == null || utentes.length == 0) {
			return null;
		}
		return utentes[0];
	}
	
	public static Utente[] listUtenteByCriteria(UtenteCriteria utenteCriteria) {
		return utenteCriteria.listUtente();
	}
}
