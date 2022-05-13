package com.util;

import java.sql.Connection;
import java.sql.DriverManager;

public class DbConnection {

	public static void main(String[] args) {
		
		String driver = "com.mysql.cj.jdbc.Driver";
		String url = "jdbc:mysql://localhost:3306/advancejavaavengers";
		String userName = "root";
		String password = "root";

		try {
			Class.forName(driver);
			Connection con = DriverManager.getConnection(url, userName, password);
			if(con == null ) {
				System.out.println("Database not connected ...");
			}else{
				System.out.println("Database connected ...");
			}
		}catch (Exception e) {
			e.printStackTrace();
		}//end of try catch 
	}
}
