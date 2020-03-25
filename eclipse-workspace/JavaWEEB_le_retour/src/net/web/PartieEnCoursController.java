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
import net.model.Jeu;
import net.model.PartieEnCours;

@WebServlet("/DebutPartie")
public class PartieEnCoursController extends HttpServlet {

	private static final long serialVersionUID = 1L;
	private static ArrayList<PartieEnCours> parties = new ArrayList <PartieEnCours>();
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
	}
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String action = request.getServletPath();
		System.out.println(action);
		System.out.println("context Path :" + request.getContextPath());
		System.out.println("param = " + request.getParameter("game"));
		
		switch (action){
			case "/DebutPartie":
				Jeu jeu = JeuDAOImpl.getJeu(request.getParameter("game"));
				PartieEnCours pec = new PartieEnCours((int)request.getSession().getAttribute("idUtilisateur"), jeu.getIdJeu(), 
				(String)request.getSession().getAttribute("identifiant"), jeu.getNom(), LocalDateTime.now());
				parties.add(pec);
				
				
		}
	}

}
