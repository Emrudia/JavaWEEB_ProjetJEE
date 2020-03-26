package net.web;

import java.io.IOException;
import java.text.ParseException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import net.dao.PartieTermineeService;


public class PartiesFiniesController extends HttpServlet{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public static PartieTermineeService service;
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		try {
			doProcess(request,response);
		} catch (InstantiationException | IllegalAccessException | ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		try {
			doProcess(request,response);
		} catch (InstantiationException | IllegalAccessException | ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	private void doProcess(HttpServletRequest request, HttpServletResponse response) throws InstantiationException, IllegalAccessException, ParseException {
		//
	}

}
