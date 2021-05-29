<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib tagdir="/WEB-INF/tags" prefix="book" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<book:header/>
	<book:header>Online book</book:header>
	<%pageContext.setAttribute("message", "good day");%>
	//use Scripting
	<%-- <book:header>
	Today's message <%=pageContext.getAttribute("message") %>
	</book:header> --%>
	//use Expression Language
<book:header>Today's Message: ${message }
</book:header>
</body>
</html>