<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<form action="form2" method="POST">
	Enter name <input type="text" name="username"><br>
	Enter City<input type="text" name="cityname"><br>
	Enter Salary<input type="text" name="salary"><br>
	Enter Mobile Number<input type="text" name="Mnumber"><br>
	
	Enter language
	<select  name="Language">
	<option>Select</option>
	<option>Java</option>
	<option>Python</option>
	<option>C++</option>
	</select><br>
	
	Enter hobbies	
	<input type="checkbox" value="music" name="Hobbies">Music
	<input type="checkbox" value="sports" name="Hobbies">Sports
	<input type="checkbox" value="Dance" name="Hobbies">Dance
	<br>
	
	<input type="submit"value ="click here">

</form>
</body>
</html>