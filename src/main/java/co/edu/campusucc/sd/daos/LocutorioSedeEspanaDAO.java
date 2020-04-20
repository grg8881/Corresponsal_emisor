package co.edu.campusucc.sd.daos;
// Generated 15-abr-2020 13:24:27 by Hibernate Tools 5.4.7.Final

import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.hibernate.LockMode;
import org.hibernate.SessionFactory;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Example;

import co.edu.campusucc.sd.modelo.LocutorioSedeEspana;

/**
 * Home object for domain model class LocutorioSedeEspana.
 * @see co.edu.campusucc.sd.modelo.LocutorioSedeEspana
 * @author Hibernate Tools
 */
public class LocutorioSedeEspanaDAO {

	private static final Logger logger = Logger.getLogger(LocutorioSedeEspanaDAO.class.getName());

	private final SessionFactory sessionFactory = getSessionFactory();

	protected SessionFactory getSessionFactory() {
		try {
			//return (SessionFactory) new InitialContext().lookup("SessionFactory");
			return new Configuration().configure().buildSessionFactory();
		} catch (Exception e) {
			logger.log(Level.SEVERE, "Could not locate SessionFactory in JNDI", e);
			throw new IllegalStateException("Could not locate SessionFactory in JNDI");
		}
	}

	public void persist(LocutorioSedeEspana transientInstance) {
		logger.log(Level.INFO, "persisting LocutorioSedeEspana instance");
		Session session = sessionFactory.openSession();
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			session.save(transientInstance);
			tx.commit();
			logger.log(Level.INFO, "persist successful");
			
		} catch (RuntimeException re) {
			logger.log(Level.SEVERE, "persist failed", re);
			if	(tx != null);
			tx.rollback();
			throw re;
		} finally {
			session.close();
		}
	}

	public void attachDirty(LocutorioSedeEspana instance) {
		logger.log(Level.INFO, "attaching dirty LocutorioSedeEspana instance");
		Session session = sessionFactory.openSession();
		Transaction tx = null;
		
		try {
			tx = session.beginTransaction();
			session.saveOrUpdate(instance);
			tx.commit();
			logger.log(Level.INFO, "attach successful");
			
		} catch (RuntimeException re) {
			logger.log(Level.SEVERE, "attach failed", re);
			if	(tx != null);
			tx.rollback();
			throw re;
		} finally {
			session.close();
		}
	}

	public void attachClean(LocutorioSedeEspana instance) {
		logger.log(Level.INFO, "attaching clean LocutorioSedeEspana instance");
		try {
			sessionFactory.getCurrentSession().lock(instance, LockMode.NONE);
			logger.log(Level.INFO, "attach successful");
		} catch (RuntimeException re) {
			logger.log(Level.SEVERE, "attach failed", re);
			throw re;
		}
	}

	public void delete(LocutorioSedeEspana persistentInstance) {
		logger.log(Level.INFO, "deleting LocutorioSedeEspana instance");
		Session session = sessionFactory.openSession();
		Transaction tx = null;
		
		try {
			tx = session.beginTransaction();
			session.delete(persistentInstance);
			tx.commit();
			logger.log(Level.INFO, "delete successful");
			
		} catch (RuntimeException re) {
			logger.log(Level.SEVERE, "delete failed", re);
			if	(tx != null);
			tx.rollback();
			throw re;
		} finally {
			session.close();
		}
	}

	public LocutorioSedeEspana merge(LocutorioSedeEspana detachedInstance) {
		logger.log(Level.INFO, "merging LocutorioSedeEspana instance");
		try {
			LocutorioSedeEspana result = (LocutorioSedeEspana) sessionFactory.getCurrentSession()
					.merge(detachedInstance);
			logger.log(Level.INFO, "merge successful");
			return result;
		} catch (RuntimeException re) {
			logger.log(Level.SEVERE, "merge failed", re);
			throw re;
		}
	}

	public LocutorioSedeEspana findById(java.lang.String id) {
		logger.log(Level.INFO, "getting LocutorioSedeEspana instance with id: " + id);
		try {
			LocutorioSedeEspana instance = (LocutorioSedeEspana) sessionFactory.getCurrentSession()
					.get("co.edu.campusucc.sd.modelo.LocutorioSedeEspana", id);
			if (instance == null) {
				logger.log(Level.INFO, "get successful, no instance found");
			} else {
				logger.log(Level.INFO, "get successful, instance found");
			}
			return instance;
		} catch (RuntimeException re) {
			logger.log(Level.SEVERE, "get failed", re);
			throw re;
		}
	}

	public List findByExample(LocutorioSedeEspana instance) {
		logger.log(Level.INFO, "finding LocutorioSedeEspana instance by example");
		try {
			List results = sessionFactory.getCurrentSession()
					.createCriteria("co.edu.campusucc.sd.modelo.LocutorioSedeEspana").add(Example.create(instance))
					.list();
			logger.log(Level.INFO, "find by example successful, result size: " + results.size());
			return results;
		} catch (RuntimeException re) {
			logger.log(Level.SEVERE, "find by example failed", re);
			throw re;
		}
	}
}
