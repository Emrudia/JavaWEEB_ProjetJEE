package net.dao;

import java.text.ParseException;
import java.util.List;

import net.model.PartieTerminee;

public class PartieTermineeService {
	
	private PartieTermineeDAO partieTermineeDao = new PartieTermineeDAO();
		
	public List<PartieTerminee> getAllGames() throws InstantiationException, IllegalAccessException, ParseException{
		return partieTermineeDao.findByAll();
	}
	

}
