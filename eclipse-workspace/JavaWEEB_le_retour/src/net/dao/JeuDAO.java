package net.dao;

import java.util.List;

import net.model.Jeu;

public interface JeuDAO {
	public List<Jeu> rechercheJeux(String recherche);
}

