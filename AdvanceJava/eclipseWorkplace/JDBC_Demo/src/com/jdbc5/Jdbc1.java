package com.jdbc5;

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
		s.executeUpdate("create table bankAccount (accountnumber numeric(10) primary key , holdername varchar(30) not null , accounttype varchar(10) not null check (accounttype in ('saving' , 'current')) , balance numeric(12,2))");
		System.out.println("bank account created successfully ");
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
