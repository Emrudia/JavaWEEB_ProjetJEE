package net.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

import net.model.PartieTerminee;
import net.utils.JDBCUtils;

public class PartieTermineeDAO {
	
	public List<PartieTerminee> findByAll() throws InstantiationException, IllegalAccessException, ParseException{
		Connection connexion = null;
		Statement statement = null;
		ResultSet rs = null;
		List<PartieTerminee> list = new ArrayList<PartieTerminee>();
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy hh:mm:ss");
		
		try{
			connexion = JDBCUtils.getConnection();
			statement = connexion.createStatement();
			rs = statement.executeQuery("select * from PartieTerminee;") ;
			while (rs.next()) {				
				PartieTerminee partie = new PartieTerminee(rs.getInt("idUtilisateur"),rs.getInt("idJeu"),rs.getString("nomJeu"), sdf.parse(rs.getString("dateDebut")),sdf.parse(rs.getString("dateFin")));
				list.add(partie);
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;
	}

}
