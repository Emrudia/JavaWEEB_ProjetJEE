
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
	public String getFirstName() {
		return prenom;
	}
	public void setFirstName(String firstName) {
		this.prenom = firstName;
	}
	public String getLastName() {
		return nom;
	}
	public void setLastName(String lastName) {
		this.nom = lastName;
	}


}
