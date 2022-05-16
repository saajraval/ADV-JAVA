package com.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class DbConnection {

	public static Connection getConnection(){
		
		String driver = "com.mysql.cj.jdbc.Driver";
		String url = "jdbc:mysql://localhost:3306/advancejavaavengers";
		String userName = "root";
		String password = "AkameSR7";

		try {
			Class.forName(driver);
			Connection con = DriverManager.getConnection(url, userName, password);
			
//				PreparedStatement pstmt = con.prepareStatement("insert into users (firstname,email,password) values(?,?,?) ");
//			pstmt.setString(1, "Amit");
//			pstmt.setString(2, "Amit@123");
//			pstmt.setString(3, "baka");
			
//			pstmt.executeUpdate(); //will run the query 

			System.out.println("Done.................");
			return con; 
			
		}catch (Exception e) {
			e.printStackTrace();
		}//end of try catch 
		return null;
	}
}
