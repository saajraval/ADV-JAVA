<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Registration</title>
</head>
<body>
	<form method="post" action="RegistrationServlet">
	First Name:<input type="text" name="firstName"><br><br>
	Email:<input type="email" name="email"><br><br>
	Password:<input type="password" name="password"><br><br>
	gender:<input type="radio" name="gender" value="male">Male
	<input type="radio" name="gender" value="female">Female<br><br>
	hobby:<input type="checkbox" name="hobby" value="Sports" id="sports">Sports
		<input type="checkbox" name="hobby" value="Reading" id="reading">Reading
		<input type="checkbox" name="hobby" value="Music" id="music">Music<br><br>
	City:<select name="city" id="city">
		<option value="ahmedabad">Ahmedabad</option>
		<option value="surat">Surat</option>
		<option value="rajkot">Rajkot</option>
	</select>

<button> Submit</button>	
	</form>
</body>
</html>