package net.model;

import java.util.Date;

public class PartieEnCours {
	
	private int idUtilisateur;
	private int idJeu;
	private String nomUtilisateur;
	private String nomJeu;
	private Date dateDebut;
	
	public PartieEnCours(int idUtilisateur, int idJeu, String nomUtilisateur, String nomJeu, Date dateDebut) {
		super();
		this.idUtilisateur = idUtilisateur;
		this.idJeu = idJeu;
		this.nomUtilisateur = nomUtilisateur;
		this.nomJeu = nomJeu;
		this.dateDebut = dateDebut;
	}
	
/* On pourrait remplacer ça par un getDuree de partie jusqu'à maintenant, mais je sais pas faire sans LocalDate
	public float getDuree(){
		long diff = dateDebut.getTime() - LocalDate.now();
		int nbHeures =  (int) (diff / 3600000.0f);
		return nbHeures;
	}
*/
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

	public Date getDateDebut() {
		return dateDebut;
	}

	public void setDateDebut(Date dateDebut) {
		this.dateDebut = dateDebut;
	}
	

}
