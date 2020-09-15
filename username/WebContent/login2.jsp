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



 %>
<script>
window.alert( "u r exiting for the page and ur login details will be automtically get deleted ");

</script>
<form action="signin.jsp">
click login to login again<input type ="submit" value ="login">
</form>
</body>
</html>