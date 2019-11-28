package com.testyantra.jdbcapp;

import java.io.FileReader;
import java.sql.*;
import java.util.Properties;


//import com.mysql.jdbc.Driver;


public class ExecuteDeleteQuery {

	public static void main(String[] args) {
		
		Connection conn=null;
//		Statement stmt=null;
		PreparedStatement pstmt=null;
		
	FileReader reader=null;
		
		try {
			
			reader=new FileReader("db.properties");
			Properties prop=new Properties();
			prop.load(reader);
			
			
			
			
			//Step 1: Loading a Driver
			Class.forName(prop.getProperty("driver-class-name"));
			
			//Get the Connection.
			String url=prop.getProperty("url");
			conn=DriverManager.getConnection(url, prop);
			
			String Sql="delete from employee where id=?";
			pstmt=conn.prepareStatement(prop.getProperty("delete-query"));
			
//			String empid=args[0];
//			int id=Integer.parseInt(empid);
			
			pstmt.setInt(1, Integer.parseInt(args[0]));
			
			int count =pstmt.executeUpdate();
			
			System.out.println("Query oK "+count+" row deleted");
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			
			try {
				if(conn!=null)
					conn.close();
				if(pstmt!=null)
	
					pstmt.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
	}
}
