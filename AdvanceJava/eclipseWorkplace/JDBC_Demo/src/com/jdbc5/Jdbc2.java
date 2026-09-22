package com.jdbc5;

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
			
			Connection con = DriverManager.getConnection(url, username, password);
			Statement s = con.createStatement();
			s.executeUpdate("insert into bankAccount values(1209387432 ,'manish' , 'saving' , 1876254333)");
			System.out.println("bank account inserted 1st successfully ");
			con.close();
			
		} catch (ClassNotFoundException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	       catch (SQLException e) {
			// TODO: handle exception
	    	   e.printStackTrace();
		}

	}

}
