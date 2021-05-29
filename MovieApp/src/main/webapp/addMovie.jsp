<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%@ include file="header.jsp" %>
<form action="addServlet">
<h1>Add New Movie In Deck</h1>
<table >

<tr><td>Enter Title.:</td>
<td><input type="text" name="title"><br></td></tr>
<tr><td>Enter MovieId.:</td>
<td><input type="text" name="movieId"><br></td></tr>
<tr><td>Enter Language.:</td>
<td><input type="text" name="language"><br></td></tr>
<tr><td>Enter Genre.:</td>
<td><input type="text" name="genre"><br></td></tr>
<tr><td>Enter Description.:</td>
<td><input type="text" name="discription"><br></td></tr>
<tr><td>Enter Director.:</td>
<td><input type="text" name="director"><br></td></tr>
<tr><td>Enter Actor.:</td>
<td><input type="text" name="actor"><br></td></tr>
<tr><td>Enter Duration.:</td>
<td><input type="text" name="duration"><br></td></tr>
<tr><td>Enter Rating.:</td>
<td><input type="text" name="rating"><br></td></tr>
<tr><td><input type="submit" value="Add Movie"><br></td></tr>


</table>
</form>
<%@ include file="footer.jsp" %>
</body>
</html>