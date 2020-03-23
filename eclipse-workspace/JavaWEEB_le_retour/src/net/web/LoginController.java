package net.web;

import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import net.dao.LoginDao;
import net.dao.UserDao;
import net.model.Jeu;
import net.model.LoginBean;
import net.model.User;

/**
 * @email Ramesh Fadatare
 */

@WebServlet("/login")
//OOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO
public class LoginController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private LoginDao loginDao;

	public void init() {
		loginDao = new LoginDao();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.sendRedirect("JSP/login.jsp");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		authenticate(request, response);
	}

	private void authenticate(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
		/*String username = request.getParameter("username");
		String password = request.getParameter("password");
		LoginBean loginBean = new LoginBean();
		loginBean.setUsername(username);
		loginBean.setPassword(password);

		try {
			if (loginDao.validate(loginBean)) {
				RequestDispatcher dispatcher = request.getRequestDispatcher("user/accueil_user.jsp");
				dispatcher.forward(request, response);
			} else {
				HttpSession session = request.getSession();
				//session.setAttribute("user", username);
				//response.sendRedirect("login.jsp");
			}
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}*/
		
		//RequestDispatcher dispatcher = request.getRequestDispatcher("JSP/accueil_user.jsp");
		//dispatcher.forward(request, response);
		
		HttpSession session = request.getSession();
		User user = new User();
		user.setNom("Bernat");
		user.setPrenom("Hugo");
		user.setEmail("hbernat@enssat.fr");
		user.setDateNaissance(LocalDate.parse("1998-09-02"));
		ArrayList<Jeu> jeuxFavoris = new ArrayList<Jeu>();
		Jeu j1 = new Jeu("Fortnite");
		Jeu j2 = new Jeu("Halo3");
		jeuxFavoris.add(j1);
		jeuxFavoris.add(j2);
		user.setJeuxFavoris(jeuxFavoris);
		
		session.setAttribute("sessionUtilisateur",user);
		response.sendRedirect("JSP/accueil_user.jsp");
	}
}
