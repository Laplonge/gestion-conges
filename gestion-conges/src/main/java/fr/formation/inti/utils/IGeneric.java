package fr.formation.inti.utils;

import java.util.List;

public interface IGeneric<G> {
	//Create
	void save(G g);
	
	//Read
	G findById(Integer id);
	List<G> getAll();
	
	//Update
	void update(G g);

	//Delete
	void delete(G g);
}
