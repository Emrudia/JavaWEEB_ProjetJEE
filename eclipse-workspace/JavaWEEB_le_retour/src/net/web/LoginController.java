package net.web;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import net.dao.LoginDao;
import net.dao.UserDao;
import net.model.Administrateur;
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
	private UserDao userDao;

	public void init() {
		loginDao = new LoginDao();
		userDao = new UserDao();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.sendRedirect("JSP/login.jsp");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		try {
			authenticate(request, response);
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ServletException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	private void authenticate(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException, InstantiationException, IllegalAccessException, SQLException {
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		LoginBean loginBean = new LoginBean();
		loginBean.setUsername(username);
		loginBean.setPassword(Controller.coding(password));

		try {
			if (!loginDao.isAdministrateur(username)) {
				if (loginDao.validate(loginBean,false)) {
					User user = userDao.selectUser(username);
					if (!user.isBanni()) {	
						HttpSession session = request.getSession();
						session.setAttribute("sessionUtilisateur",user);
						response.sendRedirect("JSP/accueil_user.jsp");
					}
					else {
						request.setAttribute("NOTIFICATION", "Bah alors ? On est banni?");
						RequestDispatcher dispatcher = request.getRequestDispatcher("/JSP/login.jsp");
						dispatcher.forward(request, response);
					}
				} else {
					request.setAttribute("NOTIFICATION", "Mauvais mot de passe ou identifiant");
					RequestDispatcher dispatcher = request.getRequestDispatcher("/JSP/login.jsp");
					dispatcher.forward(request, response);
				}

			}else {
				if (loginDao.validate(loginBean,true)) {
					HttpSession session = request.getSession();
					Administrateur admin = userDao.selectAdmin(username);
					session.setAttribute("sessionAdministrateur",admin);
					response.sendRedirect("JSP/accueil_admin.jsp");
				}else {
					request.setAttribute("NOTIFICATION", "Mauvais mot de passe ou identifiant");
					RequestDispatcher dispatcher = request.getRequestDispatcher("/JSP/login.jsp");
					dispatcher.forward(request, response);
				}
			}
		} catch (InstantiationException e) {
			e.printStackTrace();
			response.sendRedirect(request.getContextPath() + "/JSP/login.jsp");
		} catch (IllegalAccessException e) {
			e.printStackTrace();
			response.sendRedirect(request.getContextPath() + "/JSP/login.jsp");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
			response.sendRedirect(request.getContextPath() + "/JSP/login.jsp");
		}
	}
}
