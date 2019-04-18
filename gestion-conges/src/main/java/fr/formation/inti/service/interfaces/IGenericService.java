package fr.formation.inti.service.interfaces;

import java.util.List;
import java.util.Optional;

public interface IGenericService<G> {
	
	// Persist the newInstance object into database or Updates it if id is already in the db
	void save(G newInstance);

	// Retrieve an object that was previously persisted to the database using the indicated id as primary key
	Optional<G> findById(Integer id);    

	// Retrieve all objects from to the database
	List<G> getAll();
	
	// Remove an object from persistent storage in the database
	void delete(G persistentObject);

}
