package net.web;

import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import net.dao.UserDao;
import net.model.User;

@WebServlet("/updateProfil")
public class UpdateProfilController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private UserDao userDao;

	public void init() {
		userDao  = new UserDao();
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		try {
			updateProfil(request, response);
		} catch (InstantiationException | IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.sendRedirect("/JSP/profil_user_modif.jsp");
	}
	
	private void updateProfil(HttpServletRequest request, HttpServletResponse response) throws InstantiationException, IllegalAccessException, IOException {
		User user = (User) request.getSession().getAttribute("sessionUtilisateur");
		
		String nom = request.getParameter("lastname");
		String prenom = request.getParameter("firstname");
		String email = request.getParameter("email");
		String dateNaissance = request.getParameter("birthdate");
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
		
		user.setPrenom(prenom);
		user.setNom(nom);
		user.setEmail(email);
		user.setDateNaissance(LocalDate.parse(dateNaissance,formatter));
		request.getSession().setAttribute("sessionUtilisateur",user);
		
		userDao.updateProfilBDD(user);
		response.sendRedirect("JSP/profil_user.jsp");
	
	}
	
}