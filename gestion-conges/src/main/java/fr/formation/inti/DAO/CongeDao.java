package fr.formation.inti.DAO;
// Generated 14 avr. 2019 19:56:00 by Hibernate Tools 5.1.10.Final

import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import fr.formation.inti.DAO.interfaces.ICongeDao;
import fr.formation.inti.entities.Conge;

@Repository("congeDao")
@Transactional
public class CongeDao extends GenericHibernateDao<Conge> implements ICongeDao{

	static Class<Conge> type;
	public CongeDao() {
		super(type);
		setType(Conge.class);;
	}
}