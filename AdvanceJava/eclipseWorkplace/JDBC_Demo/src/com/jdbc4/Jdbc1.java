package com.jdbc4;

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
			
			Connection con = DriverManager.getConnection(url,username, password);
			
			Statement s = con.createStatement();
			s.executeUpdate(
					"create table customer(customerid numeric(3) primary key , customername varchar(25) not null , contactnumber numeric(10) unique  not null , city varchar(20))"
					);
			
			System.out.println("customer created successfully ");
		} catch (ClassNotFoundException e) {
			// TODO: handle exception
			e.printStackTrace();
		}catch (SQLException e) {
			e.printStackTrace();
		}

	}

}
