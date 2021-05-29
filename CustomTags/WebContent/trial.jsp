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
<book:header/><br>
<book:course coursetitle="Java"></book:course><br>
<book:course coursetitle="Spring" type="classroom"></book:course>
<book:course coursetitle="${courseName}"><br>
${courseName }is a framework
</book:course>
</body>
</html>