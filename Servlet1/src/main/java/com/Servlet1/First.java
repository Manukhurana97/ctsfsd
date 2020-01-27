package com.Servlet1;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class First extends HttpServlet 
{
	private static final long serialVersionUID = 1L;
    private List<model> lst = null;
   
    
    
    @Override
	public void init() throws ServletException
    {
    	lst = new ArrayList<model>();
		super.init();
	}
    

	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		response.setContentType("text/html");
		
		PrintWriter pr = response.getWriter();
		System.out.println(request.getParameter("firstname"));
		String name = request.getParameter("firstname");
		String pass = request.getParameter("lastname");
		
		lst.add(new model(UUID.randomUUID().toString(),name, pass));
		
		pr.print("<html><body>"+ name + pass+"</body></html>");
		
		
	}

	
	

}
