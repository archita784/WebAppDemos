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
<form action="deleteBook">
<table >


<tr><td>Enter BookId.:</td>
<td><input type="text" name="bookid"><br></td></tr>

<tr><td><input type="submit" value="Delete Book"><br></td></tr>


</table>
</form>
<%@ include file="footer.jsp" %>
</body>
</html>