package net.dao;

import java.util.ArrayList;
import java.util.List;

import net.model.Jeu;

public class JeuDAOMockImpl implements JeuDAO{

	public static List<Jeu> tousJeux() {
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
		listJeu.add(new Jeu("Jeu1"));
		listJeu.add(new Jeu("Jeu12"));
		listJeu.add(new Jeu("Jeu13"));
		listJeu.add(new Jeu("Jeu14"));
		listJeu.add(new Jeu("Jeu15"));
		listJeu.add(new Jeu("Jeu16"));
		listJeu.add(new Jeu("Jeu17"));
		listJeu.add(new Jeu("Jeu18"));
		listJeu.add(new Jeu("Jeu19"));
		listJeu.add(new Jeu("Jeu111"));
		listJeu.add(new Jeu("Jeu112"));
		listJeu.add(new Jeu("Jeu113"));
		listJeu.add(new Jeu("Jeu114"));
		listJeu.add(new Jeu("Jeu115"));
		listJeu.add(new Jeu("Jeu116"));
		listJeu.add(new Jeu("Jeu117"));
		listJeu.add(new Jeu("Jeu118"));
		listJeu.add(new Jeu("Jeu119"));
		listJeu.add(new Jeu("Jeu120"));
		listJeu.add(new Jeu("Jeu121"));
		listJeu.add(new Jeu("Jeu122"));
		listJeu.add(new Jeu("Jeu123"));
		listJeu.add(new Jeu("Jeu124"));
		listJeu.add(new Jeu("Jeu125"));
		listJeu.add(new Jeu("Jeu126"));
		listJeu.add(new Jeu("Jeu127"));
		listJeu.add(new Jeu("Jeu128"));
		listJeu.add(new Jeu("Jeu129"));
		listJeu.add(new Jeu("Jeu130"));
		return listJeu;
	}

	@Override
	public List<Jeu> rechercheJeux(String recherche) {
		// TODO Auto-generated method stub
		return null;
	}

}
