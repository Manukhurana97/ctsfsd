package servlet_hibernate.main;

import java.io.IOException;
import java.util.UUID;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import servlet_hibernate.dao.Customerdao;
import servlet_hibernate.dao.Customerdaoimpl;
import servlet_hibernate.model.Customer;



public class Customermain extends HttpServlet {
	private static final long serialVersionUID = 1L;

    Customerdao service;
    
    public void init()
    {
    	service = new Customerdaoimpl();
    }
    
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String fname = request.getParameter("firstname");
		String lname = request.getParameter("lastname");
		String email = request.getParameter("email");
		System.out.println(fname);
		
		Customer csr = new Customer(fname, lname, email, UUID.randomUUID().toString());
		Customer Customer = service.createcustomer(csr);
		
		if(Customer!=null)
		{
			RequestDispatcher rd = request.getRequestDispatcher("Success.html");
			rd.forward(request, response);
		}
		else
		{
			RequestDispatcher rd = request.getRequestDispatcher("error.html");
			rd.forward(request, response);
		}
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}
	
	

}
