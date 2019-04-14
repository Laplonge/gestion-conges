package fr.formation.inti.DAO;
// Generated 14 avr. 2019 19:56:00 by Hibernate Tools 5.1.10.Final

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import fr.formation.inti.entities.Projet;

/**
 * Home object for domain model class Projet.
 * @see fr.formation.inti.DAO.Projet
 * @author Hibernate Tools
 */
@Stateless
public class ProjetDao {

	private static final Log log = LogFactory.getLog(ProjetDao.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(Projet transientInstance) {
		log.debug("persisting Projet instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(Projet persistentInstance) {
		log.debug("removing Projet instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public Projet merge(Projet detachedInstance) {
		log.debug("merging Projet instance");
		try {
			Projet result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public Projet findById(Integer id) {
		log.debug("getting Projet instance with id: " + id);
		try {
			Projet instance = entityManager.find(Projet.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
