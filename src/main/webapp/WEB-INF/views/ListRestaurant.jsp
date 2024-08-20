<%@page import="com.entity.RestaurantEntity"%>
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

	<% List<RestaurantEntity> restro = (List<RestaurantEntity>)request.getAttribute("restro"); %>
	<% %>
	<table border=1>
		<tr>
			<th>ID</th>
			<th>Name</th>
			<th>Address</th>
			<th>Category</th>
			<th>Action</th>
		</tr>
		<%
			for(RestaurantEntity r: restro)
			{
				out.print("<tr>");
				out.print("<td>"+r.getRestaurantId()+"</td>");	
				out.print("<td>"+r.getName()+"</td>");	
				out.print("<td>"+r.getAddress()+"</td>");	
				out.print("<td>"+r.getCategory()+"</td>");	
				out.print("<td><a href='deleterestro?rid="+r.getRestaurantId()+"'>Delete</a></td>");
				out.print("</tr>");
			}
		%>

	</table>

</body>
</html>