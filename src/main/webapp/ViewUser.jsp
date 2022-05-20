<%@page import="com.bean.UserBean"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>View user </title>
</head>
<body>
	<%
		UserBean user = (UserBean) request.getAttribute("user");
	%>
	UserID:<%=user.getUserId() %><br>
	FirsName: <%=user.getFirstName() %><br>
	Email: <%=user.getEmail() %> 
</body>
</html>