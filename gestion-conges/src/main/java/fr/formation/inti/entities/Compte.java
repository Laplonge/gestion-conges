package fr.formation.inti.entities;
// Generated 14 avr. 2019 19:49:36 by Hibernate Tools 5.1.10.Final

import static javax.persistence.GenerationType.IDENTITY;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "compte", catalog = "tousenvacancesbd")
public class Compte implements java.io.Serializable {

	private static final long serialVersionUID = 1L;
	private Integer idCompte;
	private Employe employe;
	private String login;
	private String motDePasse;
	private String role;

	public Compte() {
	}

	public Compte(Employe employe, String login, String motDePasse) {
		this.employe = employe;
		this.login = login;
		this.motDePasse = motDePasse;
	}

	public Compte(Employe employe, String login, String motDePasse, String role) {
		this.employe = employe;
		this.login = login;
		this.motDePasse = motDePasse;
		this.role = role;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "ID_COMPTE", unique = true, nullable = false)
	public Integer getIdCompte() {
		return this.idCompte;
	}

	public void setIdCompte(Integer idCompte) {
		this.idCompte = idCompte;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "ID_EMPLOYE", nullable = false)
	public Employe getEmploye() {
		return this.employe;
	}

	public void setEmploye(Employe employe) {
		this.employe = employe;
	}

	@Column(name = "LOGIN", nullable = false, length = 45)
	public String getLogin() {
		return this.login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	@Column(name = "MOT_DE_PASSE", nullable = false, length = 45)
	public String getMotDePasse() {
		return this.motDePasse;
	}

	public void setMotDePasse(String motDePasse) {
		this.motDePasse = motDePasse;
	}

	@Column(name = "ROLE", length = 45)
	public String getRole() {
		return this.role;
	}

	public void setRole(String role) {
		this.role = role;
	}

}
