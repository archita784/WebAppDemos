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
<jsp:include page="mylogo.jsp">
<jsp:param value="Have a great Day" name="title"/>
</jsp:include>

<form action="login">
Enter name <input type="text" name="username"><br>
Enter password<input  type="password" name="password">
<input type="hidden"name="usertype" value="admin">

<input type="submit"value ="click here">

</form>
<%@ include file="footer.jsp" %>
</body>
</html>