package net.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import net.model.PartieTerminee;

public class PartieTermineeDAO {
	
	public List<PartieTerminee> findByAll(){
		Connection connexion = null;
		Statement statement = null;
		ResultSet rs = null;
		List<PartieTerminee> list = new ArrayList<PartieTerminee>();
		
		try{
			connexion = DBManager.getInstance().getConnection();
			statement = connexion.createStatement();
			rs = statement.executeQuery("select * from PartieTerminee;") ;
			while (rs.next()) {				
				//PartieTerminee partie = new PartieTerminee(rs.getString("nom"),rs.getString("title"),rs.getString("author"));
				//list.add(partie);
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			DBManager.getInstance().cleanup(connexion, statement, rs);
		}
		return list;
	}

}
