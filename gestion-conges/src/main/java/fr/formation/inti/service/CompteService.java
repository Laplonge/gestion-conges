package fr.formation.inti.service;
// Generated 14 avr. 2019 19:56:00 by Hibernate Tools 5.1.10.Final

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.formation.inti.DAO.interfaces.ICompteDao;
import fr.formation.inti.entities.Compte;
import fr.formation.inti.service.interfaces.ICompteService;

@Service("compteService")
public class CompteService implements ICompteService{
	
	@Autowired
	ICompteDao compteDao;
	
	public void setEdao(ICompteDao compteDao) {
		this.compteDao = compteDao;
	}

	public Compte findById(Integer id) {
		return compteDao.findById(id);
	}

	public List<Compte> getAll() {
		return compteDao.getAll();
	}

	public void save(Compte compte) {
		compteDao.save(compte);
	}

	public void update(Compte compte) {
		compteDao.update(compte);
	}

	public void delete(Compte compte) {
		compteDao.delete(compte);
	}
}