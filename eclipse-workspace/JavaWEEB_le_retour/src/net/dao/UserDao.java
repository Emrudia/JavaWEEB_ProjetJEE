package net.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.ArrayList;

import net.model.Administrateur;
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

	public int register(User utilisateur) throws ClassNotFoundException, SQLException, InstantiationException, IllegalAccessException {
		String INSERT_USERS_SQL = "INSERT INTO Utilisateur"
				+ "  (nom, prenom, dateDeNaissance, email, dateInscription, Compte_identifiant) VALUES "
				+ " (?, ?, ?, ?, ?, ?);";
		
		String INSERT_Account_SQL = "INSERT INTO Compte"
				+ "  (identifiant, motDePasse) VALUES "
				+ " (?, ?);";
		
		int result = 0;
		
		try (Connection connection1 = JDBCUtils.getConnection();
			// Step 2:Create a statement using connection object
			PreparedStatement preparedStatement0 = connection1.prepareStatement("select identifiant from Compte where identifiant = ? ;")){
			preparedStatement0.setString(1, utilisateur.getIdentifiant());
			System.out.println(preparedStatement0);
			ResultSet rs = preparedStatement0.executeQuery();
			if (rs.next()) { //ON VERIFIE L'UNICITE DE L'IDENTIFIANT
				return 0;
			}
			
			try (
				// Step 2:Create a statement using connection object
				PreparedStatement preparedStatement1 = connection1.prepareStatement(INSERT_Account_SQL)) {
				preparedStatement1.setString(1, utilisateur.getIdentifiant());
				preparedStatement1.setString(2, utilisateur.getMotDePasse());
	
				System.out.println(preparedStatement1);
				// Step 3: Execute the query or update query
				result= preparedStatement1.executeUpdate();
	
				
				try (
						// Step 2:Create a statement using connection object
						PreparedStatement preparedStatement = connection1.prepareStatement(INSERT_USERS_SQL)) {
						preparedStatement.setString(1, utilisateur.getNom());
						preparedStatement.setString(2, utilisateur.getPrenom());
						preparedStatement.setDate(3, JDBCUtils.getSQLDate(utilisateur.getDateNaissance()));
						preparedStatement.setString(4, utilisateur.getEmail());
						preparedStatement.setDate(5, JDBCUtils.getSQLDate(LocalDate.now()));
						preparedStatement.setString(6, utilisateur.getIdentifiant());
						System.out.println(preparedStatement);
						// Step 3: Execute the query or update query
						preparedStatement.executeUpdate();
						
					
				} catch (SQLException e) {
					// process sql exception
					JDBCUtils.printSQLException(e);
				}
				
				return result;
			}
		}
	}
	
	public User selectUser(String username) throws InstantiationException, IllegalAccessException, SQLException{
		
		User user = null;
		// Step 1: Establishing a Connection
		
		try (Connection connection = JDBCUtils.getConnection();
				// Step 2:Create a statement using connection object
				PreparedStatement preparedStatement = connection.prepareStatement("select idUtilisateur, identifiant, Utilisateur.nom, prenom, "
						+ "dateDeNaissance, dateInscription, email, banni, nbParties from Utilisateur, "
						+ "Compte where Compte_identifiant = identifiant and identifiant = ?");) {
			preparedStatement.setString(1, username);
			System.out.println(preparedStatement);
			// Step 3: Execute the query or update query
			ResultSet rs = preparedStatement.executeQuery();

			// Step 4: Process the ResultSet object.
			rs.next();
			int idUtilisateur = rs.getInt("idUtilisateur");
			String identifiant = rs.getString("identifiant");
			String nom = rs.getString("Utilisateur.nom");
			String prenom = rs.getString("prenom");
			LocalDate dateNaissance = rs.getDate("dateDeNaissance").toLocalDate();
			LocalDate dateInscription = rs.getDate("dateInscription").toLocalDate();
			String email = rs.getString("email");
			boolean banni = rs.getBoolean("banni");
			int nbParties = rs.getInt("nbParties");
			
			user = new User();
			user.setIdUtilisateur(idUtilisateur);
			user.setIdentifiant(identifiant);
			user.setNom(nom);
			user.setPrenom(prenom);
			user.setEmail(email);
			user.setDateNaissance(dateNaissance);
			user.setBanni(banni);
			user.setNbParties(nbParties);
			user.setDateInscription(dateInscription);
			
			try (
					PreparedStatement preparedStatement2 = connection.prepareStatement("select idJeu, Jeu.nom from Utilisateur, "
					+ "Compte, Bibliotheque, Jeu where Compte_identifiant = identifiant and identifiant = ? and Utilisateur_idUtilisateur "
					+ "= idUtilisateur and Jeu_idJeu = idJeu");) {
				
				preparedStatement2.setString(1, username);
				System.out.println(preparedStatement2);
				ResultSet rs2 = preparedStatement2.executeQuery();
		
				ArrayList<Jeu> jeuxFavoris = new ArrayList<Jeu>();
				Jeu jeu = new Jeu();
				int idJeu;
				String nomJeu;
			
				while (rs2.next()) {
					idJeu = rs2.getInt("idJeu");
					nomJeu = rs2.getString("Jeu.nom");
					jeu.setIdJeu(idJeu);
					jeu.setNom(nomJeu);
					jeuxFavoris.add(jeu);
				}
				user.setJeuxFavoris(jeuxFavoris);
					
			} catch (SQLException exception) {
				JDBCUtils.printSQLException(exception);
			}
		return user;
		}
	}
	
	
	public Administrateur selectAdmin(String username) throws InstantiationException, IllegalAccessException, SQLException{
		
		Administrateur admin = null;
		// Step 1: Establishing a Connection
		
		try (Connection connection = JDBCUtils.getConnection();
				// Step 2:Create a statement using connection object
				PreparedStatement preparedStatement = connection.prepareStatement("select idAdministrateur, identifiant, nom, prenom, email "
						+ "from Administrateur, Compte where Compte_identifiant = identifiant and identifiant = ?");) {
			preparedStatement.setString(1, username);
			System.out.println(preparedStatement);
			// Step 3: Execute the query or update query
			ResultSet rs = preparedStatement.executeQuery();

			// Step 4: Process the ResultSet object.
			rs.next();
			int idAdmin= rs.getInt("idAdministrateur");
			String identifiant = rs.getString("identifiant");
			String nom = rs.getString("nom");
			String prenom = rs.getString("prenom");
			String email = rs.getString("email");
			
			admin = new Administrateur();
			admin.setIdAdministrateur(idAdmin);
			admin.setIdentifiant(identifiant);
			admin.setNom(nom);
			admin.setPrenom(prenom);
			admin.setEmail(email);
		
		return admin;
		}
	}
	

	public void updateProfilBDD(User updatedProfil) throws InstantiationException, IllegalAccessException{
		try (Connection connection = JDBCUtils.getConnection();
				PreparedStatement statement = connection.prepareStatement("update Utilisateur set  nom = ?, prenom = ?, "
						+ "dateDeNaissance = ?, email = ? where idUtilisateur = ? ;");) {
			statement.setString(1, updatedProfil.getNom());
			statement.setString(2, updatedProfil.getPrenom());
			statement.setDate(3, JDBCUtils.getSQLDate(updatedProfil.getDateNaissance()));
			statement.setString(4, updatedProfil.getEmail());
			statement.setInt(5, updatedProfil.getIdUtilisateur());
			System.out.println(statement);
			
			statement.executeUpdate();
			
		}catch (SQLException exception) {
			JDBCUtils.printSQLException(exception);
		}
	}
	
}
