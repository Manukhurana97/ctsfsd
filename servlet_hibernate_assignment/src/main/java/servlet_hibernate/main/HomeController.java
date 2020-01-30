package servlet_hibernate.main;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import servlet_hibernate.dao.Customerdao;
import servlet_hibernate.dao.Customerdaoimpl;
import servlet_hibernate.model.Customer;


public class HomeController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private Customerdao dao;
       
	@Override
	public void init() throws ServletException {
	
		super.init();
		dao = new Customerdaoimpl();
		
	}
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		Customer customer = dao.findbyid(Integer.parseInt(request.getParameter("id")));
		customer.setFirstname(request.getParameter("firstname"));
		customer.setLastname(request.getParameter("lastname"));
		customer.setEmail(request.getParameter("email"));
		System.out.println(request.getParameter("fname")+" "+ request.getParameter("lname")+" "+ request.getParameter("email"));
		dao.update(customer);
		RequestDispatcher view=request.getRequestDispatcher("index.jsp");
		view.forward(request, response);
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
