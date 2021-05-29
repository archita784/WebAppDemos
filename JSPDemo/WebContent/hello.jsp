<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h2>have a good day</h2>
<% out.println("welcome to jsp"); %><br>
<%String  name="Ram"; %>
<% out.println("welcome"+name); %>
<%int x=10,y=20; %><br>
<%="sum"+(x+y) %>
<%! int count=1; %><br>
you are visitor no<%= count++ %>
<br>

<%! String greet(){
	return"welcome back";
	}
	%>
<%= greet() %>
</body>
</html>