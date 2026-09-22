package com.jdbc5;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Jdbc3 {

	public static void main(String[] args) {
		try {
			Class.forName("org.postgresql.Driver");
			
			String url = "jdbc:postgresql://localhost:5432/test";
			String username = "postgres";
			String password = "root";
			
			Connection con = DriverManager.getConnection(url, username, password);
			Statement s = con.createStatement();
			s.executeUpdate("insert into bankAccount values(1909387432 ,'satyam' , 'current' , 187623)");
			System.out.println("bank account inserted 2nd successfully ");
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
