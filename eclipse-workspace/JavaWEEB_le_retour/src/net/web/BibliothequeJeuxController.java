package net.web;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import net.dao.JeuDAOMockImpl;
import net.model.Jeu;
import net.utils.JDBCUtils;

@WebServlet("/Biblio")
public class BibliothequeJeuxController extends HttpServlet {

	private static final long serialVersionUID = 1L;
	public static List<Jeu> listJeux;

	protected void doProcess(HttpServletRequest request, HttpServletResponse response) {
		
	}
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		listJeux = JeuDAOMockImpl.tousJeux();
		
		
		String action = request.getServletPath();
		Connection connection = null;
		int rs = -1;
		String DELETE_GAME_SQL = "DELETE FROM Jeu WHERE idJeu = ? ; DELETE FROM Bibliotheque WHERE idJeu = ? ;";
		int idJeu= Integer.parseInt(request.getParameter("id"));
		switch (action){
			case "/deleteJeu":
			try {
				connection = JDBCUtils.getConnection();
				PreparedStatement preparedStatement = connection.prepareStatement(DELETE_GAME_SQL);
				preparedStatement.setInt(1, idJeu);
				rs = preparedStatement.executeUpdate();
			} catch (InstantiationException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IllegalAccessException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			response.sendRedirect("JSP/bibliotheque_jeux.jsp");
				
			break;
		}
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}
}
