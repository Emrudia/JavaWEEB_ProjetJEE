package net.web;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

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
		System.out.println("param = " + request.getParameter("game"));
		
		switch (action){
			case "/banJoueur":
				
				break;
			case "/deBanJoueur":
		}
	}
}
