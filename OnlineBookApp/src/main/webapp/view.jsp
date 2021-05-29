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

<h1>Show book</h1>

<table>
  <tr>
    <th>Title</th>
    <th>BookId</th>
    <th>Author</th>
    <th>Category</th>
    <th>Price</th>
    <th></th>
    <th></th>
  </tr>

  <tr>
	
    <td>${book.title }</td>
    <td>${book.bookid }</td>
    <td>${book.author }</td>
    <td>${book.category }</td>
    <td>${book.price}</td>
    
  </tr>

 
</table>









<%@ include file="footer.jsp" %>
</body>
</html>