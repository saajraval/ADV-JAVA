package com.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Addition_jsp extends HttpServlet{
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		String n1 =request.getParameter("n1");
		String n2 =request.getParameter("n2");

		//validation to convert it into integer from string
		
		int num1= Integer.parseInt(n1);
		int num2= Integer.parseInt(n2);
		
		int sum = num1+num2;
		
		//set data into using request 
		request.setAttribute("ans", sum);
		
		//to navigate to JSP we use requestDispatcher 
		
		RequestDispatcher rd= request.getRequestDispatcher("AdditionOutput.jsp");
		rd.forward(request, response);
	}
}
