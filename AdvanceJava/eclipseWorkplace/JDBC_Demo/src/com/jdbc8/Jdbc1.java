package com.jdbc8;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Jdbc1 {

	public static void main(String[] args) {
		try {
			Class.forName("org.postgresql.Driver");
			
			String url = "jdbc:postgresql://localhost:5432/test";
			String username = "postgres";
			String password = "root";
			
			Connection con =  DriverManager.getConnection(url, username, password);
			
			Statement s = con.createStatement();
			
			s.executeUpdate(
					"CREATE TABLE flight_schedule (flight_number VARCHAR(10) PRIMARY KEY, source_city VARCHAR(20) NOT NULL CHECK (source_city <> ''), destination_city VARCHAR(20) NOT NULL CHECK (destination_city <> ''), departure_time TIME, arrival_time TIME)"
					);
			System.out.println("flight is created");
			con.close();
			
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
