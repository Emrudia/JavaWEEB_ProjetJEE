package net.model;

import java.time.LocalDate;

public class PartieTerminee {
	
	private int idUtilisateur;
	private int idJeu;
	private LocalDate dateDebut;
	private LocalDate dateFin;
	
	public PartieTerminee(int idUtilisateur, int idJeu, LocalDate dateDebut, LocalDate dateFin) {
		super();
		this.idUtilisateur = idUtilisateur;
		this.idJeu = idJeu;
		this.dateDebut = dateDebut;
		this.dateFin = dateFin;
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
