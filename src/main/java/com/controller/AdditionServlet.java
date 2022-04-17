package com.controller;
import java.io.PrintWriter;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class AdditionServlet extends HttpServlet{

	public void service(HttpServletRequest request, HttpServletResponse response) {
		
		String a = request.getParameter("n1");
		String b = request.getParameter("n2");
				
		int n1 ,n2;
		n1 = Integer.parseInt(a);
		n2 = Integer.parseInt(b);
		
		System.out.println(n1); //will print on console
		System.out.println(n2);
	
		response.setContentType("text/html");
		
		try {
			PrintWriter out =response.getWriter();
			// class    obj            method
			out.print("<html><body>");
			out.print(n1+" + "+n2+ " = " + (n1+n2));
			out.print("</body></html>");
			
		}
		catch (Exception e){
			
		}
	}

}
