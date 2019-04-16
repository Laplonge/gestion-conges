package fr.formation.inti.service;
// Generated 14 avr. 2019 19:56:00 by Hibernate Tools 5.1.10.Final

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.formation.inti.DAO.interfaces.IEmployeDao;
import fr.formation.inti.entities.Employe;
import fr.formation.inti.service.interfaces.IEmployeService;

@Service("employeService")
public class EmployeService implements IEmployeService{
	
	@Autowired
	IEmployeDao edao;
	
	public void setEdao(IEmployeDao edao) {
		this.edao = edao;
	}

	public Employe findById(Integer id) {
		return edao.findById(id);
	}

	public List<Employe> getAll() {
		return edao.getAll();
	}

	public void save(Employe emp) {
		edao.save(emp);
	}

	public void update(Employe emp) {
		edao.update(emp);
	}

	public void delete(Employe emp) {
		edao.delete(emp);
	}
}