package com.controller;

import java.io.IOException;
import java.time.Period;
import java.util.Calendar;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ElectionServlet extends HttpServlet{
	public void service(HttpServletRequest request , HttpServletResponse response) throws IOException,ServletException{
		String cName =request.getParameter("cName");
		String gender= request.getParameter("gender");
		String dob = request.getParameter("dob");
		
		boolean isError =false;
		boolean criteria = false;
		
		if(cName == null || cName.trim().length()==0) {
			isError =true;
			request.setAttribute("cNameError","Please Enter your name<br>");
		}else {
			request.setAttribute("cNameValue",cName);
		}//end of cname
		
		if(gender== null ) {
			isError=true;
			request.setAttribute("genderError","Please Enter Gender<br>");
		}
		else {
			request.setAttribute("genderValue",gender);
		}//end of gender
		
		if(dob == null || dob.trim().length()==0) {
			isError =true;
			request.setAttribute("dobError","Please Enter Date of birth <br>");
		}else {
			request.setAttribute("dobValue",dob);
		}//end of dob
	
		System.out.println(dob);
		String yr = dob.substring(0, 4);
		System.out.println("Year :"+yr);
			//2022-05-11
		String mn = dob.substring(5,7);
		System.out.println("Month :"+mn);
		
		String day = dob.substring(8);
		System.out.println("day :"+day);
		
		Calendar c = Calendar.getInstance(); 
		int year = c.get(Calendar.YEAR);
		int month =c.get(Calendar.MONTH);
		int da =c.get(Calendar.DATE);
		month+=1;
		System.out.println("Current Year : "+year);
		System.out.println("Current Month : "+month);
		System.out.println("Current day : "+da);
		int diff = year- Integer.parseInt(yr);
		int x= month - Integer.parseInt(mn);
		int y = da -Integer.parseInt(day); 
		
		System.out.println("Year diff:  "+diff+"month diff: "+x+"Date diff : "+y);
		if(diff>17) {
			System.out.println("ok");
		}
		if (isError == false) {
			if(diff <=17) {
				criteria=true;
			}
			else {
				criteria =false;
			}
		}
		
		
		if(isError==true) {
			RequestDispatcher rd = request.getRequestDispatcher("election.jsp");
			rd.forward(request, response);
		}
		else {
			if(criteria== false) {
				RequestDispatcher rd = request.getRequestDispatcher("elligible.jsp");
				rd.forward(request, response);
			}
			else {
				RequestDispatcher rd = request.getRequestDispatcher("vote.jsp");
				rd.forward(request, response);
			}
		}
	
		

	
		// validation	
	}//end of service

}//end of class
