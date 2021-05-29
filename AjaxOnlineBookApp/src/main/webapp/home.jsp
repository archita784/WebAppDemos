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
        $.ajax({
            url:"searchServlet",
            method:"get",
            data:$("input").serialize(),
            success:function(data,status){
                $("#mydiv").html(data);
                console.log(status);
            }
        })
    });
});

 

</script>


</head>
<body>
	<%@ include file="header.jsp"%>

	<div style="text-align: right">
		<a href="login.jsp">Login</a>
	</div>
	
		<input type="text" name="choice" id ="choice"> 
		<input type="button" id="search" value="Search">
	
	<br>
	<div id="mydiv" style="background-color:orange">
				
	<c:choose>
		<c:when test="${empty bookList  }">
			<h1>${message}</h1>
			<a href="/AjaxOnlineBookApp">Home</a>
		</c:when>
		<c:otherwise>
			<table>
				<tr>
					<th>Title</th>
					<th>BookId</th>
					<th>Author</th>
					<th>Category</th>
					<th>Price</th>
					<th></th>
					<th></th>
				</tr>
				<c:forEach var="book" items="${bookList }">
					<tr>
						<form action="viewServlet">

							<td>${book.title }</td>
							<td>${book.bookid }</td>
							<td>${book.author }</td>
							<td>${book.category }</td>
							<td>${book.price}</td>
							<td><input type="hidden" value="${book.bookid}"
								name="bookid"></td>
							<td><input type="submit" value="View"></td>
						</form>
					</tr>

				</c:forEach>
				
			</table>


		</c:otherwise>
	</c:choose>
	</div>


	<%@ include file="footer.jsp"%>
</body>
</html>