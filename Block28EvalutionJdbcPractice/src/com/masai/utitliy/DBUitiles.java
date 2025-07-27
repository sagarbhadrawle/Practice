package com.masai.utitliy;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ResourceBundle;

public class DBUitiles {

		static String url;
		static String username;
		static String password;
		
		static {
			
			ResourceBundle rs = ResourceBundle.getBundle("dbdetails");
			url = rs.getString("URL");
			username = rs.getString("USERNAME");
			password = rs.getString("PASSWORD");
			
		} 
			
		
		public static Connection createConnection() throws SQLException
		{
			//	
			return DriverManager.getConnection(url, username, password);
		}
		
		
		public static void closeConnection(Connection con)
		{
			if(con!=null)
			{
				try {
					con.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		
		public static boolean isResultSetEmplty(ResultSet rs) throws SQLException
		{
			return (!rs.isBeforeFirst()&&rs.getRow()==0);
		}
		 
	}

	
