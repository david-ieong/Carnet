package controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import domain.Contact;
import domain.ContactService;

/**
 * Servlet implementation class ListContactServlet
 */
public class ListContactServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public ListContactServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		ContactService cs = new ContactService();
		List<Contact> contacts = cs.listContact();

		response.getWriter().write("Liste des contacts ");
		if (contacts != null) {
			for (Contact c : contacts) {
				System.err.println(c.toString());
				response.getWriter().print(c + "\n");
			}
		} else {
			response.getWriter()
					.print("Mille milliards de mille millions de mille sabords	! j'ai pas pu lister les contacts");
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
