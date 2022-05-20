<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title> Ticket Window  </title>
</head>
<body>
	<h2><u><b> Welcome to Rajhans!!</b></u></h2>
	<form method="post" action="ticketServlet">
	
		Name <input type="text" name ="name" placeholder="Enter your name"><br><br>
		Mobile Number<input type="text"  name="mobileNumber" placeholder="Number"><br><br>
		Type:<select name="type" id="type">
		<option value="glod">Gold</option>
		<option value="silver">Silver</option>
		<option value="platinum">Platinum</option>
		</select>
		<br><br>
		Quantity <input type="text" name="qty" placeholder="Enter number of tickets"><br><br>
		<button>Submit</button>
	</form>
</body>
</html>