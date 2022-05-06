<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h2>Additon Output JSP</h2>
	<%
	//this tag is known as scriptlet	
	
	int ans =(Integer)request.getAttribute("ans");
	// this basically returns object type of data thus we need to convert it into primitive data that is integer
	out.println("Sum of two numbers is :"+ans);
	%>
</body>
</html>