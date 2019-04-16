package fr.formation.inti.DAO;
// Generated 14 avr. 2019 19:56:00 by Hibernate Tools 5.1.10.Final

import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import fr.formation.inti.DAO.interfaces.IProjetDao;
import fr.formation.inti.entities.Projet;

@Repository("projetDao")
@Transactional
public class ProjetDao extends GenericHibernateDao<Projet> implements IProjetDao{

	static Class<Projet> type;
	public ProjetDao() {
		super(type);
		setType(Projet.class);;
	}
}