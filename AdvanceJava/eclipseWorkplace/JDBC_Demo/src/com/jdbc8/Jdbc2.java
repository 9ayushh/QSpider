package com.jdbc8;

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
					"INSERT INTO flight_schedule (flight_number, source_city, destination_city, departure_time, arrival_time) VALUES ('AI101', 'Delhi', 'Mumbai', '08:30:00', '10:45:00')"
					);
			System.out.println("flight is created 1st");
			con.close();
			
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
