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
		Name : <input type="text" name="name" value="${restro.name}"/> <span style="color:red;">${result.getFieldError("name").getDefaultMessage()}</span><br><br>
		Address : <input type="text" name="address" value="${restro.address}"/> <span style="color:red;">${result.getFieldError("address").getDefaultMessage()}</span><br><br>
		Category : <input type="text" name="category" value="${restro.category}"/> <span style="color:red;">${result.getFieldError("category").getDefaultMessage()}</span><br><br>
		
		<input type="submit" value="Add Restaurant">
	</form>
</body>
</html>