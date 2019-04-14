package fr.formation.inti.DAO;
// Generated 14 avr. 2019 19:56:00 by Hibernate Tools 5.1.10.Final

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import fr.formation.inti.entities.Employe;

/**
 * Home object for domain model class Employe.
 * @see fr.formation.inti.DAO.Employe
 * @author Hibernate Tools
 */
@Stateless
public class EmployeDao {

	private static final Log log = LogFactory.getLog(EmployeDao.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(Employe transientInstance) {
		log.debug("persisting Employe instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(Employe persistentInstance) {
		log.debug("removing Employe instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public Employe merge(Employe detachedInstance) {
		log.debug("merging Employe instance");
		try {
			Employe result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public Employe findById(Integer id) {
		log.debug("getting Employe instance with id: " + id);
		try {
			Employe instance = entityManager.find(Employe.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
