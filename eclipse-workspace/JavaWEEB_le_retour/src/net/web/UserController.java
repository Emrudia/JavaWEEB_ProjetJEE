package net.web;

import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import net.dao.UserDao;
import net.model.Jeu;
import net.model.User;


@WebServlet("/register")
public class UserController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private UserDao userDao;

	public void init() {
		userDao = new UserDao();
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		register(request, response);
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.sendRedirect("/JSP/register.jsp");
	}

	private void register(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
		String firstName = request.getParameter("firstName");
		String lastName = request.getParameter("lastName");
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		String email = request.getParameter("email");
		String birthdayDate = request.getParameter("birthdayDate");
		
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		

		User utilisateur = new User();
		utilisateur.setPrenom(firstName);
		utilisateur.setNom(lastName);
		utilisateur.setIdentifiant(username);
		utilisateur.setMotDePasse(Controller.coding(password));
		utilisateur.setEmail(email);
		utilisateur.setDateNaissance(LocalDate.parse(birthdayDate, formatter));

		try {
			int result = userDao.register(utilisateur);
			if(result == 1) {
				request.setAttribute("NOTIFICATION", "Inscription réussie !");
				RequestDispatcher dispatcher = request.getRequestDispatcher("JSP/accueil_nonlog.jsp");
				dispatcher.forward(request, response);
			}else{
				request.setAttribute("NOTIFICATION", "Inscription échouée...Essayez un autre identifiant");
				RequestDispatcher dispatcher = request.getRequestDispatcher("JSP/register.jsp");
				dispatcher.forward(request, response);
			}
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
}
