<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page import="java.util.ArrayList" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<c:set value="Welcome to JSTL" var="message" scope="session">
</c:set>
${message}<br>

<c:out value="hello! ${message}">
</c:out><br>

<c:set value="Admin" var="obj" ></c:set>
<c:if test="${obj eq 'Admin'}"> 

	<c:out value="Authenticated ${obj}">
</c:out>
</c:if>
<br>
<p>
Hello ${obj}
</p>


Setting an attribute
<br>
using scripting----
<%pageContext.setAttribute("name", "RAMA"); %><br>
using JSTL----
<c:set var="val" value="GoodDmorning" /><br>
<c:set var="val" scope="session" value="Hello!"/>
<h2>Getting an attribute</h2>
Using Scripting<br>
<%=session.getAttribute("val") %><br>
<%=pageContext.getAttribute("val") %><br>
Using EL<br>
${val}<br>
${sessionScope.val}<br>

<c:remove var="val" scope="page"/><br>
Removing an attribute<br>
<%=session.getAttribute("val") %>
<br>
${val}<br>

<br>
<c:choose>
<c:when test="${obj eq 'Admin'}">
Hello ${obj }</c:when>

<c:when test="${obj eq 'Priya'}">
Welcome! ${obj }</c:when>
<c:otherwise>
Sorry wrong user
</c:otherwise>

</c:choose><br>

<%ArrayList<String> fruits=new ArrayList<String>();
fruits.add("apple");
fruits.add("orange");
fruits.add("grapes");
fruits.add("barry");
fruits.add("pineapple");
session.setAttribute("fruits",fruits); %>
${fruits }<br>
<c:forEach var="fruit" items="${fruits }" step="2">
${fruit }<br>
</c:forEach>
<h2>Using try catch</h2>
<c:catch>I am inside catch
<%int x=10/0; %>
hello will not be printed</c:catch>
completed after catch

<c:import url="http://localhost:8080/EmployeeDemo/mylogo.jsp">
<c:param name="title" value="Learning coretags"></c:param></c:import>
</body>
</html>
