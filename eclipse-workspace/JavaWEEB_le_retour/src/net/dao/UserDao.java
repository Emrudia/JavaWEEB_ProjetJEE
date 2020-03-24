package net.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.ArrayList;

import net.model.Jeu;
import net.model.User;
import net.utils.JDBCUtils;

public class UserDao {
	
	public static User getUser (String username) {
		String GET_USER_SQL = "SELECT * FROM Utilisateur WHERE Compte_identifiant = '?';";
		Connection connection;
		try {
			connection = JDBCUtils.getConnection();
			PreparedStatement preparedStatement = connection.prepareStatement(GET_USER_SQL);
			preparedStatement.setString(1, username);
			
			ResultSet resultSet = preparedStatement.executeQuery();
			
			User user = new User (resultSet.getString("prenom"), resultSet.getString("nom"), 
			JDBCUtils.getUtilDate(resultSet.getDate("dateDeNaissance")), JDBCUtils.getUtilDate(resultSet.getDate("dateInscription")), 
			resultSet.getInt("banni") != 0, resultSet.getInt("nbParties"));
			return user;
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

	public int registerEmployee(User utilisateur) throws ClassNotFoundException, SQLException, InstantiationException, IllegalAccessException {
		String INSERT_USERS_SQL = "INSERT INTO Utilisateur"
				+ "  (nom, prenom, dateDeNaissance, email, dateInscription, Compte_identifiant) VALUES "
				+ " (?, ?, ?, ?, ?, ?);";
		
		String INSERT_Account_SQL = "INSERT INTO Compte"
				+ "  (identifiant, motDePasse) VALUES "
				+ " (?, ?);";
		
		int result = 0;
		try (Connection connection1 = JDBCUtils.getConnection();
				// Step 2:Create a statement using connection object
				PreparedStatement preparedStatement1 = connection1.prepareStatement(INSERT_Account_SQL)) {
			preparedStatement1.setString(1, utilisateur.getIdentifiant());
			preparedStatement1.setString(2, utilisateur.getMotDePasse());

			System.out.println(preparedStatement1);
			// Step 3: Execute the query or update query
			result= preparedStatement1.executeUpdate();

			int result1 = 0;
			try (Connection connection = JDBCUtils.getConnection();
					// Step 2:Create a statement using connection object
					PreparedStatement preparedStatement = connection.prepareStatement(INSERT_USERS_SQL)) {
					preparedStatement.setString(1, utilisateur.getNom());
					preparedStatement.setString(2, utilisateur.getPrenom());
					preparedStatement.setDate(3, JDBCUtils.getSQLDate(utilisateur.getDateNaissance()));
					preparedStatement.setString(4, utilisateur.getEmail());
					preparedStatement.setDate(5, JDBCUtils.getSQLDate(LocalDate.now()));
					preparedStatement.setString(6, utilisateur.getIdentifiant());
					System.out.println(preparedStatement);
					// Step 3: Execute the query or update query
					result1 = preparedStatement.executeUpdate();

			} catch (SQLException e) {
				// process sql exception
				JDBCUtils.printSQLException(e);
			}
			return result;
		}
	}
	
	public User selectUser(String username) throws InstantiationException, IllegalAccessException{
		
		User user = null;
		// Step 1: Establishing a Connection
		
		/*PreparedStatement preparedStatement = connection.prepareStatement("select identifiant, Utilisateur.nom, prenom, "
		+ "dateDeNaissance, dateInscription, email, banni, nbParties, idJeu, Jeu.nom from Utilisateur, Compte, Bibliotheque, Jeu "
		+ "where Compte_identifiant = "
		+ "identifiant and Utilisateur_idUtilisateur = idUtilisateur and Jeu_idJeu = idJeu and identifiant = ? ")*/
		
		try (Connection connection = JDBCUtils.getConnection();
				// Step 2:Create a statement using connection object
				PreparedStatement preparedStatement = connection.prepareStatement("select identifiant, Utilisateur.nom, prenom, "
						+ "dateDeNaissance, dateInscription, email, banni, nbParties from Utilisateur, "
						+ "Compte where Compte_identifiant = identifiant and identifiant = ?");) {
			preparedStatement.setString(1, username);
			System.out.println(preparedStatement);
			// Step 3: Execute the query or update query
			ResultSet rs = preparedStatement.executeQuery();

			// Step 4: Process the ResultSet object.
			boolean premiereLignePassee = false;
			ArrayList<Jeu> jeuxFavoris = new ArrayList<Jeu>();
			Jeu jeu = new Jeu();
			
			while (rs.next()) {
				System.out.println("OOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOK");
				//int idJeu = rs.getInt("idJeu");
				//String nomJeu = rs.getString("Jeu.nom");
				
				if (!premiereLignePassee) {
					String identifiant = rs.getString("identifiant");
					String nom = rs.getString("Utilisateur.nom");
					String prenom = rs.getString("prenom");
					LocalDate dateNaissance = rs.getDate("dateDeNaissance").toLocalDate();
					LocalDate dateInscription = rs.getDate("dateInscription").toLocalDate();
					String email = rs.getString("email");
					boolean banni = rs.getBoolean("banni");
					int nbParties = rs.getInt("nbParties");
					
					user = new User();
					user.setIdentifiant(identifiant);
					user.setNom(nom);
					user.setPrenom(prenom);
					user.setEmail(email);
					user.setDateNaissance(dateNaissance);
					//Jeu j1 = new Jeu(nomJeu);
					//j1.setIdJeu(idJeu);
					//jeuxFavoris.add(j1);
					
					premiereLignePassee = true;
				}else{
					//jeu.setIdJeu(idJeu);
					//jeu.setNom(nomJeu);
					//jeuxFavoris.add(jeu);
				}
			//user.setJeuxFavoris(jeuxFavoris);
			}
		} catch (SQLException exception) {
			JDBCUtils.printSQLException(exception);
		}
		return user;
	}
}
