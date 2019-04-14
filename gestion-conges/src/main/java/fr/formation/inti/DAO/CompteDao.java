package fr.formation.inti.DAO;
// Generated 14 avr. 2019 19:56:00 by Hibernate Tools 5.1.10.Final

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import fr.formation.inti.entities.Compte;

/**
 * Home object for domain model class Compte.
 * @see fr.formation.inti.DAO.Compte
 * @author Hibernate Tools
 */
@Stateless
public class CompteDao {

	private static final Log log = LogFactory.getLog(CompteDao.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(Compte transientInstance) {
		log.debug("persisting Compte instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(Compte persistentInstance) {
		log.debug("removing Compte instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public Compte merge(Compte detachedInstance) {
		log.debug("merging Compte instance");
		try {
			Compte result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public Compte findById(Integer id) {
		log.debug("getting Compte instance with id: " + id);
		try {
			Compte instance = entityManager.find(Compte.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
