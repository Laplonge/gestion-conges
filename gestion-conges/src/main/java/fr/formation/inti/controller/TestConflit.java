package fr.formation.inti.controller;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import fr.formation.inti.entities.Conge;
import fr.formation.inti.entities.Employe;
import fr.formation.inti.service.interfaces.ICongeService;
import fr.formation.inti.service.interfaces.IEmployeService;

public class TestConflit {
	private static final Log log = LogFactory.getLog(TestConflit.class);

	public static void main(String[] args) throws ParseException {

		ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

		IEmployeService es = (IEmployeService) context.getBean("employeService");
//	
//	List<Employe> allEmps = es.getAll();
//	
//	for (Employe emp : allEmps) {
//		log.info(emp);
//	}

		ICongeService cs = (ICongeService) context.getBean("congeService");
		List<Conge> allCong = cs.getAll();
		for (Conge Cong : allCong) {
			Employe emp = es.findById(Cong.getIdConge());

			log.info("Employe: " + emp.getNom() + " " + emp.getPrenom() + ", Date de Début: " + Cong.getDateDebut()
					+ ", Date de fin: " + Cong.getDateFin() + ", Date de demande: " + Cong.getDateDemande());
		}
		
		
		
		SimpleDateFormat dateformat = new SimpleDateFormat("yyyy-MM-dd");
		java.util.Date date = dateformat.parse("2019-04-17");
		java.sql.Date sqlStartDate = new java.sql.Date(date.getTime());

		date = dateformat.parse("2019-04-22");
		java.sql.Date sqlFinDate = new java.sql.Date(date.getTime());

		Date current = new Date();

		java.sql.Date sqlcurrent = new java.sql.Date(current.getTime());
		// Calcul le nombre de jour de vacances
		// Test si weekend ou pas
		int jourdevac = 0;
		for (LocalDate datetest = sqlStartDate.toLocalDate(); datetest
				.isBefore(sqlFinDate.toLocalDate().plusDays(1)); datetest = datetest.plusDays(1)) {
			log.info(datetest.getDayOfWeek());
			if (datetest.getDayOfWeek() == DayOfWeek.SATURDAY || datetest.getDayOfWeek() == DayOfWeek.SUNDAY) {
				log.info("C'est le weekend");
			} else {
				jourdevac++;
				log.info("C'est pas le weekend :(");
			}
		}
		
//		for (Conge cong : allCong) {
//
//			//check if resquest is old or not
//			if (!(cong.getDateDebut().before(sqlcurrent)) && cong.getStatutDeLaDemande().equals("en cours")) {
//
//				log.info(cong.getDateDebut() + " " + cong.getDateFin());
//				// check if employee holidays is okay with the database
//				if ((sqlStartDate.after(cong.getDateDebut()) && sqlStartDate.before(cong.getDateFin()))
//						|| (sqlFinDate.after(cong.getDateDebut()) && sqlFinDate.before(cong.getDateFin()))
//						|| (sqlStartDate.equals(cong.getDateDebut()) || sqlFinDate.equals(cong.getDateFin()))) {
//					log.info("Demande refusé");
//					return;
//				}
//				// check if database is okay with the employee holidays
//				if ((cong.getDateDebut().after(sqlStartDate) && cong.getDateDebut().before(sqlFinDate))
//						|| (cong.getDateFin().after(sqlStartDate) && cong.getDateFin().before(sqlFinDate))) {
//					log.info("Demande refusé_2");
//					return;
//				} else {
//					log.info("Demande acceptée");
//				}
//			}
//		}
		// check si vacances disponible

//		EmployeDao edao = new EmployeDao();
//		for (Employe emp : edao.getAll()) {
//			System.out.println(emp);
//		}
//		Integer id = 1;
//		log.debug(edao.findById(id));
//		Employe emp = new Employe();
//		emp.setPrenom("Marc");
//		emp.setNom("Heurindélébil");
		log.info(jourdevac);
		context.close();
		System.exit(0);

		// test
	}
}
