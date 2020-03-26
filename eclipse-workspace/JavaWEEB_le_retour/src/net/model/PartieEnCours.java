package net.model;

import java.time.LocalDateTime;

public class PartieEnCours {
	
	private int idUtilisateur;
	private int idJeu;
	private String nomUtilisateur;
	private String nomJeu;
	private LocalDateTime dateDebut;
	
	public PartieEnCours(int idUtilisateur, int idJeu, String nomUtilisateur, String nomJeu, LocalDateTime dateDebut) {
		super();
		this.idUtilisateur = idUtilisateur;
		this.idJeu = idJeu;
		this.nomUtilisateur = nomUtilisateur;
		this.nomJeu = nomJeu;
		this.dateDebut = dateDebut;
	}
	
	public float getDuree(){
		int diff = LocalDateTime.now().compareTo(dateDebut);
		return diff;
	}

	/*on a pas besoin de la durée, ce n'est pas demandé dans le consigne (mieux vaut pas se compliquer la vie ^^)*/
	
	
	
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
	

}
