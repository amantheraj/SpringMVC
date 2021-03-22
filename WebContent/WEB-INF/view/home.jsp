<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>


<body>
<center> 
<h1>Welcome To The Home Page ${dto.getUsername() }</h1>
<h4>${msg }<br></h4>
<a href="logout">LogOut</a>
<hr>

<h3><table border='1'>

<tr><th>Username</th><th>Password</th><th>Gender</th><th>Country</th><th>Terms</th><th>Delete</th></tr>

<c:forEach var="dto" items="${list }">

<tr>
<td><center>${dto.getUsername() }</center></td>
<td><center>${dto.getPassword() }</center></td>
<td><center>${dto.getGender() }</center></td>
<td><center>${dto.getCountry()}</center></td>
<td><center>${dto.getTerms()}</center></td>
<td><a href="delete?id=+${dto.getId() }+">Delete</a></td></tr>
</c:forEach>
</table>
</center>
</body>
</html>