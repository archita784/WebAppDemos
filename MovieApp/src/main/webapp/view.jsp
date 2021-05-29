<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>

</head>
<body>
<%@ include file="header.jsp" %>

<h1>Movie Title.:   ${movie.title }</h1>

<table>
  <tr>
   
    <th>MovieId</th>
    <th>Language</th>
    <th>Genre</th>
    <th>Description</th>
    <th>Director</th>
    <th>Actor</th>
    <th>Duration</th>
    <th>Rating</th>
    <th></th>
    <th></th>
  </tr>

  <tr>
	
   
    <td>${movie.movieId }</td>
    <td>${movie.language }</td>
    <td>${movie.genre }</td>
    <td>${movie.discription }</td>
    <td>${movie.director }</td>
    <td>${movie.actor }</td>
    <td>${movie.duration }</td>
    <td>${movie.rating }</td>
   
  </tr>

 
</table>









<%@ include file="footer.jsp" %>
</body>
</html>