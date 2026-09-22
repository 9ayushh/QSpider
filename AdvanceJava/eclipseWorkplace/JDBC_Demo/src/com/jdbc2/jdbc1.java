package com.jdbc2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class jdbc1 {

	public static void main(String[] args) {
		
		try {
			Class.forName("org.postgresql.Driver");
			
			String url = "jdbc:postgresql://localhost:5432/test";
			String username = "postgres";
			String password = "root";
			
			Connection con = DriverManager.getConnection(url,username,password);
			
			Statement s = con.createStatement();
			
			s.executeUpdate(
					"create table product (productId numeric(4) primary key , productName varchar(30) unique not null, price numeric(10,2) , stockQuantity numeric(4)) "
					);
			System.out.println("product table created");
			con.close();
		} catch (ClassNotFoundException e) {
			// TODO: handle exception
			e.printStackTrace();
		}catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
		}

	}

}
