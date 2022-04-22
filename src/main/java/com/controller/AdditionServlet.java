package com.controller;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class AdditionServlet extends HttpServlet{

	public void service(HttpServletRequest request, HttpServletResponse response)throws IOException ,ServletException {
		
		String a = request.getParameter("n1");
		String b = request.getParameter("n2");
	
		response.setContentType("text/html");
		boolean flag1  ;
		PrintWriter out =response.getWriter();
		 for( int i = 0; i<a.length(); i++) {
			   flag1 =Character.isDigit(a.charAt(i));
			 if(flag1 == false) {
				 System.out.println("'"+ a.charAt(i)+"' is a charater ");
				 System.out.println("Please enter numbers only");
				 out.print("'"+ a.charAt(i)+"' is a character");
				 out.print("Please enter numbers only !!");
				 break;
			 }//end of if outer
				 if (i == a.length()-1){
					 if(flag1 == true){
						 boolean flag2; 
						 for(int j =0 ;j<b.length();j++){
							 flag2=Character.isDigit(b.charAt(i));
							 if(flag2 == false) {
								 System.out.println("'"+ b.charAt(i)+"' is a character");
								 System.out.println("Please enter numbers only");
								 out.print("'"+ b.charAt(i)+"' is a character");
								 out.print("Please enter numbers only !!");
								 break;
							 }//end of if outer
							 if(j == b.length()-1) {
								 if(flag2 == true) {
									 int n1 ,n2;
										n1 = Integer.parseInt(a);
										n2 = Integer.parseInt(b);
										
										System.out.println(n1); //will print on console
										System.out.println(n2); 
										out.print(n1+" + "+n2+ " = " + (n1+n2));			 
								 }
							 }//end of b outer if 
						 }//end of for of b 
						 
					 }
				 }//end of if
			 }//end of for
	}//end of service
}//end of class  



