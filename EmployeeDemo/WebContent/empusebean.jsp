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

<%-- <%Employee employee = (Employee)request.getAttribute("employee"); %>
Welcome : <%=employee.getEmpname() %><br>
Employee Id :<%=employee.getEmpid() %><br>
From city : <%=employee.getCity() %><br>
Contact at: <%=employee.getMobileNo() %><br> --%>
<br>
<%-- <jsp:useBean id="employee" class="com.coforge.model.Employee" scope="request"></jsp:useBean>
<b>Welcome:</b> <jsp:getProperty property="empname" name="employee"/><br>
<b>Employee Id: </b><jsp:getProperty property="empid" name="employee"/><br>
<b>From:</b> <jsp:getProperty property="city" name="employee"/><br>
<b>Contact at:</b> <jsp:getProperty property="mobileNo" name="employee"/><br>
 --%>
Welcome:${employee.empname }<br>
Employee Id :${employee.empid }<br>
From:${employee.city }<br>
Contact at:${employee.mobileNo }<br>
<%@ include file="footer.jsp" %>
</body>
</html>