package net.web;

import java.io.IOException;
import java.time.LocalDateTime;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import net.dao.JeuDAOImpl;
import net.dao.PartieTermineeDAO;
import net.dao.UserDao;
import net.model.Jeu;
import net.model.PartieEnCours;
import net.model.PartieTerminee;
import net.model.User;

@WebServlet(urlPatterns = {"/DebutPartie", "/FinPartie"})
public class PartieEnCoursController extends HttpServlet {

	private static final long serialVersionUID = 1L;
	public static ArrayList<PartieEnCours> parties = new ArrayList <PartieEnCours>();
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
	}
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String action = request.getServletPath();
		switch (action){
			case "/DebutPartie":
				Jeu jeu = JeuDAOImpl.getJeu(request.getParameter("game"));
				PartieEnCours pec = new PartieEnCours(((User)request.getSession().getAttribute("sessionUtilisateur")).getIdUtilisateur(), 
														jeu.getIdJeu(), 
														((User)request.getSession().getAttribute("sessionUtilisateur")).getIdentifiant(), 
														jeu.getNom(), 
														LocalDateTime.now());
				parties.add(pec);
				request.getSession().setAttribute("partieEnCours", pec);
				UserDao.incrementNbPartie(((User)request.getSession().getAttribute("sessionUtilisateur")).getIdentifiant());
				response.sendRedirect(request.getContextPath() + "/JSP/in_game.jsp");
				break;
				
			case "/FinPartie":
				PartieEnCours partie = (PartieEnCours) request.getSession().getAttribute("partieEnCours");
				PartieTerminee endGame = new PartieTerminee(partie, LocalDateTime.now());
				PartieTermineeDAO.addPartieTerminee(endGame);
				request.getSession().removeAttribute("partieEnCours");
				parties.remove(partie);
				response.sendRedirect(request.getContextPath() + "/JSP/games_user.jsp");
				break;
			
			case "/AdminFinPartie" :
				PartieEnCours pt = PartieEnCoursController.parties.get(Integer.parseInt(request.getParameter("index")));
				PartieTerminee endGame1 = new PartieTerminee(pt, LocalDateTime.now());
				PartieTermineeDAO.addPartieTerminee(endGame1);
				//request.getSession().removeAttribute("partieEnCours");
				parties.remove(pt);
				response.sendRedirect(request.getContextPath() + "/JSP/parties_en_cours.jsp");
		}
	}

}
