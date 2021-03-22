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
<h1>Registration Form</h1>
<h4>${m }</h4><br>
<form action="register">
<table border="1">
<!-- <tr>
<td>Enter Id:</td>
<td><input type="text" name="id"></td>
</tr> -->

<tr>
<td>Enter your Username:</td>
<td><input type="text" name="username" required="required"></td>
</tr>

<tr>
<td>Enter your Password:</td>
<td><input type="password" name="password" required="required"></td>
</tr>

<tr>
<td>Gender</td>
<td>Male<input type="radio" name="gender">  Female<input type="radio" name="gender"></td>
</tr>
<tr>
<td>Select Country:</td>
<td><select name="country" required="required">
<option value="select" selected="selected">select</option>
<option value="india">india</option>
<option value="out of india">outofindia</option>
</select></td>
</tr>
<tr>
<td><input type="checkbox" name="terms" required="required"></td>
<td>Do you agree the terms and conditions</td>
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