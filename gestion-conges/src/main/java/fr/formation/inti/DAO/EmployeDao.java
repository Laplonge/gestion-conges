package fr.formation.inti.DAO;
// Generated 14 avr. 2019 19:56:00 by Hibernate Tools 5.1.10.Final

import java.util.List;

import javax.transaction.Transactional;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import fr.formation.inti.entities.Employe;

@Repository
@Transactional
public class EmployeDao implements IEmployeDao{
	private static final Log log = LogFactory.getLog(EmployeDao.class);

	@Autowired
	private SessionFactory sessionFactory;

	public EmployeDao() {
	}

	@Override
	public Employe findById(Integer id) {
		Session session = sessionFactory.getCurrentSession();
		Employe emp = null;
		emp = (Employe) session.get(Employe.class.getName(), id);
		return emp;
	}

	@Override
	public List<Employe> getAll() {
		Session session = sessionFactory.getCurrentSession();
		List<Employe> allEmps = null;
		Query query = session.createQuery("from Employe");
		allEmps = query.list();
		return allEmps;
	}

	@Override
	public void update(Employe emp) {
		Session session = sessionFactory.getCurrentSession();
		session.saveOrUpdate(emp);

	}
	public void save(Employe emp) {
		Session session = sessionFactory.getCurrentSession();
		session.persist(emp);
	}

	@Override
	public void delete(Employe emp) {
		Session session = sessionFactory.getCurrentSession();
		session.delete(emp);

	}
}