package fr.formation.inti.DAO.interfaces;

import java.sql.Date;
import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import fr.formation.inti.entities.Conge;

public interface ICongeDao extends IGenericDao<Conge> {
	
	@Query(value="Select * FROM Conge Where date_debut > :date AND statut_de_la_demande = 'en cours'")
	List<Conge> getStartDate(@Param("date") Date date);
}
