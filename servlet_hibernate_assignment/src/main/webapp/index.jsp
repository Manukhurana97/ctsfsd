<%@page import="servlet_hibernate.model.Customer"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page isELIgnored="false" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="ISO-8859-1">
		<title>Insert title here</title>
		<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css" integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh" crossorigin="anonymous">
	</head>
	<body>
		<a href="form.html">add data </a>
		<br>
		<a href="displaydata">display data</a>
		
		
		
		
		<h2>Displaying data</h2>
		
		<table class="table table-striped table-dark">
			  <thead>
			    <tr>
			     
			     <th scope="col">Uid</th>
			      <th scope="col">First Name</th>
			      <th scope="col">Last name</th>
			      <th scope="col">Email</th>
			       <th scope="col"> </th>
			    </tr>
			  </thead>
			  <tbody>
		<% 
			List <Customer> lst = (List<Customer>)request.getAttribute("display");
				
			if(lst==null)
			{%>
				<tr>
					<center>
						<% out.print("click display to show data"); %>
					</center>
				</tr>
			<%}
			else
			{
				%>
				<c:forEach var="tempCustomer" items="${display}">
					<c:url var="updateUrl"  value="updatedata.do">
						<c:param name="customerId" value="${tempCustomer.id}"/>
					</c:url>		
					<c:url var="deleteUrl"  value="deletedata.do">
						<c:param name="customerId" value="${tempCustomer.id}"/>
					</c:url>	
				
					<tr>
						
						<td>${tempCustomer.uid}</td>
						<td>${tempCustomer.firstname}</td>
						<td>${tempCustomer.lastname}</td>
						<td>${tempCustomer.email}</td>
						<td><a href="${ updateUrl }">update</a></td>
						<td><a href="${ deleteUrl }">delete</a></td>
						
					</tr>
				</c:forEach>	
				<%}
		%>
	</body>
</html>