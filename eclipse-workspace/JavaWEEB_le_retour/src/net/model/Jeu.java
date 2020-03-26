package net.model;


public class Jeu {
	//attributs
	private int idJeu;
	private String nom;
	
	//Constructeur
	public Jeu(String nom) {
		this.nom = nom;
	}
	
	public Jeu() {
		// TODO Auto-generated constructor stub
	}

	public Jeu(int idJeu, String name) {
		super();
		this.idJeu = idJeu;
		this.nom = name;
	}

	//Méthodes
	public int getIdJeu() {
		return idJeu;
	}
	public void setIdJeu(int idJeu) {
		this.idJeu = idJeu;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	
}
