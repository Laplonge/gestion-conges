package fr.formation.inti.DAO;
// Generated 14 avr. 2019 19:56:00 by Hibernate Tools 5.1.10.Final

import javax.persistence.EntityManager;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import fr.formation.inti.entities.Conge;

//@Repository("congeDao")
public class CongeDao {

	private static final Log log = LogFactory.getLog(CongeDao.class);

//	@PersistenceContext
	private EntityManager entityManager;

	public void persist(Conge transientInstance) {
		log.debug("persisting Conge instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(Conge persistentInstance) {
		log.debug("removing Conge instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public Conge merge(Conge detachedInstance) {
		log.debug("merging Conge instance");
		try {
			Conge result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public Conge findById(Integer id) {
		log.debug("getting Conge instance with id: " + id);
		try {
			Conge instance = entityManager.find(Conge.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
