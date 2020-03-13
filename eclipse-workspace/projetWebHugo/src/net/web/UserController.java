package net.web;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import net.dao.UserDao;
import net.model.User;

/**
 * @email Ramesh Fadatare
 */

@WebServlet("/nonlog")
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
		response.sendRedirect("nonlog/register.jsp");
	}

	private void register(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
		String firstName = request.getParameter("firstName");
		String lastName = request.getParameter("lastName");
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		String email = request.getParameter("email");
		

		User utilisateur = new User();
		utilisateur.setPrenom(firstName);
		utilisateur.setNom(lastName);
		utilisateur.setIdentifiant(username);
		utilisateur.setMotDePasse(password);
		utilisateur.setEmail(email);

		try {
			int result = userDao.registerEmployee(utilisateur);
			if(result == 1) {
				request.setAttribute("NOTIFICATION", "User Registered Successfully!");
			}
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		RequestDispatcher dispatcher = request.getRequestDispatcher("nonlog/register.jsp");
		dispatcher.forward(request, response);
	}
}
