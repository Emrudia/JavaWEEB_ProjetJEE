package net.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.time.LocalDate;

import net.model.User;
import net.utils.JDBCUtils;

public class UserDao {

	public int registerEmployee(User utilisateur) throws ClassNotFoundException, SQLException {
		String INSERT_USERS_SQL = "INSERT INTO Utilisateurs"
				+ "  (nom, prenom, dateDeNaissance, email, dateInscription) VALUES "
				+ " (?, ?, ?, ?, ?);";

		int result = 0;
		try (Connection connection = JDBCUtils.getConnection();
				// Step 2:Create a statement using connection object
				PreparedStatement preparedStatement = connection.prepareStatement(INSERT_USERS_SQL)) {
			preparedStatement.setString(1, utilisateur.getNom());
			preparedStatement.setString(2, utilisateur.getPrenom());
			preparedStatement.setDate(3, JDBCUtils.getSQLDate(utilisateur.getDateNaissance()));
			preparedStatement.setString(4, utilisateur.getEmail());
			preparedStatement.setDate(5, JDBCUtils.getSQLDate(LocalDate.now()));

			System.out.println(preparedStatement);
			// Step 3: Execute the query or update query
			result = preparedStatement.executeUpdate();

			String INSERT_Account_SQL = "INSERT INTO Compte"
					+ "  (identifiant, modDePasse) VALUES "
					+ " (?, ?);";

			int result1 = 0;
			try (Connection connection1 = JDBCUtils.getConnection();
					// Step 2:Create a statement using connection object
					PreparedStatement preparedStatement1 = connection.prepareStatement(INSERT_Account_SQL)) {
				preparedStatement.setString(1, utilisateur.getIdentifiant());
				preparedStatement.setString(2, utilisateur.getMotDePasse());

				System.out.println(preparedStatement1);
				// Step 3: Execute the query or update query
				result1 = preparedStatement1.executeUpdate();

			} catch (SQLException e) {
				// process sql exception
				JDBCUtils.printSQLException(e);
			}
<<<<<<< HEAD
=======
			return result;
>>>>>>> master
		}
	}
}
