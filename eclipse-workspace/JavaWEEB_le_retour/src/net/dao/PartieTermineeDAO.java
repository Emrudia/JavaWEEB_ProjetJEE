package net.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
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
			
			DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy hh:mm:ss");
			
			while (rs.next()) {
				list.add(new  PartieTerminee(rs.getInt("Utilisateur_idUtilisateur"),
											 rs.getInt("Jeu_idJeu"), 
											 rs.getString("nomJeu"), 
											 LocalDateTime.parse(rs.getString("dateDebut"), formatter), 
											 LocalDateTime.parse(rs.getString("dateFin"), formatter))
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

}
