package net.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import net.model.LoginBean;
import net.utils.JDBCUtils;

public class LoginDao {

	public boolean validate(LoginBean loginBean, boolean testAdmin) throws InstantiationException, IllegalAccessException, SQLException, ClassNotFoundException {
		boolean status = false;
		
		try(Connection connection = JDBCUtils.getConnection();){
					// Step 2:Create a statement using connection object
			PreparedStatement preparedStatement;
			if (!testAdmin) {
				preparedStatement = connection
						.prepareStatement("select * from Utilisateur, Compte where identifiant = Compte_identifiant "
										+ "and identifiant = ? and motDePasse = ?;");
			}else{
				preparedStatement = connection
						.prepareStatement("select * from Administrateur, Compte where identifiant = Compte_identifiant "
										+ "and identifiant = ? and motDePasse = ?;");
			}
		
		preparedStatement.setString(1, loginBean.getUsername());
		preparedStatement.setString(2, loginBean.getPassword());
		ResultSet rs = preparedStatement.executeQuery();
		status = rs.next();
		
		} catch (SQLException e) {
			// process sql exception
			JDBCUtils.printSQLException(e);
		} catch ( InstantiationException e) {
			System.out.println("InstanciationException");
		} catch (IllegalAccessException e) {
			System.out.println("IllegalAccessException");
		}
		
		return status;
	}
	
	public boolean isAdministrateur(String username) throws InstantiationException, IllegalAccessException{
		boolean status = false;
		
		try (Connection connection = JDBCUtils.getConnection();
				// Step 2:Create a statement using connection object
				PreparedStatement preparedStatement = connection
						.prepareStatement("select identifiant from Administrateur, Compte where identifiant = Compte_identifiant and identifiant = ? ;")) {
			preparedStatement.setString(1,username);
			ResultSet rs = preparedStatement.executeQuery();
			status = rs.next();
		
		} catch (SQLException e) {
			// process sql exception
			JDBCUtils.printSQLException(e);
		}
		return status;
	}
}
