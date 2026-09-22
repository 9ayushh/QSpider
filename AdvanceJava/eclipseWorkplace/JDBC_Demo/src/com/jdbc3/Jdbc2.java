package com.jdbc3;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Jdbc2 {
	public static void main(String [] args) {
	try {
		Class.forName("org.postgresql.Driver");
		
		String url = "jdbc:postgresql://localhost:5432/test";
		String username = "postgres";
		String password = "root";
		
		
			Connection con = DriverManager.getConnection(url, username, password);
			Statement s = con.createStatement();
			s.executeUpdate(
					"insert into employee values (101 , 'ram' , 'dr' , '1990-10-3' , 100000)"
					);
			System.out.println("employee table inserted ");
			con.close();
			
			
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		
	} catch (ClassNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
}

