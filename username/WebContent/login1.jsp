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
response.setHeader("cache-control","n0-cache,no-store,must-revalidate");
if(session.getAttribute("username")==null){
	response.sendRedirect("signin.jsp");
}


 %>
<script>window.alert( "invalid username or invalid password ");

</script>

<form action="login.jsp">
click back to go to login page<input type ="submit" value ="back">
</form>
</body>
</html>