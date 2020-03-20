
package net.model;

import java.io.Serializable;
import java.time.LocalDate;


/**
 * JavaBean class used in jsp action tags.
 * @author Ramesh Fadatare
 */
public class User extends Personne implements Serializable {
	private static final long serialVersionUID = 1L;
	private String prenom;
	private String nom;
	private LocalDate dateNaissance;
	private LocalDate dateInscription;
	private boolean banni;
	private int nbParties;
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
