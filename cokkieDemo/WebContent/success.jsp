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
Cookie[]cookie=request.getCookies();
for (Cookie cook:cookie){
	out.println(cook.getName()+" "+ cook.getValue()+"<br>");
	if(cook.getName().equals("uname")){
		out.println("welcome "+cook.getValue());
	}
}
%>
</body>
</html>