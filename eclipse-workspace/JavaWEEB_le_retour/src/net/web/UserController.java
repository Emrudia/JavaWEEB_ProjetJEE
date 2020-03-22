package net.web;

import java.io.IOException;
import java.math.BigInteger;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

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

@WebServlet(urlPatterns = {"/nonlog", "/register"})
public class UserController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private UserDao userDao;

	public void init() {
		userDao = new UserDao();
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		System.out.println("Hello from UserController on doPost (for registering)");
		register(request, response);
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.sendRedirect("JSP/register.jsp");
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

		RequestDispatcher dispatcher = request.getRequestDispatcher("JSP/accueil_user.jsp");
		dispatcher.forward(request, response);
	}
	
	public byte[] getSHA(String message){
        try {
            MessageDigest md = MessageDigest.getInstance("SHA-256");
            return md.digest(message.getBytes(StandardCharsets.UTF_8));
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
        return null;
    }
	
    /**
     * This function returns a hexadecimal String from a byte tab.
     * @param message
     * @return the hash of a String.
     */
	public String coding(String message){
        BigInteger tmp = new BigInteger(1, getSHA(message));
        StringBuilder hash = new StringBuilder(tmp.toString(16));

        while (hash.length() < 32){
            hash.insert(0, "0");
        }

        return hash.toString();
    }
}
