package fr.formation.inti.DAO;
// Generated 14 avr. 2019 19:56:00 by Hibernate Tools 5.1.10.Final

import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import fr.formation.inti.DAO.interfaces.ICompteDao;
import fr.formation.inti.entities.Compte;

@Repository("compteDao")
@Transactional
public class CompteDao extends GenericHibernateDao<Compte> implements ICompteDao{

	static Class<Compte> type;
	public CompteDao() {
		super(type);
		setType(Compte.class);;
	}
}