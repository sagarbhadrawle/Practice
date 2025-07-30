package com.masai.utitily;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ResourceBundle;

public class DBUtils {

	static String url;
	static String username;
	static String password;
	
	static {
		
		ResourceBundle boundle = ResourceBundle.getBundle("dbdetails");
		url=boundle.getString(url);
		username=boundle.getString(username);
		password=boundle.getString(password);
		
		
	}
	
	
	public static Connection createConnection() throws SQLException
	{
		return DriverManager.getConnection(url, username, password);
	}
		
	static void closeConnection(Connection conn) throws SQLException {
		if(conn != null)
			conn.close();
	}
	public static boolean isResultSetEmplty(ResultSet rs) throws SQLException
	{
		return (!rs.isBeforeFirst()&&rs.getRow()==0);
	}
		
	
}
