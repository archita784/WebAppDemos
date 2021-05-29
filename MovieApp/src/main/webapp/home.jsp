<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>

</head>
<body >
<%@ include file="header.jsp" %>

<div style="text-align: right">
<a href="login.jsp">Login</a>
</div>
<form action="search">
 <input type="text" name="choice">
 <input type="submit" value="Search">
</form>
<br>
<c:choose>
<c:when test="${empty movieList  }">
 <h1>${message}</h1>
 <a href="/MovieApp">Home</a>
</c:when>
<c:otherwise>
<table>
  <tr>
    <th>Movies </th>
   
   
    <th></th>
    <th></th>
  </tr>
<c:forEach var="movie" items="${movieList }">
  <tr>
<form action = "viewServlet">
	
    <td>${movie.title }</td>
    
    <td><input type="hidden" value = "${movie.movieId}" name="movieId"></td> 
    <td><input type="submit" value="View"></td>
</form>
  </tr>

  </c:forEach>
</table>


</c:otherwise>
</c:choose>


<%@ include file="footer.jsp" %>
</body>
</html>