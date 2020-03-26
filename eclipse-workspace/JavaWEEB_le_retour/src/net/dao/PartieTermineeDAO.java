package net.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.ParseException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

import net.model.PartieTerminee;
import net.utils.JDBCUtils;

public class PartieTermineeDAO {
	
	public static List<PartieTerminee> findByAll() throws InstantiationException, IllegalAccessException, ParseException{
		Connection connexion = null;
		Statement statement = null;
		ResultSet rs = null;
		List<PartieTerminee> list = new ArrayList<PartieTerminee>();
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy hh:mm:ss");
		
		try{
			connexion = JDBCUtils.getConnection();
			statement = connexion.createStatement();
			rs = statement.executeQuery("select * from PartieTerminee;") ;
			while (rs.next()) {				
				PartieTerminee partie = new PartieTerminee(rs.getInt("idUtilisateur"),rs.getInt("idJeu"),rs.getString("nomUtilisateur"), rs.getString("nomJeu"), LocalDateTime.parse(rs.getString("dateDebut"), formatter), LocalDateTime.parse(rs.getString("dateFin"), formatter));
				list.add(partie);
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;
	}

}
