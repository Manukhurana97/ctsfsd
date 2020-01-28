<%@page import="servlet_hibernate.model.Customer"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<%
	
		List<Customer> lst = (List<Customer>)request.getAttribute("display");
		for (Customer ctr: lst){%>
			
			
			<p>
			<% out.println(ctr.getUid());  %>
			<% out.println(ctr.getFirstname()); %>
			<% out.println(ctr.getLastname());  %>
			<% out.println(ctr.getEmail());  %></p>
			
			
	
		
		<%}%>	
		
	
	
	


</body>
</html>