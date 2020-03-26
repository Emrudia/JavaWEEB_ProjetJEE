package net.model;

public class Administrateur extends Personne{
	
	
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
