package net.dao;

import java.util.List;

import net.model.Jeu;

public class JeuServiceImpl implements JeuService{
	private JeuDAO jeuDAO = new JeuDAOImpl();
	
	@Override
	public List<Jeu> tousJeux() {
		return jeuDAO.tousJeux();
	}

}