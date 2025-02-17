
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
		this.jeuxFavoris = new ArrayList<Jeu>();
	}
	
	public User(String identifiant, String prenom, String nom, LocalDate dateNaissance, LocalDate dateInscription, boolean banni,
			int nbParties) {
		super();
		this.setIdentifiant(identifiant);
		this.prenom = prenom;
		this.nom = nom;
		this.dateNaissance = dateNaissance;
		this.dateInscription = dateInscription;
		this.banni = banni;
		this.nbParties = nbParties;
		this.jeuxFavoris = new ArrayList<Jeu>();
	}

	public User(int idUtilisateur, String identifiant, String prenom, String nom, LocalDate dateNaissance, LocalDate dateInscription, boolean banni,
			int nbParties) {
		super();
		this.idUtilisateur = idUtilisateur;
		this.setIdentifiant(identifiant);
		this.prenom = prenom;
		this.nom = nom;
		this.dateNaissance = dateNaissance;
		this.dateInscription = dateInscription;
		this.banni = banni;
		this.nbParties = nbParties;
		this.jeuxFavoris = new ArrayList<Jeu>();
	}
	
	public User(int idUtilisateur, String identifiant, String prenom, String nom, LocalDate dateNaissance, LocalDate dateInscription, boolean banni,
			int nbParties, String email) {
		super();
		this.idUtilisateur = idUtilisateur;
		this.setIdentifiant(identifiant);
		this.prenom = prenom;
		this.nom = nom;
		this.dateNaissance = dateNaissance;
		this.dateInscription = dateInscription;
		this.banni = banni;
		this.nbParties = nbParties;
		this.jeuxFavoris = new ArrayList<Jeu>();
		this.setEmail(email);
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


	@Override
	public String toString() {
		return "User [idUtilisateur=" + idUtilisateur + ", prenom=" + prenom + ", nom=" + nom + ", dateNaissance="
				+ dateNaissance + ", dateInscription=" + dateInscription + ", banni=" + banni + ", nbParties="
				+ nbParties + ", jeuxFavoris=" + jeuxFavoris + "]";
	}

	

}
