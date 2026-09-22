package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.SQLException;
public class Jdbc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  try {
	            // Step 1: Load the PostgreSQL Driver
	            Class.forName("org.postgresql.Driver");

	            // Step 2: Create Connection
	            String url = "jdbc:postgresql://localhost:5432/test";
	            String username = "postgres";
	            String password = "root";

	            Connection con = DriverManager.getConnection(
	                    url, username, password
	            );

	            // Step 3: Create Statement
	            Statement s = con.createStatement();

	            // Step 4: Execute SQL Query
	            s.executeUpdate(
	                "insert into student values(104, 'rahul', 'CSE', 85.33)"
	            );

	            System.out.println("Data inserted successfully");

	            // Step 5: Close resources
	            s.close();
	            con.close();

	        } catch (ClassNotFoundException e) {
	            e.printStackTrace();

	        } catch (SQLException e) {
	            e.printStackTrace();
	        }

	}

}
