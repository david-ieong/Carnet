package controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import domain.ContactService;

/**
 * Servlet implementation class AddContactServlet
 */
public class RemoveContactServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public RemoveContactServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		ContactService cs = new ContactService();

		Long id = Long.valueOf(request.getParameter("idContact"));
		boolean ok = cs.removeContact(id);
		if (ok) {
			response.getWriter().print("génial, ça s'est bien supprimé");
		} else {
			response.getWriter()
					.print("zouave à la noix de coco! ça s'est pas supprimé");
		}
	}

}
