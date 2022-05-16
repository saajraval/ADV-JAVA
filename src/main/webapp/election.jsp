<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Welcome to EC of INDIA !!</title>
</head>
<body>
	<h2> Welocme USER!!</h2>
	<%
		String cNameError = (String) request.getAttribute("cNameError");
		String genderError = (String) request.getAttribute("genderError");
		String dobError = (String) request.getAttribute("dobError");
		
		String cNameValue =(String) request.getAttribute("cNameValue");
		String genderValue =(String) request.getAttribute("genderValue");
		String dobValue =(String) request.getAttribute("dobValue");
	%>
	
	<form action="ElectionServlet" method="post">
		Citizen Name: <input type="text" name="cName" value="<%=cNameValue == null ?"":cNameValue %>">
		<%= cNameError == null ?"":cNameError%>
		<br><br>
		Gender:<input type="radio" name="gender" value="male" >Male
				<input type="radio" name="gender" value="female">Female<br>
				<%= genderError == null ?"":genderError%>
				<br><br>
		Date of Birth <input type="date" name="dob"><br><br>
		<%= dobError == null ?"":dobError%>
		<button>Submit</button>
	</form>
</body>
</html>