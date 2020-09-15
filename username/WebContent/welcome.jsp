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
  
to watch video <a  href ="video.jsp">click here</a>
<form action="logout">
to logout <input type ="submit" value ="logout">
</form>
</body>
</html>