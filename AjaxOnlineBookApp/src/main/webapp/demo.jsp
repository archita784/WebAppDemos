<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<script src="https://code.jquery.com/jquery-2.2.4.min.js" ></script>
<script>
$(document).ready(function(){
    console.log('hello');
    $("#search").click(function(){
        console.log('hello');
        $.ajax({
            url:"demoServlet",
            data:$("#choice").val(),
            success:function(data,status){
                $("#mydiv").html(data);
            }
            
        })
        
    });
    
    
    
});



</script>
</head>
<body>
	<%@ include file="header.jsp"%>

	
	<!-- //<form action="demoServlet"> -->
		<input type="text" name="choice">
		 <input type="button" id="search" value="Search">
			<!-- </form> -->
	<br>
	<div id="mydiv"></div>
	<br>

	<%@ include file="footer.jsp"%>
</body>
</html>