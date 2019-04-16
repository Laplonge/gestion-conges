package fr.formation.inti.service;
// Generated 14 avr. 2019 19:56:00 by Hibernate Tools 5.1.10.Final

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.formation.inti.DAO.interfaces.IProjetDao;
import fr.formation.inti.entities.Projet;
import fr.formation.inti.service.interfaces.IProjetService;

@Service("projetService")
public class ProjetService implements IProjetService{
	
	@Autowired
	IProjetDao pdao;
	
	public void setEdao(IProjetDao pdao) {
		this.pdao = pdao;
	}

	public Projet findById(Integer id) {
		return pdao.findById(id);
	}

	public List<Projet> getAll() {
		return pdao.getAll();
	}

	public void save(Projet projet) {
		pdao.save(projet);
	}

	public void update(Projet projet) {
		pdao.update(projet);
	}

	public void delete(Projet projet) {
		pdao.delete(projet);
	}
}