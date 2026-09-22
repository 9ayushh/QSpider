package com.jdbc13;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Jdbc1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Class.forName("org.postgresql.Driver");
			
			String url = "jdbc:postgresql://localhost:5432/test";
			String username = "postgres";
			String password = "root";
			
			Connection con =  DriverManager.getConnection(url, username, password);
			
			Statement s = con.createStatement();
			
			s.executeUpdate(
					"CREATE TABLE course (course_id CHAR(5) PRIMARY KEY, course_name VARCHAR(30) UNIQUE NOT NULL CHECK (course_name <> ''), duration INT CHECK (duration BETWEEN 10 AND 99), fee NUMERIC(10,2))"
					);
			System.out.println("course is created");
			con.close();
			
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
