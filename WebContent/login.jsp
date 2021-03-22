<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<center>
<h1>Login Page</h1>
<h4>${m }</h4><br>
<h4>${msg }</h4><br>
<form action="login">
<table border="1">

<tr>
<td>Enter your Username:</td>
<td><input type="text" name="username" required="required"></td>
</tr>

<tr>
<td>Enter your Password:</td>
<td><input type="password" name="password" required="required"></td>
</tr>

<tr>
<td></td>
<td><input type="submit" value="submit"></td>
</tr>
</table>
</form>
</center>
</body>
</html>