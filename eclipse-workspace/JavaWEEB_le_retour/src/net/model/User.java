
package net.model;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.ArrayList;


/**
 * JavaBean class used in jsp action tags.
 * @author Ramesh Fadatare
 */
public class User extends Personne implements Serializable {
	private static final long serialVersionUID = 1L;
	private int idUtilisateur;
	private String prenom;
	private String nom;
	private LocalDate dateNaissance;
	private LocalDate dateInscription;
	private boolean banni;
	private int nbParties;
	private ArrayList<Jeu> jeuxFavoris;
	
	public ArrayList<Jeu> getJeuxFavoris() {
		return jeuxFavoris;
	}
	
	
	public int getIdUtilisateur() {
		return idUtilisateur;
	}


	public void setIdUtilisateur(int idUtilisateur) {
		this.idUtilisateur = idUtilisateur;
	}


	public void setJeuxFavoris(ArrayList<Jeu> jeuxFavoris) {
		this.jeuxFavoris = jeuxFavoris;
	}
	
	public User(String prenom, String nom, LocalDate dateNaissance, LocalDate dateInscription, boolean banni,
			int nbParties) {
		super();
		this.prenom = prenom;
		this.nom = nom;
		this.dateNaissance = dateNaissance;
		this.dateInscription = dateInscription;
		this.banni = banni;
		this.nbParties = nbParties;
	}
	
	public User() {
		// TODO Auto-generated constructor stub
	}

	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public LocalDate getDateNaissance() {
		return dateNaissance;
	}
	public void setDateNaissance(LocalDate dateNaissance) {
		this.dateNaissance = dateNaissance;
	}
	public LocalDate getDateInscription() {
		return dateInscription;
	}
	public void setDateInscription(LocalDate dateInscription) {
		this.dateInscription = dateInscription;
	}
	public boolean isBanni() {
		return banni;
	}
	public void setBanni(boolean banni) {
		this.banni = banni;
	}
	public int getNbParties() {
		return nbParties;
	}
	public void setNbParties(int nbParties) {
		this.nbParties = nbParties;
	}

	

}
