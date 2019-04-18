package fr.formation.inti.service;
// Generated 14 avr. 2019 19:56:00 by Hibernate Tools 5.1.10.Final

import java.sql.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.formation.inti.DAO.interfaces.ICongeDao;
import fr.formation.inti.entities.Conge;
import fr.formation.inti.service.interfaces.ICongeService;

@Service("congeService")
public class CongeService implements ICongeService{
	
	@Autowired
	ICongeDao congeDao;
	
	public void setEdao(ICongeDao congeDao) {
		this.congeDao = congeDao;
	}

	public Optional<Conge> findById(Integer id) {
		return congeDao.findById(id);
	}

	public List<Conge> getAll() {
		return congeDao.findAll();
	}

	public void save(Conge conge) {
		congeDao.save(conge);
	}

	public void delete(Conge conge) {
		congeDao.delete(conge);
	}

	@Override
	public List<Conge> getStartDate(Date date) {
		return congeDao.getStartDate(date);
	}
}