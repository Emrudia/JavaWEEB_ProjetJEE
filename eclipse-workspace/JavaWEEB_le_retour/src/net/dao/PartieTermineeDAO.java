package net.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

import net.model.PartieTerminee;
import net.utils.JDBCUtils;

public class PartieTermineeDAO {
	
	public static List<PartieTerminee> findByAll(){
		
		Connection connexion;
		List<PartieTerminee> list = new ArrayList<PartieTerminee>();
		try {
			connexion = JDBCUtils.getConnection();
			String request = "select * from PartieTerminee;";
			PreparedStatement preparedStatement = connexion.prepareStatement(request);
			ResultSet rs = preparedStatement.executeQuery();
			
			DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");
			
			while (rs.next()) {
				list.add(new  PartieTerminee(rs.getInt("Utilisateur_idUtilisateur"),
											 rs.getInt("Jeu_idJeu"), 
											 rs.getString("nomJeu"), 
											 "",
											 LocalDateTime.parse(rs.getString("dateDebut").substring(0, 16), formatter), 
											 LocalDateTime.parse(rs.getString("dateFin").substring(0, 16),formatter))
				);
			}
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
		
		return list;
	}
	
	public static void addPartieTerminee(PartieTerminee pt) {
		Connection connection = null;
		Statement statement = null;
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");
		String INSERT_PT_SQL = "INSERT INTO PartieTerminee "
				+ "(Utilisateur_idUtilisateur, Jeu_idJeu, dateDebut, dateFin, nomJeu) VALUES "
				+ "(?,?,?,?,?);";
		int idUtilisateur = pt.getIdUtilisateur();
		int idJeu = pt.getIdJeu();
		LocalDateTime dateDebut = pt.getDateDebut();
		LocalDateTime dateFin = pt.getDateFin();
		String jeu = pt.getNomJeu();
		try{
			connection = JDBCUtils.getConnection();
			PreparedStatement preparedStatement =  connection.prepareStatement(INSERT_PT_SQL);
			preparedStatement.setInt(1, idUtilisateur);
			preparedStatement.setInt(2, idJeu);
			preparedStatement.setString(3, dateDebut.format(formatter));
			preparedStatement.setString(4, dateFin.format(formatter));
			preparedStatement.setString(5, jeu);
			
			preparedStatement.executeUpdate();
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
