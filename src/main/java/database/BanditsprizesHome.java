package database;

import java.util.List;
import javax.naming.InitialContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.hibernate.SessionFactory;
import static org.hibernate.criterion.Example.create;

/**
 * Home object for domain model class Banditsprizes.
 * @see .Banditsprizes
 * @author Hibernate Tools
 */
public class BanditsprizesHome {

	private static final Log log = LogFactory.getLog(BanditsprizesHome.class);

	private final SessionFactory sessionFactory = getSessionFactory();

	protected SessionFactory getSessionFactory() {
		try {
			return (SessionFactory) new InitialContext().lookup("SessionFactory");
		} catch (Exception e) {
			log.error("Could not locate SessionFactory in JNDI", e);
			throw new IllegalStateException("Could not locate SessionFactory in JNDI");
		}
	}

	public void persist(Banditsprizes transientInstance) {
		log.debug("persisting Banditsprizes instance");
		try {
			sessionFactory.getCurrentSession().persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void attachDirty(Banditsprizes instance) {
		log.debug("attaching dirty Banditsprizes instance");
		try {
			sessionFactory.getCurrentSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(Banditsprizes instance) {
		log.debug("attaching clean Banditsprizes instance");
		try {
			sessionFactory.getCurrentSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void delete(Banditsprizes persistentInstance) {
		log.debug("deleting Banditsprizes instance");
		try {
			sessionFactory.getCurrentSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public Banditsprizes merge(Banditsprizes detachedInstance) {
		log.debug("merging Banditsprizes instance");
		try {
			Banditsprizes result = (Banditsprizes) sessionFactory.getCurrentSession().merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public Banditsprizes findById(java.lang.Integer id) {
		log.debug("getting Banditsprizes instance with id: " + id);
		try {
			Banditsprizes instance = (Banditsprizes) sessionFactory.getCurrentSession().get("Banditsprizes", id);
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

	public List<Banditsprizes> findByExample(Banditsprizes instance) {
		log.debug("finding Banditsprizes instance by example");
		try {
			List<Banditsprizes> results = (List<Banditsprizes>) sessionFactory.getCurrentSession()
					.createCriteria("Banditsprizes").add(create(instance)).list();
			log.debug("find by example successful, result size: " + results.size());
			return results;
		} catch (RuntimeException re) {
			log.error("find by example failed", re);
			throw re;
		}
	}
}
