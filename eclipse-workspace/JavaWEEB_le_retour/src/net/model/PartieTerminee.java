package net.model;

import java.util.Date;

public class PartieTerminee {
	
	private int idUtilisateur;
	private int idJeu;
	private String nomUtilisateur;
	private String nomJeu;
	private Date dateDebut; //Mais c'est deprecated :o
	private Date dateFin;
	
	public PartieTerminee(int idUtilisateur, int idJeu, String nomUtilisateur, String nomJeu, Date dateDebut, Date dateFin) {
		super();
		this.idUtilisateur = idUtilisateur;
		this.idJeu = idJeu;
		this.nomUtilisateur = nomUtilisateur;
		this.nomJeu = nomJeu;
		this.dateDebut = dateDebut;
		this.dateFin = dateFin;
	}
	
	public int getDuree(){
		int diff = (int) (dateDebut.getTime() - dateFin.getTime());
		int nbHeures =  (int) (diff / 3600000.0f);
		return nbHeures;
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
