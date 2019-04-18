package fr.formation.inti.service.interfaces;

import java.sql.Date;
import java.util.List;

import fr.formation.inti.entities.Conge;

public interface ICongeService extends IGenericService<Conge>{

	List<Conge> getStartDate(Date date);

}
