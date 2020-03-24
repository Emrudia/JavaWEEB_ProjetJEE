package net.web;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet(urlPatterns = {"/headerLogin","/headerContacts","/headerAccueil_nonlog","/headerGames"})
public class HeaderController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String action = request.getServletPath();

		switch (action) {
		case "/headerLogin":
			request.getRequestDispatcher("nonlog/login.jsp").forward(request, response);
			break;
		case "/headerContacts":
			request.getRequestDispatcher("JSP/contact_nonlog.jsp").forward(request, response);
			break;
		case "/headerAccueil_nonlog":
			request.getRequestDispatcher("JSP/accueil_nonlog.jsp").forward(request, response);
			break;
		case "/headerGames":
			request.getRequestDispatcher("games/games.jsp").forward(request, response);
			break;
		
		default:
			request.getRequestDispatcher("nonlog/accueil_nonlog.jsp").forward(request, response);
			break;
		}
	} 
	


}
