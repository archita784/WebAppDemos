<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="java.util.ArrayList" %>
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
%>
<%
ArrayList<String> bookList=
(ArrayList<String>)request.getAttribute("bookList");
if(bookList!=null){
	out.print("<h4> The books available are</h4>");
	for(String bookName:bookList){
		out.print(bookName+"<br>");
	}
}
else
{
	out.print("no books avaialable");
}
%>
</body>
</html>