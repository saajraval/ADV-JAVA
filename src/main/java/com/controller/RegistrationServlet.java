package com.controller;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bean.UserBean;
import com.dao.UserDao;
import com.util.DbConnection;
public class RegistrationServlet extends HttpServlet {
	
	public void  service(HttpServletRequest request , HttpServletResponse response) throws IOException,ServletException{
			String FirstName =request.getParameter("firstName");
			String Email =request.getParameter("email");
			String password =request.getParameter("password");
			String gender= request.getParameter("gender");
			String hobby[] =request.getParameterValues("hobby");
			String city =request.getParameter("city");
			
			
			boolean isError =false;
//			String errorMsg = "";
			if(FirstName == null || FirstName.trim().length()==0) {
				isError =true;
//				errorMsg += "Please Enter First name<br>";
				request.setAttribute("firstNameError","Please Enter First name<br>");
			}else {
				request.setAttribute("firstNameValue",FirstName);
			}
				
//			}else if (FirstName.length()<2) {
//				isError=true;
////				errorMsg+="Please enter proper name !!<br>";
//				request.setAttribute("firstNameError","Please Enter First name properly!!<br>");
//				
//			}
//			else {
//				for(int i=0;i<FirstName.length();i++) {
//					if(Character.isDigit(FirstName.charAt(i))) {
//						isError=true;
////						errorMsg+="Please enter only alphabet!!<br><br>";
//						request.setAttribute("firstNameError","Please Enter Alphabets only<br>");
//						break;
//					}
//				}
//			}

			if(Email == null || Email.trim().length()==0) {
				isError =true;
//				errorMsg += "Please Enter Email<br>";
				request.setAttribute("emailError","Please Enter email!!<br>");
				
			}
			else {
				request.setAttribute("emailValue",Email);
			}
			
			
			if(password == null || password.trim().length()==0) {
				isError =true;
//				errorMsg += "Please Enter password<br><br>";
				request.setAttribute("passwordError","Please Enter Password<br>");
				
			}
			else {
				request.setAttribute("passwordValue",password);
			}
			
			if(gender== null ) {
				isError=true;
//				errorMsg+="Please select your gender!!<br><br>";
				request.setAttribute("genderError","Please Enter Gender<br>");
			}
			else {
				request.setAttribute("genderValue",gender);
			}
			
			if(hobby == null || hobby.length == 0) {
				isError=true;
//				errorMsg+="Please select a hobby!!<br>";
				request.setAttribute("hobbyError","Please Enter Hobby!!<br>");
			}
			else {
				request.setAttribute("hobbyValue",hobby);
			}
			
			
			if(isError==true) {
				RequestDispatcher rd = request.getRequestDispatcher("Registration.jsp");
				rd.forward(request, response);
			}
			else {
				UserBean user = new UserBean();
				user.setFirstName(FirstName);
				user.setEmail(Email);
				user.setPassword(password);
				new UserDao().inserUser(user);
				
				RequestDispatcher rd = request.getRequestDispatcher("Home.jsp");
				rd.forward(request, response);
			}
			
//			response.setContentType("text/html");
//			
//			PrintWriter out = response.getWriter();
//			out.print("<html><body>");
//			if (isError == true) {
//				out.print(errorMsg);
//			} else {
//				out.print("FirstName:"+FirstName+"<br>");
//				out.print("Email:"+Email+"<br>");
//				out.print("Password:"+password+"<br>");
//				out.print("Gender:"+gender+"<br>");
//				out.print("Hobby:");
//				for(int i=0;i<hobby.length;i++) {
//					out.print(hobby[i]+"&nbsp; ");//non breaking  space 
//				}
//				out.print("<br><br>");
//				out.print("City:"+city+"<br>");
//				out.print("Registraion done Successfully !! <br> Now you can login");
//			}
//			out.print("</body></html>");
	}
}
