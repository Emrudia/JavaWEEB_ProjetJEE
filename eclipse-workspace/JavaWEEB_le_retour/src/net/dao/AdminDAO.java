package net.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import net.model.Administrateur;
import net.model.User;
import net.utils.JDBCUtils;

public class AdminDAO {

	public static Administrateur getAdmin(String username){
		String GET_ADMIN_SQL = "SELECT * FROM Administrateur WHERE Compte_identifiant= '?' ;";
		Connection connection;
		try {
			connection = JDBCUtils.getConnection();
			PreparedStatement preparedStatement = connection.prepareStatement(GET_ADMIN_SQL);
			preparedStatement.setString(1, username);
			ResultSet rs = preparedStatement.executeQuery();
			Administrateur admin = new Administrateur(rs.getString("Compte_identifiant"), rs.getString("email"));
			return admin;
		} catch (InstantiationException | IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	public Administrateur selectAdmin(String username){
		Connection connection;
		try {
			connection = JDBCUtils.getConnection();
			PreparedStatement preparedStatement = connection.prepareStatement(
					"SELECT * FROM Administrateur "
							+ "WHERE Compte_identifiant= '?' ;");
			preparedStatement.setString(1, username);
			ResultSet rs = preparedStatement.executeQuery();
			Administrateur admin = new Administrateur(rs.getString("Compte_identifiant"), rs.getString("email"));
			return admin;
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
		return null;
	}
	

	public static ArrayList<User> getListeJoueurs(){
		Connection connection;
		ArrayList<User> listeJoueurs = new ArrayList<User>();
		try {
			connection = JDBCUtils.getConnection();
			PreparedStatement preparedStatement = connection.prepareStatement(
					"SELECT * FROM Utilisateur;");
			ResultSet rs = preparedStatement.executeQuery();
			User utilisateur;
			while(rs.next()) {
				utilisateur = new User(rs.getString("Compte_identifiant"), rs.getString("prenom"), rs.getString("nom"), rs.getDate("dateDeNaissance").toLocalDate(), rs.getDate("dateInscription").toLocalDate(),
						rs.getInt("banni")!=0, rs.getInt("nbParties"));
				listeJoueurs.add(utilisateur);
			}
			
			return listeJoueurs;
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
		return null;
	}
}
