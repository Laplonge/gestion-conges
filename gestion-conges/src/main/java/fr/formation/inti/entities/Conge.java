package fr.formation.inti.entities;
// Generated 14 avr. 2019 19:49:36 by Hibernate Tools 5.1.10.Final

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "conge", catalog = "tousenvacancesbd")
public class Conge implements java.io.Serializable {

	private static final long serialVersionUID = 1L;
	private Integer idConge;
	private Employe employe;
	private Date dateDebut;
	private Date dateFin;
	private int dureeJours;
	private Date dateDemande;
	private String statutDeLaDemande;
	private Date dateTraitement;

	public Conge() {
	}

	public Conge(Employe employe, Date dateDebut, Date dateFin, int dureeJours, Date dateDemande,
			String statutDeLaDemande) {
		this.employe = employe;
		this.dateDebut = dateDebut;
		this.dateFin = dateFin;
		this.dureeJours = dureeJours;
		this.dateDemande = dateDemande;
		this.statutDeLaDemande = statutDeLaDemande;
	}

	public Conge(Employe employe, Date dateDebut, Date dateFin, int dureeJours, Date dateDemande,
			String statutDeLaDemande, Date dateTraitement) {
		this.employe = employe;
		this.dateDebut = dateDebut;
		this.dateFin = dateFin;
		this.dureeJours = dureeJours;
		this.dateDemande = dateDemande;
		this.statutDeLaDemande = statutDeLaDemande;
		this.dateTraitement = dateTraitement;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "ID_CONGE", unique = true, nullable = false)
	public Integer getIdConge() {
		return this.idConge;
	}

	public void setIdConge(Integer idConge) {
		this.idConge = idConge;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "ID_EMPLOYE", nullable = false)
	public Employe getEmploye() {
		return this.employe;
	}

	public void setEmploye(Employe employe) {
		this.employe = employe;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "DATE_DEBUT", nullable = false, length = 10)
	public Date getDateDebut() {
		return this.dateDebut;
	}

	public void setDateDebut(Date dateDebut) {
		this.dateDebut = dateDebut;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "DATE_FIN", nullable = false, length = 10)
	public Date getDateFin() {
		return this.dateFin;
	}

	public void setDateFin(Date dateFin) {
		this.dateFin = dateFin;
	}

	@Column(name = "DUREE_JOURS", nullable = false)
	public int getDureeJours() {
		return this.dureeJours;
	}

	public void setDureeJours(int dureeJours) {
		this.dureeJours = dureeJours;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "DATE_DEMANDE", nullable = false, length = 10)
	public Date getDateDemande() {
		return this.dateDemande;
	}

	public void setDateDemande(Date dateDemande) {
		this.dateDemande = dateDemande;
	}

	@Column(name = "STATUT_DE_LA_DEMANDE", nullable = false, length = 16)
	public String getStatutDeLaDemande() {
		return this.statutDeLaDemande;
	}

	public void setStatutDeLaDemande(String statutDeLaDemande) {
		this.statutDeLaDemande = statutDeLaDemande;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "DATE_TRAITEMENT", length = 10)
	public Date getDateTraitement() {
		return this.dateTraitement;
	}

	public void setDateTraitement(Date dateTraitement) {
		this.dateTraitement = dateTraitement;
	}

}
