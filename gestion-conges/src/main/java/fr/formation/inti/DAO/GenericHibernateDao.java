package fr.formation.inti.DAO;

import java.io.Serializable;
import java.util.List;

import javax.persistence.criteria.CriteriaQuery;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

import fr.formation.inti.DAO.interfaces.IGenericDao;

public class GenericHibernateDao<T extends Serializable> implements IGenericDao<T> {
	private Class<T> type;
	
	public GenericHibernateDao(Class<T> type) {
		this.type = type;
	}

	public void setType(Class<T> type) {
		this.type = type;
	}

	private static final Log log = LogFactory.getLog(GenericHibernateDao.class);

	@Autowired
	private SessionFactory sessionFactory;
	
	public Session getSession() {
		return sessionFactory.openSession();
	}

	@Override
	public void save(T newInstance) {
		log.info("Saving new instance of " + type.getName());
		getSession().save(newInstance);
	}

	@Override
	public T findById(Integer id) {
		log.info("Finding " + type.getName() + " with id = " + id);
		return (T) getSession().get(type, id);
	}

	@Override
	public List<T> getAll() {
		log.info("Finding every " + type.getName());
		CriteriaQuery<T> criteria = getSession().getCriteriaBuilder().createQuery(type);
		criteria.select(criteria.from(type));
		return getSession().createQuery(criteria).getResultList();
		
//		// la même chose mais en plus long :
//		CriteriaBuilder builder = getSession().getCriteriaBuilder();
//		CriteriaQuery<T> criteria = builder.createQuery(type);
//		Root<T> root = criteria.from(type);
//		criteria.select(root);
//		Query<T> query = getSession().createQuery(criteria);
//		List<T> all= query.getResultList();
//		return all;
	}

	@Override
	public void update(T transientObject) {
		log.info("Updating transient instance of" + type.getName());
		getSession().update(transientObject);
	}

	@Override
	public void delete(T persistentObject) {
		log.info("Deleting persistent instance of " + type.getName());
		getSession().delete(persistentObject);
	}
}