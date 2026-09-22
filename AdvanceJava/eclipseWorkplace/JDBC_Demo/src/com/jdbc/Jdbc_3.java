package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Jdbc_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Class.forName("org.postgresql.Driver");
			
			String url = "jdbc:postgresql://localhost:5432/test";
			String username = "postgres";
			String password = "root";
		    Connection con = DriverManager.getConnection(url, username, password);
			
		    Statement s = con.createStatement();
		    
		    s.executeUpdate(
		    		"insert into student values (4 , 'ram' ,'CSE' , 78.00)"
		    		);
		    System.out.println("data insert successfully for 4 roll_no");
			s.close();
		    con.close();
			
			
		} catch ( ClassNotFoundException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		catch ( SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
		}

	}

}
