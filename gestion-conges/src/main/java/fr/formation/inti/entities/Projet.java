package fr.formation.inti.entities;
// Generated 14 avr. 2019 19:49:36 by Hibernate Tools 5.1.10.Final

import static javax.persistence.GenerationType.IDENTITY;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "projet", catalog = "tousenvacancesbd")
public class Projet implements java.io.Serializable {
	private static final long serialVersionUID = 1L;
	private Integer idProjet;
	private String sujet;
	private String client;

	public Projet() {
	}

	public Projet(Integer idProjet, String sujet, String client) {
		this.idProjet = idProjet;
		this.sujet = sujet;
		this.client = client;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "ID_PROJET", unique = true, nullable = false)
	public Integer getIdProjet() {
		return this.idProjet;
	}

	public void setIdProjet(Integer idProjet) {
		this.idProjet = idProjet;
	}

	@Column(name = "SUJET", nullable = false, length = 45)
	public String getSujet() {
		return this.sujet;
	}

	public void setSujet(String sujet) {
		this.sujet = sujet;
	}

	@Column(name = "CLIENT", nullable = false, length = 45)
	public String getClient() {
		return this.client;
	}

	public void setClient(String client) {
		this.client = client;
	}

}
