package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import com.bean.UserBean;
import com.util.DbConnection;

public class UserDao {
	public void inserUser(UserBean user) {
	try {
		Connection con = DbConnection.getConnection();
		PreparedStatement pstmt =con.prepareStatement("insert into users(firstname,email,password) values(?,?,?)");
		
		pstmt.setString(1, user.getFirstName());
		pstmt.setString(2, user.getEmail());
		pstmt.setString(3, user.getPassword());
		
		pstmt.executeUpdate();
		
	}
	catch(Exception e){
		e.printStackTrace();
	}	
	}
}
