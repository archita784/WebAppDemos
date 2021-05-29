<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>

</head>
<body>
	<%@ include file="header.jsp"%>

	<h1>Search result</h1>
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
				</div>
			</table>


		</c:otherwise>
	</c:choose>


	<%@ include file="footer.jsp"%>
</body>
</html>