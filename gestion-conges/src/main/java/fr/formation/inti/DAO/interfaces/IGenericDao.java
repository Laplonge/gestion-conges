package fr.formation.inti.DAO.interfaces;

import java.util.List;
import java.util.Optional;

import org.springframework.data.repository.Repository;

public interface IGenericDao<T> extends Repository<T, Integer> {
	
	public List<T> findAll();
	
	public Optional<T> findById(Integer id);
	
	public void delete(T t);
	
	public void save(T t);
}
