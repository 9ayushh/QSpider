package com.jdbc4;

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
				s.executeUpdate(
						"insert into customer values (101 , 'ram' , 1234321234 , 'hydrabad')"
						);
				System.out.println("customer  table inserted 101 ");
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
