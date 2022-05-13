<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Registration</title>
</head>
<body>
	
	<h2>SignUp!!</h2>
	<%
		String firstNameError=(String)request.getAttribute("firstNameError");
		String emailError=(String)request.getAttribute("emailError");
		String passwordError=(String)request.getAttribute("passwordError");
		String genderError=(String)request.getAttribute("genderError");	
		String hobbyError=(String)request.getAttribute("hobbyError");
		
		String firstNameValue=(String)request.getAttribute("firstNameValue");
		String emailValue=(String)request.getAttribute("emailValue");
		String passwordValue=(String)request.getAttribute("passwordValue");
		String genderValue=(String)request.getAttribute("genderValue");
		String hobbyValue=(String)request.getAttribute("hobbyValue");
	%>

	<form method="post" action="RegistrationServlet">
	First Name:<input type="text" name="firstName" value="<%=firstNameValue == null ?"":firstNameValue %>">
	<%= firstNameError == null ?"":firstNameError%>
	<br><br>
	Email:<input type="email" name="email" value=" <%=emailValue==null ? "":emailValue %>">
	<%= emailError ==null?"":emailError %>
	<br><br>
	Password:<input type="password" name="password" value="<%= passwordValue==null ? "":passwordValue %>">
	<%= passwordError==null?"":passwordError %>
	<br><br>
	gender:<input type="radio" name="gender" value="male" >Male
	<input type="radio" name="gender" value="female">Female
	<%=genderError==null ?"":genderError %>
	<br><br>
	hobby:<input type="checkbox" name="hobby" value="Sports" id="sports">Sports
		<input type="checkbox" name="hobby" value="Reading" id="reading">Reading
		<input type="checkbox" name="hobby" value="Music" id="music">Music
		<%=hobbyError == null?"":hobbyError %>
		<br><br>
	City:<select name="city" id="city">
		<option value="ahmedabad">Ahmedabad</option>
		<option value="surat">Surat</option>
		<option value="rajkot">Rajkot</option>
	</select>

<button> Submit</button>	
	</form>
</body>
</html>