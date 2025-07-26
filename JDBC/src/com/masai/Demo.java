	package com.masai;
	
	import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

	public class Demo {
	    
	    public static void main(String[] args) {
	        
	        String url = "jdbc:mysql://localhost:3306/practice";

	        try {
	            // Load the JDBC driver (must be inside try or throw exception)
	            Class.forName("com.mysql.cj.jdbc.Driver");

	            // Create connection
	            Connection con = DriverManager.getConnection(url, "root", "root");

	            System.out.println("Connected to database successfully");

	            // Always close connection
	            con.close();

	        } catch (ClassNotFoundException e) {
	            System.out.println("MySQL JDBC Driver not found.");
	            e.printStackTrace();
	        } catch (SQLException e) {
	            System.out.println("SQL Exception occurred.");
	            e.printStackTrace();
	        }
	    }
	}

		
		
	}
