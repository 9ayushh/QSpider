package com.jsp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class JdbcExample {
	
	public static void main(String[] args) {
		try {
			// step 1 : Load the MYSQL Driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			
		// step 2 : Create Connection
			String url = "jdbc:mysql://localhost:3306/jdbc_test";
			String username = "root";
			String password = "password";
			
			Connection con = DriverManager.getConnection(url, username, password);
			
		// step 3 : create statement
			Statement s = con.createStatement();
			
			// dynamic data
//			PreparedStatement s = con.prepareStatement("insert into student values(?,?,?,?);");
//			s.setInt(1, 104);
//			s.setString(2, "anu");
//			s.setString(3, "CSE");
//			s.setDouble(4, .5);
			
		// step 4 : execute
			
			// creating a table
			
//			String createTableQuery = "CREATE TABLE student (" + "roll_no INT PRIMARY KEY, " + "student_name VARCHAR(50), " + "branch VARCHAR(50), " + "percentage DOUBLE)";
//			
//			s.execute(createTableQuery);
//			
//			System.out.println("Table 'student' created successfully.");
			
			// inserting the values
//			s.executeUpdate("insert into student values(101, 'raj', 'CSE', 87.33)");
//			s.executeUpdate("insert into student values(102, 'rahul', 'AIML', 75)");
//			s.executeUpdate("insert into student values(103, 'kajal', 'AIDS', 85.98)");
//
//	        System.out.println("Data inserted successfully");
			
			// access the data
			
			// with preparedstatement
//			int i = s.executeUpdate();
//			System.out.println(i);
			
			s.executeUpdate("update student set percentage = 89.5 where roll_no = 104");
			
			ResultSet rs = s.executeQuery("Select * from student");
			
			while (rs.next()) {
				int rollNo = rs.getInt(1);
				String name = rs.getString("student_name");
				String branch = rs.getString("branch");
				double per = rs.getDouble(4);
				
				System.out.println(rollNo + " " + name + " " + branch + " " +  per);
			}
			
		// step 5 : close
			s.close();
			con.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
}
