package net.web;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import net.dao.JeuDAOMockImpl;
import net.model.Jeu;

@WebServlet("/Biblio")
public class BibliothequeJeuxController extends HttpServlet {

	private static final long serialVersionUID = 1L;
	public static List<Jeu> listJeux;

	protected void doProcess(HttpServletRequest request, HttpServletResponse response) {
		
	}
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		listJeux = JeuDAOMockImpl.tousJeux();
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}
}
