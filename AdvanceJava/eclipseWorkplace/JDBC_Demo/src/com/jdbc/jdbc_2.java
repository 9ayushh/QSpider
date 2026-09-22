package com.jdbc;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class jdbc_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			// 1 - load the driver 
			Class.forName("org.postgresql.Driver");
			
			// 2 - create a connection 
			String url = "jdbc:postgressql://localhost:5432/test";
			String username = "postgres";
			
			String password = "root";
			
			Connection con = DriverManager.getConnection(url, username, password);
			//step 3 - create a statement 
			Statement s= con.createStatement();
			
			
			// step 4 - execute a statement 
			s.executeUpdate(
	                "insert into student values(103, 'rahulia', 'CSE', 85.33)"
	            );
			System.out.println("data inserted successfuly ");
			
			// step 5 -- close connection 
			con.close();
					
		}
		catch(ClassNotFoundException e) {
			e.printStackTrace();
		}
		catch(SQLException e) {
			e.printStackTrace();
		}

	}

}
