package net.model;

public class Administrateur extends Personne{
	private int idAdministrateur;
	private String nom;
	private String prenom;
	
	public Administrateur() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getIdAdministrateur() {
		return idAdministrateur;
	}

	public void setIdAdministrateur(int idAdministrateur) {
		this.idAdministrateur = idAdministrateur;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	@Override
	public String toString() {
		return "Administrateur [idAdministrateur=" + idAdministrateur + ", nom=" + nom + ", prenom=" + prenom
				+ ", toString()=" + super.toString() + "]";
	}
	
	
	
	
	private int idAdmin;
	private String username;
	private String mail;
	
	public Administrateur(String username, String mail) {
		this.username = username;
		this.mail = mail;
	}

	public int getIdAdmin() {
		return idAdmin;
	}

	public void setIdAdmin(int idAdmin) {
		this.idAdmin = idAdmin;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}
	
	

}
