package MODELO;
// Generated 21 ene. 2022 20:35:30 by Hibernate Tools 5.4.32.Final

import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.naming.InitialContext;
import org.hibernate.LockMode;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Example;

/**
 * Home object for domain model class Ciudadano.
 * @see MODELO.Ciudadano
 * @author Hibernate Tools
 */
public class CiudadanoHome {

	private static final Logger logger = Logger.getLogger(CiudadanoHome.class.getName());

	private final SessionFactory sessionFactory = getSessionFactory();

	protected SessionFactory getSessionFactory() {
		try {
			return (SessionFactory) new InitialContext().lookup("SessionFactory");
		} catch (Exception e) {
			logger.log(Level.SEVERE, "Could not locate SessionFactory in JNDI", e);
			throw new IllegalStateException("Could not locate SessionFactory in JNDI");
		}
	}

	public void persist(Ciudadano transientInstance) {
		logger.log(Level.INFO, "persisting Ciudadano instance");
		try {
			sessionFactory.getCurrentSession().persist(transientInstance);
			logger.log(Level.INFO, "persist successful");
		} catch (RuntimeException re) {
			logger.log(Level.SEVERE, "persist failed", re);
			throw re;
		}
	}

	public void attachDirty(Ciudadano instance) {
		logger.log(Level.INFO, "attaching dirty Ciudadano instance");
		try {
			sessionFactory.getCurrentSession().saveOrUpdate(instance);
			logger.log(Level.INFO, "attach successful");
		} catch (RuntimeException re) {
			logger.log(Level.SEVERE, "attach failed", re);
			throw re;
		}
	}

	public void attachClean(Ciudadano instance) {
		logger.log(Level.INFO, "attaching clean Ciudadano instance");
		try {
			sessionFactory.getCurrentSession().lock(instance, LockMode.NONE);
			logger.log(Level.INFO, "attach successful");
		} catch (RuntimeException re) {
			logger.log(Level.SEVERE, "attach failed", re);
			throw re;
		}
	}

	public void delete(Ciudadano persistentInstance) {
		logger.log(Level.INFO, "deleting Ciudadano instance");
		try {
			sessionFactory.getCurrentSession().delete(persistentInstance);
			logger.log(Level.INFO, "delete successful");
		} catch (RuntimeException re) {
			logger.log(Level.SEVERE, "delete failed", re);
			throw re;
		}
	}

	public Ciudadano merge(Ciudadano detachedInstance) {
		logger.log(Level.INFO, "merging Ciudadano instance");
		try {
			Ciudadano result = (Ciudadano) sessionFactory.getCurrentSession().merge(detachedInstance);
			logger.log(Level.INFO, "merge successful");
			return result;
		} catch (RuntimeException re) {
			logger.log(Level.SEVERE, "merge failed", re);
			throw re;
		}
	}

	public Ciudadano findById(int id) {
		logger.log(Level.INFO, "getting Ciudadano instance with id: " + id);
		try {
			Ciudadano instance = (Ciudadano) sessionFactory.getCurrentSession().get("MODELO.Ciudadano", id);
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

	public List findByExample(Ciudadano instance) {
		logger.log(Level.INFO, "finding Ciudadano instance by example");
		try {
			List results = sessionFactory.getCurrentSession().createCriteria("MODELO.Ciudadano")
					.add(Example.create(instance)).list();
			logger.log(Level.INFO, "find by example successful, result size: " + results.size());
			return results;
		} catch (RuntimeException re) {
			logger.log(Level.SEVERE, "find by example failed", re);
			throw re;
		}
	}
}
