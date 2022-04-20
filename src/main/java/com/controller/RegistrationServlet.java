package com.controller;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
public class RegistrationServlet extends HttpServlet {
	
	public void  service(HttpServletRequest request , HttpServletResponse response) throws IOException,ServletException{
			String FirstName =request.getParameter("firstName");
			String Email =request.getParameter("email");
			String password =request.getParameter("password");
			
			boolean isError =false;
			String errorMsg = "";
			if(FirstName == null || FirstName.trim().length()==0) {
				isError =true;
				errorMsg += "Please Enter First name<br>";
			}

			if(Email == null || Email.trim().length()==0) {
				isError =true;
				errorMsg += "Please Enter Email<br>";
			}
			if(password == null || password.trim().length()==0) {
				isError =true;
				errorMsg += "Please Enter password<br>";
			}
			
			response.setContentType("text/html");
			
			PrintWriter out = response.getWriter();
			out.print("<html><body>");
			if (isError == true) {
				out.print(errorMsg);
			} else {
				out.print("Registraion done Successfully !! <br> Now you can login");
			}
			out.print("</body></html>");
	}
}
