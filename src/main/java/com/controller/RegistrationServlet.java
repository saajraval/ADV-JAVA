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
			String gender= request.getParameter("gender");
			String hobby[] =request.getParameterValues("hobby");
			String city =request.getParameter("city");
			
			
			boolean isError =false;
			String errorMsg = "";
			if(FirstName == null || FirstName.trim().length()==0) {
				isError =true;
				errorMsg += "Please Enter First name<br>";
				
			}else if (FirstName.length()<2) {
				isError=true;
				errorMsg+="Please enter proper name !!<br>";
				
			}
			else {
				for(int i=0;i<FirstName.length();i++) {
					if(Character.isDigit(FirstName.charAt(i))) {
						isError=true;
						errorMsg+="Please enter only alphabet!!<br><br>";
						break;
					}
				}
			}

			if(Email == null || Email.trim().length()==0) {
				isError =true;
				errorMsg += "Please Enter Email<br>";
			}
			if(password == null || password.trim().length()==0) {
				isError =true;
				errorMsg += "Please Enter password<br><br>";
			}
			if(gender== null ) {
				isError=true;
				errorMsg+="Please select your gender!!<br><br>";
			}
			if(hobby == null || hobby.length == 0) {
				isError=true;
				errorMsg+="Please select a hobby!!<br>";
			}
			
			response.setContentType("text/html");
			
			PrintWriter out = response.getWriter();
			out.print("<html><body>");
			if (isError == true) {
				out.print(errorMsg);
			} else {
				out.print("FirstName:"+FirstName+"<br>");
				out.print("Email:"+Email+"<br>");
				out.print("Password:"+password+"<br>");
				out.print("Gender:"+gender+"<br>");
				out.print("Hobby:");
				for(int i=0;i<hobby.length;i++) {
					out.print(hobby[i]+"&nbsp; ");//non breaking  space 
				}
				out.print("<br><br>");
				out.print("City:"+city+"<br>");
				out.print("Registraion done Successfully !! <br> Now you can login");
			}
			out.print("</body></html>");
	}
}
