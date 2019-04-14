package fr.formation.inti.entities;
// Generated 14 avr. 2019 19:49:36 by Hibernate Tools 5.1.10.Final

import static javax.persistence.GenerationType.IDENTITY;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "employe", catalog = "tousenvacancesbd")
public class Employe implements java.io.Serializable {

	private static final long serialVersionUID = 1L;
	private Integer idEmploye;
	private String nom;
	private String prenom;
	private String grade;
	private String adresseMail;
	private String numeroTelephone;
	private String urlPhoto;
//	private Set<Conge> conges = new HashSet<Conge>(0);
//	private Compte compte = new Compte();

	public Employe() {
	}

	public Employe(String nom) {
		this.nom = nom;
	}

		public Employe(String nom, String prenom, String grade) {
			this.nom = nom;
		this.prenom = prenom;
		this.grade = grade;
	}

	public Employe(String nom, String prenom, String grade, String adresseMail, String numeroTelephone, String urlPhoto) {
		this.nom = nom;
		this.prenom = prenom;
		this.grade = grade;
		this.adresseMail = adresseMail;
		this.numeroTelephone = numeroTelephone;
		this.urlPhoto = urlPhoto;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "ID_EMPLOYE", unique = true, nullable = false)
	public Integer getIdEmploye() {
		return this.idEmploye;
	}

	public void setIdEmploye(Integer idEmploye) {
		this.idEmploye = idEmploye;
	}

	@Column(name = "NOM", nullable = false, length = 45)
	public String getNom() {
		return this.nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	@Column(name = "PRENOM", nullable = false, length = 45)
	public String getPrenom() {
		return this.prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	@Column(name = "GRADE", nullable = false, length = 45)
	public String getGrade() {
		return this.grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}

	@Column(name = "ADRESSE_MAIL", length = 45)
	public String getAdresseMail() {
		return this.adresseMail;
	}

	public void setAdresseMail(String adresseMail) {
		this.adresseMail = adresseMail;
	}

	@Column(name = "NUMERO_TELEPHONE", length = 15)
	public String getNumeroTelephone() {
		return this.numeroTelephone;
	}

	public void setNumeroTelephone(String numeroTelephone) {
		this.numeroTelephone = numeroTelephone;
	}

	@Column(name = "URL_PHOTO", length = 45)
	public String getUrlPhoto() {
		return this.urlPhoto;
	}

	public void setUrlPhoto(String urlPhoto) {
		this.urlPhoto = urlPhoto;
	}

	@Override
	public String toString() {
		return "Employe [idEmploye=" + idEmploye + ", prenom=" + prenom + ", nom=" + nom + ", grade=" + grade + "]";
	}

//	TODO
//	méthodes générées par défaut pour les entities congé et compte, mais ça fait planter.
//	@OneToMany(fetch = FetchType.LAZY, mappedBy = "employe")
//	public Set<Conge> getConges() {
//		return this.conges;
//	}
//
//	public void setConges(Set<Conge> conges) {
//		this.conges = conges;
//	}
//
//	@OneToOne(fetch = FetchType.LAZY, mappedBy = "employe")
//	public Compte getCompte() {
//		return this.compte;
//	}
//
//	public void setCompte(Compte compte) {
//		this.compte = compte;
//	}

}
