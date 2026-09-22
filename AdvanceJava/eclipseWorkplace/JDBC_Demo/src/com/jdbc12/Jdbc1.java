package com.jdbc12;

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
					"CREATE TABLE attendance_log (log_id INT PRIMARY KEY CHECK (log_id BETWEEN 10000 AND 99999), employee_number INT NOT NULL CHECK (employee_number BETWEEN 1000 AND 9999), log_date DATE NOT NULL, check_in_time TIME, check_out_time TIME)"
					);
			System.out.println("attendance is created");
			con.close();
			
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
