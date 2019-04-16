package fr.formation.inti.DAO;
// Generated 14 avr. 2019 19:56:00 by Hibernate Tools 5.1.10.Final

import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import fr.formation.inti.DAO.interfaces.IEmployeDao;
import fr.formation.inti.entities.Employe;

@Repository("employeDao")
@Transactional
public class EmployeDao extends GenericHibernateDao<Employe> implements IEmployeDao{

	static Class<Employe> type;
	public EmployeDao() {
		super(type);
		setType(Employe.class);;
	}
}