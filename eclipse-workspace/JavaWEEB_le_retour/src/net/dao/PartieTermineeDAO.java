package net.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import net.model.PartieTerminee;
import net.utils.JDBCUtils;

public class PartieTermineeDAO {
	
	public List<PartieTerminee> findByAll() throws InstantiationException, IllegalAccessException{
		Connection connexion = null;
		Statement statement = null;
		ResultSet rs = null;
		List<PartieTerminee> list = new ArrayList<PartieTerminee>();
		
		try{
			connexion = JDBCUtils.getConnection();
			statement = connexion.createStatement();
			rs = statement.executeQuery("select * from PartieTerminee;") ;
			while (rs.next()) {				
				PartieTerminee partie = new PartieTerminee(rs.getInt("idUtilisateur"),rs.getInt("idJeu"),rs.getString("nomJeu"),JDBCUtils.getUtilDate(rs.getDate("dateDebut")),JDBCUtils.getUtilDate(rs.getDate("dateFin")));
				list.add(partie);
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;
	}

}
