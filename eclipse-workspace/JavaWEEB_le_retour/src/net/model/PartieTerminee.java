package net.model;

import java.time.Duration;
import java.time.LocalDateTime;

public class PartieTerminee {
	
	private int idUtilisateur;
	private int idJeu;
	private String nomJeu;
	private String nomUtilisateur;
	private LocalDateTime dateDebut;
	private LocalDateTime dateFin;
	
	public PartieTerminee(int idUtilisateur, int idJeu, String nomJeu, String nomUtilisateur, LocalDateTime dateDebut, LocalDateTime dateFin) {
		this.idUtilisateur = idUtilisateur;
		this.idJeu = idJeu;
		this.nomJeu = nomJeu;
		this.nomUtilisateur=nomUtilisateur;
		this.dateDebut = dateDebut;
		this.dateFin = dateFin;
	}
	
	public PartieTerminee(PartieEnCours partie, LocalDateTime dateFin) {
		this.idUtilisateur = partie.getIdUtilisateur();
		this.idJeu = partie.getIdJeu();
		this.nomUtilisateur = partie.getNomUtilisateur();
		this.nomJeu = partie.getNomJeu();
		this.dateDebut = partie.getDateDebut();
		this.dateFin = dateFin;
	}
	
	public String getDuree(){
		Duration duration = Duration.between(dateDebut, dateFin);
		long seconde = duration.getSeconds();
		long minute = seconde / 60;
		seconde = seconde - minute*60;
		return  minute + " min " + seconde + " s" ;
	}

	public String getNomUtilisateur() {
		return nomUtilisateur;
	}

	public void setNomUtilisateur(String nomUtilisateur) {
		this.nomUtilisateur = nomUtilisateur;
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
