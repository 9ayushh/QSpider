package com.jsp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Scanner;

public class Hello {
	public static void main(String[] args) {
		try {
//			Scanner sc = new Scanner(System.in);
//			
//			System.out.println("Write '1' to insert the data inside the database");
//			System.out.println("Write '2' to read the data inside the database");
//			int input = sc.nextInt();
			
			// step 1 : Load the MYSQL Driver
			Class.forName("org.postgresql.Driver");
			
		// step 2 : Create Connection
			String url = "jdbc:postgresql://localhost:5432/employee_db";
			String username = "postgres";
			String password = "password";
			
			Connection con = DriverManager.getConnection(url, username, password);
			
		// step 3 : create statement
			Statement s = con.createStatement();
		
		// Create
			String createTableQuery = "CREATE TABLE student (" + "roll_no INT PRIMARY KEY, " + "student_name VARCHAR(50), " + "branch VARCHAR(50))";
			
			s.execute(createTableQuery);
			
			System.out.println("Table 'student' created successfully.");
//		if(input == 1) {
//			System.out.println("The table should contain {1 : id, 2 : name, 3 : email, 4 : salary, 5 : department}");
//			int i1 = sc.nextInt();
//			String i2 = sc.next();
//			String i3 = sc.next();
//			double i4 = sc.nextDouble();
//			String i5 = sc.next();
//			
//		}
		
		
		// Read
			
		
		
		
		// Update
		// Delete
			
		// Close
			s.close();
			con.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
