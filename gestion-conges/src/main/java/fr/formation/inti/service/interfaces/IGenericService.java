package fr.formation.inti.service.interfaces;

import java.util.List;

public interface IGenericService<G> {
	
	// Persist the newInstance object into database 
	void save(G newInstance);

	// Retrieve an object that was previously persisted to the database using the indicated id as primary key
	G findById(Integer id);    

	// Retrieve all objects from to the database
	List<G> getAll();

	// Save changes made to a persistent object
	void update(G transientObject);

	// Remove an object from persistent storage in the database
	void delete(G persistentObject);

}
