package net.model;

import java.time.LocalDate;

public class PartieTerminee {
	
	private int idUtilisateur;
	private int idJeu;
	private LocalDate dateDebut;
	private LocalDate dateFin;
	
	public PartieTerminee(int idUtilisateur, int idJeu, LocalDate dateDebut, LocalDate dateFin) {
		super();
		this.idUtilisateur = idUtilisateur;
		this.idJeu = idJeu;
		this.dateDebut = dateDebut;
		this.dateFin = dateFin;
	}
	

}
