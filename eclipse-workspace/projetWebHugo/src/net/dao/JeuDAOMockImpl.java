package net.dao;

import java.util.ArrayList;
import java.util.List;

import net.model.Jeu;

public class JeuDAOMockImpl implements JeuDAO{

	@Override
	public List<Jeu> tousJeux() {
		List<Jeu> listJeu = new ArrayList<Jeu>();
		listJeu.add(new Jeu("League of Legends"));
		listJeu.add(new Jeu("World of Tanks"));
		listJeu.add(new Jeu("World of Warships"));
		listJeu.add(new Jeu("World of Plane"));
		listJeu.add(new Jeu("Ori"));
		listJeu.add(new Jeu("Call of Duty"));
		listJeu.add(new Jeu("Monster Hunter World"));
		listJeu.add(new Jeu("Monster Hunter Freedom Unite"));
		listJeu.add(new Jeu("Monster Hunter Online"));
		listJeu.add(new Jeu("Monster Hunter Third"));
		listJeu.add(new Jeu("Monster Hunter Tri"));
		listJeu.add(new Jeu("Monster Hunter"));
		listJeu.add(new Jeu("Farming Simulator 2020"));
		listJeu.add(new Jeu("Farming Simulator 2019"));
		listJeu.add(new Jeu("Farming Simulator 2018"));
		listJeu.add(new Jeu("Farming Simulator 2017"));
		listJeu.add(new Jeu("Farming Simulator 2016"));
		listJeu.add(new Jeu("Farming Simulator 2015"));
		listJeu.add(new Jeu("Farming Simulator 2014"));
		listJeu.add(new Jeu("Farming Simulator 2013"));
		listJeu.add(new Jeu("Farming Simulator 2012"));
		listJeu.add(new Jeu("Farming Simulator 2011"));
		listJeu.add(new Jeu("PUBG"));
		listJeu.add(new Jeu("CS:GO"));
		listJeu.add(new Jeu("Osu"));
		listJeu.add(new Jeu("Rocket League"));
		listJeu.add(new Jeu("Overcooked"));
		listJeu.add(new Jeu("Fornite"));
		listJeu.add(new Jeu("Warframe"));
		listJeu.add(new Jeu("Faze10"));
		listJeu.add(new Jeu("GooseGame.io"));
		return listJeu;
	}

	@Override
	public List<Jeu> rechercheJeux(String recherche) {
		// TODO Auto-generated method stub
		return null;
	}

}
