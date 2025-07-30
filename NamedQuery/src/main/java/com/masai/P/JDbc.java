package com.masai.P;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;

public class JDbc {
		
	public static void main(String[] args) {
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			String url = "jdbc:mysql://localhost:3306/practice";
			
			Connection connection = DriverManager.getConnection(url,"root","root");
			
			
			Statement statement = connection.createStatement();
			
			
			boolean execute = statement.execute("insert into student   values(1,'sagar',2323)");
			
			
			
			
			if(execute)
			{
				System.out.println("table is created");
			}
			
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			e.getMessage();
		}
		
		
	}
}
