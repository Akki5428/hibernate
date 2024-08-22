<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form action="saverestro" method="post">
		Name : <input type="text" name="name" /> <span style="color:red;">${errorName}</span><br><br>
		Address : <input type="text" name="address"/> <span style="color:red;">${errorAdd}</span><br><br>
		Category : <input type="text" name="category"/> <span style="color:red;">${errorCat}</span><br><br>
		
		<input type="submit" value="Add Restaurant">
	</form>
</body>
</html>