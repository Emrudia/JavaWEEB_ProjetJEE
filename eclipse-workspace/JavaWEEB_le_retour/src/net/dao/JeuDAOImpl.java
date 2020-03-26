package net.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import net.model.Jeu;
import net.utils.JDBCUtils;

public class JeuDAOImpl implements JeuDAO{

	@Override
	public List<Jeu> tousJeux() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Jeu> rechercheJeux(String recherche) {
		// TODO Auto-generated method stub
		return null;
	}
	
	public static Jeu getJeu(String name) {
		Connection connection;
		Jeu jeu = null;
		try {
			connection = JDBCUtils.getConnection();
			String request = "SELECT * FROM Jeu Where nom = ?;";
			PreparedStatement preparedStatement = connection.prepareStatement(request);
			preparedStatement.setString(1, name);
			ResultSet resultSet = preparedStatement.executeQuery();
			resultSet.next();
			jeu = new Jeu(resultSet.getInt("idJeu"), name);
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return jeu;	
	}
	
	public void deleteJeuFavori(int idJeu, String identifiant) {
		Connection connection;
		try {
			connection = JDBCUtils.getConnection();
			
			PreparedStatement preparedStatement0 = connection.prepareStatement("select idUtilisateur from Utilisateur, Compte where "
					+ "identifiant = Compte_identifiant and identifiant = ?");
			preparedStatement0.setString(1,identifiant);
			ResultSet rs0 = preparedStatement0.executeQuery();
			rs0.next();
			int idUser = rs0.getInt("idUtilisateur");
			
			PreparedStatement preparedStatement = connection.prepareStatement("DELETE from Bibliotheque where Utilisateur_idUtilisateur = ?"
					+ " and Jeu_idJeu = ?");
				
			preparedStatement.setLong(1, idUser);
			preparedStatement.setLong(2, idJeu);
			System.out.println(preparedStatement);
			int result = preparedStatement.executeUpdate();
			
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void addJeuFavori(int idJeu, int idUser) {
		try {
			Connection connection = JDBCUtils.getConnection();
			PreparedStatement preparedStatement = connection.prepareStatement("INSERT into Bibliotheque (Utilisateur_idUtilisateur, "
					+ "jeu_idJeu) values (?,?)");
			
			preparedStatement.setLong(1, idUser);
			preparedStatement.setLong(2, idJeu);
			System.out.println(preparedStatement);
			int result = preparedStatement.executeUpdate();
			
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
