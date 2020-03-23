package net.model;

import java.util.Date;

public class PartieTerminee {
	
	private int idUtilisateur;
	private int idJeu;
	private String nom;
	private Date dateDebut;
	private Date dateFin;
	
	public PartieTerminee(int idUtilisateur, int idJeu, String nom, Date dateDebut, Date dateFin) {
		super();
		this.idUtilisateur = idUtilisateur;
		this.idJeu = idJeu;
		this.nom=nom;
		this.dateDebut = dateDebut;
		this.dateFin = dateFin;
	}
	
	public float getDuree(){
		long diff = dateDebut.getTime() - dateFin.getTime();
		int nbHeures =  (int) (diff / 3600000.0f);
		return nbHeures;
	}
	
	public String getNom() {
		return nom;
	}
	
	public void setNom(String nom) {
		this.nom=nom;
	}


	public int getIdUtilisateur() {
		return idUtilisateur;
	}

	public void setIdUtilisateur(int idUtilisateur) {
		this.idUtilisateur = idUtilisateur;
	}

	public int getIdJeu() {
		return idJeu;
	}

	public void setIdJeu(int idJeu) {
		this.idJeu = idJeu;
	}

	public Date getDateDebut() {
		return dateDebut;
	}

	public void setDateDebut(Date dateDebut) {
		this.dateDebut = dateDebut;
	}

	public Date getDateFin() {
		return dateFin;
	}

	public void setDateFin(Date dateFin) {
		this.dateFin = dateFin;
	}
	
	
	
	

}
