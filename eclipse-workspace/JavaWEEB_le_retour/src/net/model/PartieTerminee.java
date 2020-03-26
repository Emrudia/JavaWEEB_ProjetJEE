package net.model;

import java.time.LocalDateTime;

public class PartieTerminee {
	
	private int idUtilisateur;
	private int idJeu;
	private String nomJeu;
	private LocalDateTime dateDebut;
	private LocalDateTime dateFin;
	
	public PartieTerminee(int idUtilisateur, int idJeu, String nomJeu, LocalDateTime dateDebut, LocalDateTime dateFin) {
		super();
		this.idUtilisateur = idUtilisateur;
		this.idJeu = idJeu;
		this.nomJeu = nomJeu;
		this.dateDebut = dateDebut;
		this.dateFin = dateFin;
	}
	
	public PartieTerminee(PartieEnCours partie, LocalDateTime dateFin) {
		super();
		this.idUtilisateur = partie.getIdUtilisateur();
		this.idJeu = partie.getIdJeu();
		this.nomUtilisateur = partie.getNomUtilisateur();
		this.nomJeu = partie.getNomJeu();
		this.dateDebut = partie.getDateDebut();
		this.dateFin = dateFin;
	}
	
	public int getDuree(){
		int diff = (int) (dateFin.compareTo(dateDebut));
		int nbHeures =  (int) (diff / 3600000.0f);
		return nbHeures;
	}

	public String getNomJeu() {
		return nomJeu;
	}

	public void setNomJeu(String nomJeu) {
		this.nomJeu = nomJeu;
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

	public LocalDateTime getDateDebut() {
		return dateDebut;
	}

	public void setDateDebut(LocalDateTime dateDebut) {
		this.dateDebut = dateDebut;
	}

	public LocalDateTime getDateFin() {
		return dateFin;
	}

	public void setDateFin(LocalDateTime dateFin) {
		this.dateFin = dateFin;
	}
	
	
	
	

}
