package com.masai;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Stack;

public class Main {

	
	public static void main(String[] args) {
		
		Stack st = new Stack();
		
	
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		String url = "jdbc:mysql://localhost:3306/sagar";
		Connection con=null;
		try {
			 con =DriverManager.getConnection(url, "root", "root");
			
			Statement st = con.createStatement();
			String query = "create table sst(name varchar(2) not null , id int primary key) ";
			
			
			if(st.execute(query))
			{
				System.out.println("success");
			}
			else {
				System.out.println("not success");
			}
			
			
			
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			try {
				con.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
	}
}
