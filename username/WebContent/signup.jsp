<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>

<script>
function validateForm() {
  var x = document.forms["myForm"]["uname"].value;
  var y = document.forms["myForm"]["pass"].value;
  var z = document.forms["myForm"]["pass1"].value;
  if (x == "" || y == "" || z == "") {
    alert("username and password must be filled out");
    return false;
  }
}
</script>
</head>
<body>
hellooooo.........
<form action="checkservlets" name="myForm" action="/action_page.php" onsubmit="return validateForm()">
enter username:<input type  ="text" name ="uname"><br>
enter password:<input type ="password" name ="pass"><br>
confrim password1:<input type ="password" name ="pass1"><br>
<input type ="submit" value ="login">

 
</form>
</body>
</html>