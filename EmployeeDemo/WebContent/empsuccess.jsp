<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
  <%@ page import="com.coforge.model.Employee" %>
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
<h2>Welcome..</h2>
<%-- <%
	Employee employee = (Employee)request.getAttribute("employee");
	out.print("<b>Employee Id :</b> "+employee.getEmpid()+"<br>");
	out.print("<b>Employee Name :</b> "+employee.getEmpname()+"<br>");
	out.print("<b>From City :</b> "+employee.getCity()+"<br>");
	out.print("<b>Contact at : </b>"+employee.getMobileNo()+"<br>");
%> --%>
<%Employee employee = (Employee)request.getAttribute("employee"); %>
Welcome : <%=employee.getEmpname() %><br>
Employee Id :<%=employee.getEmpid() %><br>
From city : <%=employee.getCity() %><br>
Contact at: <%=employee.getMobileNo() %><br>

<%@ include file="footer.jsp" %>
</body>
</html>