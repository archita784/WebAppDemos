<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@page import="java.util.ArrayList" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
pageContext.setAttribute("msg", "hello welcome home");
application.setAttribute("msg", "i am in an app");
pageContext.setAttribute("poppy", "Wlcom",PageContext.SESSION_SCOPE);
session.setAttribute("poppy", "good");
%>
${msg}<br>
${applicationScope. msg}<br>
${sessionScope.poppy}<br>
${poppy}<br>
<%
String names[]={"ram","bhanu","shyam"};
application.setAttribute("mynames", names);
ArrayList<String> al=new ArrayList<String>();
al.add("apple");
al.add("orange");
al.add("grapes");
al.add("barry");
al.add("pineapple");
session.setAttribute("fruits",al);%>
${mynames[1]}<br>
${applicationScope.mynames[2]}<br>
${fruits}<br>
${fruits["1"]}<br>
${fruits[4]}<br>
${10/0}
<b>
Using scripting</b>
contact us at<%=application.getInitParameter("mail") %>
<br><b>Using EL</b>
${initParam.mail}
<%
Cookie cook=new Cookie("anyname","JSPWelcomesU");
Cookie cook1=new Cookie("uname1","EJB");
response.addCookie(cook);
response.addCookie(cook1);
%><br>
${cookie.anyname.value}<br>
${cookie.uname1.value}


</body>
</html>