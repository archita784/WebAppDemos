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
<jsp:param value="Employee profile" name="title"/>
</jsp:include>
<form action="empServlet">

Enter empname <input type="text" name="empname"><br>
Enter empid<input  type="text" name="empid"><br>
Enter state<input  type="text" name="state"><br>
Enter city<input  type="text" name="city"><br>
Enter mobile<input  type="text" name="mobile"><br>

<input type="submit"value ="click here">
</form>
<%@ include file="footer.jsp" %>
</body>
</html>