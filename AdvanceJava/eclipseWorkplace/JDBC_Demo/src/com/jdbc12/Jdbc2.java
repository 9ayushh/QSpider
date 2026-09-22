package com.jdbc12;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Jdbc2 {

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
					"INSERT INTO attendance_log (log_id, employee_number, log_date, check_in_time, check_out_time) VALUES (10001, 1001, '2026-09-21', '09:00:00', '18:00:00')"
					);
			System.out.println("attendance 1st is created");
			con.close();
			
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
