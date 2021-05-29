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
<h1>Welcome to Admin Portal</h1>
<a href="/MovieApp">Home</a>
<div style="text-align: center">
<a href="addMovie.jsp">Add Movie</a><br>
<a href="editMovie.jsp">Edit  Movie</a><br>
<a href="deleteMovie.jsp">Delete Movie</a><br>

</div>
<%@ include file="footer.jsp" %>
</body>
</html>