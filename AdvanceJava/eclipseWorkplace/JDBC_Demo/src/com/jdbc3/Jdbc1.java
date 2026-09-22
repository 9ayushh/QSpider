package com.jdbc3;

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
			
			
				Connection con = DriverManager.getConnection(url, username, password);
				Statement s = con.createStatement();
				s.executeUpdate(
						"create table employee (employeeid numeric(4) primary key , employeename varchar(20) not null , job varchar(15) , hiredate date , salary numeric(10,2))"
						);
				System.out.println("employee table created ");
				con.close();
				
				
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
