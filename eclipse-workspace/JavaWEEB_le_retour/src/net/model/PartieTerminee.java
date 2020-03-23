package net.model;

import java.text.SimpleDateFormat;
import java.time.LocalDate;

public class PartieTerminee {
	
	private int idUtilisateur;
	private int idJeu;
	private String nom;
	private SimpleDateFormat dateDebut;
	private SimpleDateFormat dateFin;
	
	public PartieTerminee(int idUtilisateur, int idJeu, String nom, SimpleDateFormat dateDebut, SimpleDateFormat dateFin) {
		super();
		this.idUtilisateur = idUtilisateur;
		this.idJeu = idJeu;
		this.nom=nom;
		this.dateDebut = dateDebut;
		this.dateFin = dateFin;
	}
	
	public int getDuree(){
		long diff = dateDebut.getTime() - dateFin.getTime();
		float nbHeures = diff / 3600000.0f;
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

	public LocalDate getDateDebut() {
		return dateDebut;
	}

	public void setDateDebut(LocalDate dateDebut) {
		this.dateDebut = dateDebut;
	}

	public LocalDate getDateFin() {
		return dateFin;
	}

	public void setDateFin(LocalDate dateFin) {
		this.dateFin = dateFin;
	}
	
	
	
	

}
