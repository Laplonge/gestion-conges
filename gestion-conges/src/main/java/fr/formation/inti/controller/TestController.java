package fr.formation.inti.controller;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import fr.formation.inti.entities.Employe;
import fr.formation.inti.service.interfaces.IEmployeService;
import fr.formation.inti.utils.HibernateUtils;

public class TestController {
	private static final Log log = LogFactory.getLog(TestController.class);

	public static void main(String[] args) {
		
		ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
//		SessionFactory sessionFactory = HibernateUtils.getSessionFactory();
//		Session session = sessionFactory.openSession();
//		List<Employe> allEmps = session.createQuery("from " + Employe.class.getName()).list();
		
		IEmployeService es = (IEmployeService) context.getBean("employeService");
		List<Employe> allEmps = es.getAll();
		
		for (Employe emp : allEmps) {
			log.info(emp);
		}

		log.info("--------------------------------------");
		log.info(es.findById(1));
		
//		getTypeParameterClass();
		
		
		System.exit(0);
	}
//	public static Class<Employe> getTypeParameterClass(){
//        Type type = getClass().getGenericSuperclass();
//        ParameterizedType paramType = (ParameterizedType) type;
//        return (Class<Employe>) paramType.getActualTypeArguments()[0];
//    }
}
