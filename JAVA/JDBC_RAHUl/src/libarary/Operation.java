package libarary;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class Operation {
	
	Connection cx=null;
 
	public Operation() {
		
		
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			cx=DriverManager.getConnection("jdbc:mysql://localhost:3306/tops","root","9875009197");
			
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	
	Scanner sc=new Scanner(System.in);
		public void addbook()
		{
			System.out.println("enter book name :");
			String name =sc.next();
			System.out.println(" Enter book price:");
			String price=sc.next();
			System.out.println("Enter book qty:");
			int qty =sc.nextInt();
			
			
			try {
				PreparedStatement ps =
						cx.prepareStatement("insert into libaray value(?,?,?)");
				ps.setInt(1, 0);
				ps.setString(1, name);
				ps.setDouble(3, qty);
				ps.setString(4, price);
				
				int i =ps.executeUpdate();
				if(i>0)
				{
					System.out.println("booked added sucessfully :");
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			  
			
		}
		
		public void viewbook()
		{

			System.out.println("enter book name :");
			String name =sc.next();
			System.out.println(" Enter book price:");
			String price=sc.next();
			System.out.println("Enter book qty:");
			int qty =sc.nextInt();	
	
		}
		
		public void updatebook()
		{

			System.out.println("enter book name :");
			String name =sc.next();
			System.out.println(" Enter book price:");
			String price=sc.next();
			System.out.println("Enter book qty:");
			int qty =sc.nextInt();
		}
		
		public void issuebook()
		{

			System.out.println("enter book name :");
			String name =sc.next();
			System.out.println(" Enter book price:");
			String price=sc.next();
			System.out.println("Enter book qty:");
			int qty =sc.nextInt();
		}
		
	}


