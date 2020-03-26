package net.web;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import net.dao.JeuDAOImpl;
import net.model.Jeu;
import net.model.User;

@WebServlet(urlPatterns = {"/deleteJeu", "/addJeu"}) 

public class UpdateJeuxFavorisController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private JeuDAOImpl jeuDAO;
	
	public void init() {
		jeuDAO = new JeuDAOImpl();
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String action = request.getServletPath();

		try {
			System.out.println(action);
			System.out.println("context Path :" + request.getContextPath());
			switch (action) {

			case "/deleteJeu":
				deleteJeuFavori(request, response);
				break;
			case "/addJeu":
				addJeuFavori(request,response);

			default:
				response.sendRedirect("JSP/accueil_nonlog.jsp");
				break;
			}
		} catch (SQLException ex) {
			throw new ServletException(ex);
		}
	}
	
	
	private void deleteJeuFavori(HttpServletRequest request, HttpServletResponse response) throws SQLException, IOException {
		int idJeu = Integer.parseInt(request.getParameter("idJeu"));
		User user = (User) request.getSession().getAttribute("sessionUtilisateur");
		String identifiant = user.getIdentifiant();
		jeuDAO.deleteJeuFavori(idJeu,identifiant);
		
		ArrayList<Jeu> jeuxFavoris = user.getJeuxFavoris();
		int i = 0;
		while (i< jeuxFavoris.size() && jeuxFavoris.get(i).getIdJeu() != idJeu) {
			i++;
		}
		if (jeuxFavoris.size() != 0) {
			jeuxFavoris.remove(i);
		}
		request.getSession().setAttribute("sessionUtilisateur",user);
		
		response.sendRedirect("JSP/profil_user.jsp");
	}
	
	private void addJeuFavori(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
		String jeu = request.getParameter("jeu");
		String[] NomId = jeu.split("XXX");
		Jeu jeuFavori = new Jeu();
		jeuFavori.setIdJeu(Integer.parseInt(NomId[1]));
		jeuFavori.setNom(NomId[0]);

		User user = (User) request.getSession().getAttribute("sessionUtilisateur");
		user.getJeuxFavoris().add(jeuFavori);
		request.getSession().setAttribute("sessionUtilisateur",user);
		jeuDAO.addJeuFavori(Integer.parseInt(NomId[1]),user.getIdUtilisateur());
		
		RequestDispatcher dispatcher = request.getRequestDispatcher("JSP/games_user.jsp");
		dispatcher.forward(request, response);
	}
	
}
