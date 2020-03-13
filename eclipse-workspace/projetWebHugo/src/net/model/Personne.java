package net.model;


public class Personne {

	private String identifiant;
	private String motDePasse;
	private String pseudo;
	private String email;
	
	public String getUsername() {
		return identifiant;
	}
	public void setUsername(String username) {
		this.identifiant = username;
	}
	public String getPassword() {
		return motDePasse;
	}
	public void setPassword(String password) {
		this.motDePasse = password;
	}
}
