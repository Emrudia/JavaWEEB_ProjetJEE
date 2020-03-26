package net.web;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import net.utils.JDBCUtils;

@WebServlet(urlPatterns = {"/banJoueur","/deBanJoueur"})
public class AdminController extends HttpServlet{
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
	}
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String action = request.getServletPath();
		System.out.println(action);
		System.out.println("context Path :" + request.getContextPath());
		System.out.println("param = " + request.getParameter("pseudo"));
		Connection connection = null;
		int rs = -1;
		String BAN_DEBAN_SQL = "UPDATE Utilisateur SET banni= ? WHERE Compte_identifiant = ? ;";
		String identifiant = request.getParameter("pseudo");
		switch (action){
			case "/banJoueur":
			try {
				connection = JDBCUtils.getConnection();
				PreparedStatement preparedStatement = connection.prepareStatement(BAN_DEBAN_SQL);
				preparedStatement.setInt(1, 1);
				preparedStatement.setString(2, identifiant);
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
			response.sendRedirect("JSP/joueurs.jsp");
				
				break;
			case "/deBanJoueur":
				try {
					connection = JDBCUtils.getConnection();
					PreparedStatement preparedStatement = connection.prepareStatement(BAN_DEBAN_SQL);
					preparedStatement.setInt(1, 0);
					preparedStatement.setString(2, identifiant);
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
				response.sendRedirect("JSP/joueurs.jsp");
				break;
		}
	}
}
