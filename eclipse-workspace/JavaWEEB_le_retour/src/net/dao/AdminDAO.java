package net.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import net.model.Administrateur;
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
			System.out.println(preparedStatement);
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
}
