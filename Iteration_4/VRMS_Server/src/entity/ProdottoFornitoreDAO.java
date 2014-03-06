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

import org.orm.*;
import org.hibernate.Query;
import java.util.List;

public class ProdottoFornitoreDAO {
	public static ProdottoFornitore loadProdottoFornitoreByORMID(String nome) throws PersistentException {
		try {
			PersistentSession session = entity.ProvaSVNPersistentManager.instance().getSession();
			return loadProdottoFornitoreByORMID(session, nome);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static ProdottoFornitore getProdottoFornitoreByORMID(String nome) throws PersistentException {
		try {
			PersistentSession session = entity.ProvaSVNPersistentManager.instance().getSession();
			return getProdottoFornitoreByORMID(session, nome);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static ProdottoFornitore loadProdottoFornitoreByORMID(String nome, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = entity.ProvaSVNPersistentManager.instance().getSession();
			return loadProdottoFornitoreByORMID(session, nome, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static ProdottoFornitore getProdottoFornitoreByORMID(String nome, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = entity.ProvaSVNPersistentManager.instance().getSession();
			return getProdottoFornitoreByORMID(session, nome, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static ProdottoFornitore loadProdottoFornitoreByORMID(PersistentSession session, String nome) throws PersistentException {
		try {
			return (ProdottoFornitore) session.load(entity.ProdottoFornitore.class, nome);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static ProdottoFornitore getProdottoFornitoreByORMID(PersistentSession session, String nome) throws PersistentException {
		try {
			return (ProdottoFornitore) session.get(entity.ProdottoFornitore.class, nome);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static ProdottoFornitore loadProdottoFornitoreByORMID(PersistentSession session, String nome, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (ProdottoFornitore) session.load(entity.ProdottoFornitore.class, nome, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static ProdottoFornitore getProdottoFornitoreByORMID(PersistentSession session, String nome, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (ProdottoFornitore) session.get(entity.ProdottoFornitore.class, nome, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static ProdottoFornitore[] listProdottoFornitoreByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = entity.ProvaSVNPersistentManager.instance().getSession();
			return listProdottoFornitoreByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static ProdottoFornitore[] listProdottoFornitoreByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = entity.ProvaSVNPersistentManager.instance().getSession();
			return listProdottoFornitoreByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static ProdottoFornitore[] listProdottoFornitoreByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From entity.ProdottoFornitore as ProdottoFornitore");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			List list = query.list();
			return (ProdottoFornitore[]) list.toArray(new ProdottoFornitore[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static ProdottoFornitore[] listProdottoFornitoreByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From entity.ProdottoFornitore as ProdottoFornitore");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("this", lockMode);
			List list = query.list();
			return (ProdottoFornitore[]) list.toArray(new ProdottoFornitore[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static ProdottoFornitore loadProdottoFornitoreByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = entity.ProvaSVNPersistentManager.instance().getSession();
			return loadProdottoFornitoreByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static ProdottoFornitore loadProdottoFornitoreByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = entity.ProvaSVNPersistentManager.instance().getSession();
			return loadProdottoFornitoreByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static ProdottoFornitore loadProdottoFornitoreByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		ProdottoFornitore[] prodottoFornitores = listProdottoFornitoreByQuery(session, condition, orderBy);
		if (prodottoFornitores != null && prodottoFornitores.length > 0)
			return prodottoFornitores[0];
		else
			return null;
	}
	
	public static ProdottoFornitore loadProdottoFornitoreByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		ProdottoFornitore[] prodottoFornitores = listProdottoFornitoreByQuery(session, condition, orderBy, lockMode);
		if (prodottoFornitores != null && prodottoFornitores.length > 0)
			return prodottoFornitores[0];
		else
			return null;
	}
	
	public static java.util.Iterator iterateProdottoFornitoreByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = entity.ProvaSVNPersistentManager.instance().getSession();
			return iterateProdottoFornitoreByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateProdottoFornitoreByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = entity.ProvaSVNPersistentManager.instance().getSession();
			return iterateProdottoFornitoreByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateProdottoFornitoreByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From entity.ProdottoFornitore as ProdottoFornitore");
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
	
	public static java.util.Iterator iterateProdottoFornitoreByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From entity.ProdottoFornitore as ProdottoFornitore");
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
	
	public static ProdottoFornitore createProdottoFornitore() {
		return new entity.ProdottoFornitore();
	}
	
	public static boolean save(entity.ProdottoFornitore prodottoFornitore) throws PersistentException {
		try {
			entity.ProvaSVNPersistentManager.instance().saveObject(prodottoFornitore);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean delete(entity.ProdottoFornitore prodottoFornitore) throws PersistentException {
		try {
			entity.ProvaSVNPersistentManager.instance().deleteObject(prodottoFornitore);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean refresh(entity.ProdottoFornitore prodottoFornitore) throws PersistentException {
		try {
			entity.ProvaSVNPersistentManager.instance().getSession().refresh(prodottoFornitore);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean evict(entity.ProdottoFornitore prodottoFornitore) throws PersistentException {
		try {
			entity.ProvaSVNPersistentManager.instance().getSession().evict(prodottoFornitore);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static ProdottoFornitore loadProdottoFornitoreByCriteria(ProdottoFornitoreCriteria prodottoFornitoreCriteria) {
		ProdottoFornitore[] prodottoFornitores = listProdottoFornitoreByCriteria(prodottoFornitoreCriteria);
		if(prodottoFornitores == null || prodottoFornitores.length == 0) {
			return null;
		}
		return prodottoFornitores[0];
	}
	
	public static ProdottoFornitore[] listProdottoFornitoreByCriteria(ProdottoFornitoreCriteria prodottoFornitoreCriteria) {
		return prodottoFornitoreCriteria.listProdottoFornitore();
	}
}
