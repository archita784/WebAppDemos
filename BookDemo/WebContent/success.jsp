<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
String name=(String)session.getAttribute("username");
out.print("Welcome "+ name+"<br>");

out.print("Session In in success page"+ session.getId()+"<br>");
session.setMaxInactiveInterval(2);
%>
<form action="bookServlet">
SelectCategory<select name="category">
<option value="select">--select---</option>
<option value="fiction">--fiction---</option>
<option value="horor">--horor---</option>
<option value="animation">--animation---</option>
</select>
<input type="hidden" name="usertype" value='<%request.getAttribute("usertype");%>'> %>
<input type="submit" value="click here">

<%-- <%session.invalidate(); %> --%>
</form>
</body>
</html>