package database;

import java.util.List;
import javax.naming.InitialContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.hibernate.SessionFactory;
import static org.hibernate.criterion.Example.create;

/**
 * Home object for domain model class Banditssymbols.
 * @see .Banditssymbols
 * @author Hibernate Tools
 */
public class BanditssymbolsHome {

	private static final Log log = LogFactory.getLog(BanditssymbolsHome.class);

	private final SessionFactory sessionFactory = getSessionFactory();

	protected SessionFactory getSessionFactory() {
		try {
			return (SessionFactory) new InitialContext().lookup("SessionFactory");
		} catch (Exception e) {
			log.error("Could not locate SessionFactory in JNDI", e);
			throw new IllegalStateException("Could not locate SessionFactory in JNDI");
		}
	}

	public void persist(Banditssymbols transientInstance) {
		log.debug("persisting Banditssymbols instance");
		try {
			sessionFactory.getCurrentSession().persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void attachDirty(Banditssymbols instance) {
		log.debug("attaching dirty Banditssymbols instance");
		try {
			sessionFactory.getCurrentSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(Banditssymbols instance) {
		log.debug("attaching clean Banditssymbols instance");
		try {
			sessionFactory.getCurrentSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void delete(Banditssymbols persistentInstance) {
		log.debug("deleting Banditssymbols instance");
		try {
			sessionFactory.getCurrentSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public Banditssymbols merge(Banditssymbols detachedInstance) {
		log.debug("merging Banditssymbols instance");
		try {
			Banditssymbols result = (Banditssymbols) sessionFactory.getCurrentSession().merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public Banditssymbols findById(java.lang.Integer id) {
		log.debug("getting Banditssymbols instance with id: " + id);
		try {
			Banditssymbols instance = (Banditssymbols) sessionFactory.getCurrentSession().get("Banditssymbols", id);
			if (instance == null) {
				log.debug("get successful, no instance found");
			} else {
				log.debug("get successful, instance found");
			}
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List<Banditssymbols> findByExample(Banditssymbols instance) {
		log.debug("finding Banditssymbols instance by example");
		try {
			List<Banditssymbols> results = (List<Banditssymbols>) sessionFactory.getCurrentSession()
					.createCriteria("Banditssymbols").add(create(instance)).list();
			log.debug("find by example successful, result size: " + results.size());
			return results;
		} catch (RuntimeException re) {
			log.error("find by example failed", re);
			throw re;
		}
	}
}
