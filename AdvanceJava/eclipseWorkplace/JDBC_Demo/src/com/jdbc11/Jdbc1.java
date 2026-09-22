package com.jdbc11;

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

					"CREATE TABLE movie (movie_id INT PRIMARY KEY CHECK (movie_id BETWEEN 100 AND 999), title VARCHAR(40) NOT NULL CHECK (title <> ''), release_date DATE, rating NUMERIC(3,1))");
			System.out.println("movie is created");
			con.close();
			
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
