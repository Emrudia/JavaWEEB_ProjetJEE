package net.web;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import net.dao.JeuService;
import net.dao.JeuServiceImpl;
import net.model.Jeu;

@WebServlet("/admin")
public class BibliothequeJeuxController extends HttpServlet {

	private static final long serialVersionUID = 1L;

	protected void doProcess(HttpServletRequest request, HttpServletResponse response) {
		JeuService jeuService = new JeuServiceImpl();
		List<Jeu> listJeux;
		listJeux = jeuService.tousJeux();
		request.setAttribute("listJeux", listJeux);
		String pageName="/admin/bibliotheque_jeu.jsp";
		
		RequestDispatcher rd = getServletContext().getRequestDispatcher(pageName);
		
		try {

			rd.forward(request, response);

			} catch (ServletException e) {

			e.printStackTrace();

			} catch (IOException e) {

			e.printStackTrace();

			}
	}
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) {
		doProcess(request, response);
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) {
		doProcess(request, response);
	}
}
