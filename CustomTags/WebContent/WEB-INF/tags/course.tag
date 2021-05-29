<%@ tag language="java" pageEncoding="ISO-8859-1"%>
<b>Choose your course</b>
<%@ attribute name="coursetitle" required="true" rtexprvalue="true"%>
<%@ attribute name="type" required="false" %>

<b>${coursetitle } id fun</b><br>
<b> this is  ${type }session</b>
<jsp:doBody/>