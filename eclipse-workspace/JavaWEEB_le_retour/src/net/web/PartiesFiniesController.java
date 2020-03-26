package net.web;

import java.io.IOException;
import java.text.ParseException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import net.dao.PartieTermineeService;
import net.model.PartieTerminee;


public class PartiesFiniesController extends HttpServlet{

	private PartieTermineeService service;
	
	public void init() {
		service = new PartieTermineeService();
	}
	
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
		String pageName="/parties_finies.jsp";
		
		List<PartieTerminee> listGames = service.getAllGames();

		request.setAttribute("listGames", listGames);

		RequestDispatcher rd = getServletContext().getRequestDispatcher(pageName);
		try {
			rd.forward(request, response);
		} catch (ServletException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
