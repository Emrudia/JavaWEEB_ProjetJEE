package net.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import net.model.LoginBean;
import net.utils.JDBCUtils;
import net.web.Controller;

public class LoginDao {

	public boolean validate(LoginBean loginBean) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
		boolean status = false;

		try (Connection connection = JDBCUtils.getConnection();
				// Step 2:Create a statement using connection object
				PreparedStatement preparedStatement = connection
						.prepareStatement("select * from Utilisateur, Compte where identifiant = Compte_identifiant and identifiant = ? and motDePasse = ? ")) {
			preparedStatement.setString(1, loginBean.getUsername());
			preparedStatement.setString(2, Controller.coding(loginBean.getPassword()));
			System.out.println(preparedStatement);
			ResultSet rs = preparedStatement.executeQuery();
			status = rs.next();
			System.out.println("Staaaaaaaaaaaaaaaaaaaaaaaaaatus : "+status);
			System.out.println(rs.getString("identifiant"));

		} catch (SQLException e) {
			// process sql exception
			JDBCUtils.printSQLException(e);
		}
		return status;
	}
}
