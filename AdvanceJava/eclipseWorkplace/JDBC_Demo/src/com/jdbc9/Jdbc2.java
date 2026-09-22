package com.jdbc9;

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
					"INSERT INTO vehicle (registration_number, owner_name, vehicle_type, registration_date) VALUES ('DL01AB1234', 'Rahul Sharma', 'CAR', '2025-06-15')"
					);
			System.out.println("vehiche is 1st created");
			con.close();
			
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
