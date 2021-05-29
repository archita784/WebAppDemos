<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>User Details</h1>
<%
String name =(String)request.getAttribute("username");


String city =(String)request.getAttribute("city");
Integer sal =(Integer)request.getAttribute("salary");
Long mobile =(Long)request.getAttribute("mobile");
String language []=(String[])request.getAttribute("Language");
String hobbies[] =(String[])request.getAttribute("hobbies");
%>

<%="welcome "+ name%><br>
from:<%=city %><br>
Income<%= sal %><br>
Contact at<%= mobile %>
<br>

knows:
<% if(language!=null)
for (String langa : language) {
	out.print(langa);

}%><br>
Hobbies
<% 
if (hobbies != null)
	for (String hobby : hobbies) {
		out.print( hobby);

	}

%>

</body>
</html>