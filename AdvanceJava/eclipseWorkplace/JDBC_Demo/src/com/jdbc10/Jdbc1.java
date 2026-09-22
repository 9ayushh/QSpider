package com.jdbc10;

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
					"CREATE TABLE room (room_number INT PRIMARY KEY CHECK (room_number BETWEEN 100 AND 999), room_type VARCHAR(10) CHECK (room_type IN ('STANDARD', 'DELUXE', 'SUITE')), rate_per_night NUMERIC(10,2), occupied BOOLEAN)"
					);
			System.out.println("room is created");
			con.close();
			
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
