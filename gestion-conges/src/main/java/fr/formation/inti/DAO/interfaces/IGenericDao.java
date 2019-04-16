package fr.formation.inti.DAO.interfaces;

import java.io.Serializable;
import java.util.List;

public interface IGenericDao <T extends Serializable> {

	// Persist the newInstance object into database 
	void save(T newInstance);

	// Retrieve an object that was previously persisted to the database using the indicated id as primary key
	T findById(Integer id);    

	// Retrieve all objects from to the database
	List<T> getAll();

	// Save changes made to a persistent object
	void update(T transientObject);

	// Remove an object from persistent storage in the database
	void delete(T persistentObject);
}