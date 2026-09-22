package com.jdbc14;

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
					"CREATE TABLE voter (voter_id VARCHAR(10) PRIMARY KEY, voter_name VARCHAR(30) NOT NULL CHECK (voter_name <> ''), age INT CHECK (age BETWEEN 18 AND 999), has_voted BOOLEAN DEFAULT FALSE)"
					);
			System.out.println("voter is created");
			con.close();
			
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
