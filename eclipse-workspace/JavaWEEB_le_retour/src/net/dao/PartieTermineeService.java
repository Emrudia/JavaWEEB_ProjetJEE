package net.dao;

import java.util.List;

import net.model.PartieTerminee;

public class PartieTermineeService {
	
	private PartieTermineeDAO partieTermineeDao = new PartieTermineeDAO();
		
	public List<PartieTerminee> getAllGames(){
		return partieTermineeDao.findByAll();
	}
	

}
