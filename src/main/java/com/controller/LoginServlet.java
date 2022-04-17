package com.controller;

import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LoginServlet extends HttpServlet {

	public void service(HttpServletRequest request, HttpServletResponse response) {
		//String firstName = request.getParameter("firstName");
		String email = request.getParameter("email");
		String password = request.getParameter("password");
				
		//System.out.println(firstName); //will print on console
		System.out.println(email); //will print on console
		System.out.println(password); //will print on console
		
		response.setContentType("text/html");
		
		try {
			PrintWriter out =response.getWriter();
			// class    obj            method
			out.print("<html><body>");
			//out.print("FirstName : "+firstName + "<br>");
			out.print("Email : "+email + "<br>");
			out.print("Password : "+password + "<br>");
			out.print("</body></html>");
			
		}
		catch (Exception e){
			
		}
		
	}
	}

