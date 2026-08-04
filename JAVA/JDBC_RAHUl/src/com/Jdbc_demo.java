package com;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Jdbc_demo {

	public static void main(String[] args) {
	
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Driver loaded ");
			
			String url ="jdbc:mysql://localhost:3306/tops";
			String user="root";
			String pass="9875009197";
			
			Connection cn=DriverManager.getConnection(url,user,pass);
			System.out.println("connection Established");
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
