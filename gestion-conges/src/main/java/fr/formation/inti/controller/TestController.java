package fr.formation.inti.controller;

import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import fr.formation.inti.entities.Employe;
import fr.formation.inti.service.IEmployeService;

public class TestController {
	private static final Log log = LogFactory.getLog(TestController.class);

	public static void main(String[] args) {
		
	ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
	
	IEmployeService es = (IEmployeService) context.getBean("employeService");
	
	List<Employe> allEmps = es.getAll();
	
	for (Employe emp : allEmps) {
		log.info(emp);
	}
	
//		EmployeDao edao = new EmployeDao();
//		for (Employe emp : edao.getAll()) {
//			System.out.println(emp);
//		}
//		Integer id = 1;
//		log.debug(edao.findById(id));
//		Employe emp = new Employe();
//		emp.setPrenom("Marc");
//		emp.setNom("Heurindélébil");
		
		System.exit(0);
	}
}
