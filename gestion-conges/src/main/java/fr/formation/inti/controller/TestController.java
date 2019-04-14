package fr.formation.inti.controller;

import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import fr.formation.inti.entities.Employe;
import fr.formation.inti.utils.HibernateUtils;

public class TestController {
	private static final Log log = LogFactory.getLog(TestController.class);

	public static void main(String[] args) {
		
		SessionFactory sessionFactory = HibernateUtils.getSessionFactory();

		Session session = sessionFactory.openSession();

		CriteriaBuilder cb = session.getCriteriaBuilder();

		log.debug("==== getting all employees");
		CriteriaQuery<Employe> criteriaQuery = cb.createQuery(Employe.class);
		Root<Employe> employeRoot = criteriaQuery.from(Employe.class);
		List<Employe> results = session.createQuery(criteriaQuery).getResultList();
				
		for (Employe emp : results) {
			System.out.println(emp);
		}
		
		System.exit(0);
	}

}
