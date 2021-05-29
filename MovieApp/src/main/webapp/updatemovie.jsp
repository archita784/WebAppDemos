<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%@ include file="header.jsp" %>
 

<h1>Update Movie by Rating</h1>
<form action="updatServlet">
<fieldset>
<legend><b>UpdateBookForm</b></legend>
<table>
<tr><td>Title</td>
<td><input type="text" name="title" value="${movie.title }" readonly></td></tr>
<tr><td>MovieId</td>
<td><input type="text" name="movieId" value="${movie.movieId }" readonly></td></tr>
<tr><td>Language</td>
<td><input type="text" name="language" value="${movie.language }" readonly></td></tr>
<tr><td>Genre</td>
<td><input type="text" name="genre" value="${movie.genre }" readonly></td></tr>
<tr><td>Description</td>
<td><input type="text" name="discription" value="${movie.discription }" readonly></td></tr>
<tr><td>Director</td>
<td><input type="text" name="director" value="${movie.director }" readonly></td></tr>
<tr><td>Actor</td>
<td><input type="text" name="actor" value="${movie.actor }" readonly></td></tr>
<tr><td>Duration</td>
<td><input type="text" name="duration" value="${movie.duration }" readonly></td></tr>
<tr><td>Rating</td>
<td><input type="text" name="rating" value="${movie.rating }" ></td></tr>


<tr><td colspan=2><input type="submit" value="Update Movie">
</table>
</fieldset>
</form>
<%@ include file="footer.jsp" %>
 

</body>
</html>