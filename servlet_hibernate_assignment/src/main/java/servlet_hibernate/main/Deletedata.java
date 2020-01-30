package servlet_hibernate.main;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import servlet_hibernate.dao.Customerdao;
import servlet_hibernate.dao.Customerdaoimpl;

/**
 * Servlet implementation class Deletedata
 */
public class Deletedata extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	Customerdao dao;
    
    public Deletedata() {
        super();
        dao = new Customerdaoimpl();
       
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int id = Integer.parseInt(request.getParameter("customerId"));
		dao.delete(id);
		
		RequestDispatcher rd = request.getRequestDispatcher("index.jsp");
		rd.forward(request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
