package com.jdbc7;

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
					"CREATE TABLE doctor (doctor_id CHAR(5) PRIMARY KEY, doctor_name VARCHAR(30) NOT NULL CHECK (doctor_name <> ''), specialization VARCHAR(25) NOT NULL CHECK (specialization <> ''), consulting_fee NUMERIC(10,2) CHECK (consulting_fee > 0))"					);
			System.out.println("doctor is created");
			con.close();
			
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
