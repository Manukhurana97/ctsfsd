package servlet_hibernate.main;

import java.io.IOException;
import java.security.Provider.Service;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import servlet_hibernate.dao.Customerdao;
import servlet_hibernate.dao.Customerdaoimpl;
import servlet_hibernate.model.Customer;
import servlet_hibernate.model.Customerdto;


public class Updatedata extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	Customerdao dao;
	
	public void init()
	{
		dao = new Customerdaoimpl();
	}
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		
		Customer cus = 	dao.findbyid(Integer.parseInt(request.getParameter("customerId")));
		request.setAttribute("customer", cus);
		RequestDispatcher view = request.getRequestDispatcher("updatedata.jsp");
		
		view.forward(request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
