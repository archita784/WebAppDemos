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
<form action="addBook">
<table >

<tr><td>Enter Title.:</td>
<td><input type="text" name="title"><br></td></tr>
<tr><td>Enter BookId.:</td>
<td><input type="text" name="bookid"><br></td></tr>
<tr><td>Enter Author.:</td>
<td><input type="text" name="author"><br></td></tr>
<tr><td>Enter Category.:</td>
<td><input type="text" name="category"><br></td></tr>
<tr><td>Enter Price.:</td>
<td><input type="text" name="price"><br></td></tr>
<tr><td><input type="submit" value="Add Book"><br></td></tr>


</table>
</form>
<%@ include file="footer.jsp" %>
</body>
</html>