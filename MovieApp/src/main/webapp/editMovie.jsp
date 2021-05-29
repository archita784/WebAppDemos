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
<h1>Select Movie to Update </h1>
<h4>Enter Movie Id</h4>
<form action="editServlet">
<table>
<tr>
<td><input type="text" name="movieId"></td></tr>
<tr><td><input type="submit" value="get Movie byId"></td></tr>
</table>
${message }<br>
</form>
<%@ include file="footer.jsp" %>
</body>
</html>