package com.testyantra.jdbcapp;

import java.io.FileReader;
import java.sql.*;
import java.util.Properties;

import com.mysql.jdbc.Driver;
import com.mysql.jdbc.PreparedStatement;

public class ExecuteUpdateQuery {

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
			
//			stmt=conn.createStatement();
//			String sql="update employee set name=?, salary=? ,gender=? where id=?";
			pstmt=(PreparedStatement) conn.prepareStatement(prop.getProperty("update-query"));
			
			String empid=args[0];
			int id=Integer.parseInt(empid);
		
			String name=args[1];
			
			String emsal=args[2];
			int sal=Integer.parseInt(emsal);
			
			String gender=args[3];
			
			pstmt.setInt(4, id);
			pstmt.setInt(2, sal);
			pstmt.setString(1, name);
			pstmt.setString(3, gender);
			
			int count=pstmt.executeUpdate();
			System.out.println("Query ok "+count+ "updated" );
			
			
			
		} catch (Exception e) {
			
			e.printStackTrace();
		}finally {
			
			try {
				if(conn!=null)
					conn.close();
				if(pstmt!=null)
					pstmt.close();
				
			} catch (Exception e) {
				
				e.printStackTrace();
			}
		}
		
	
		
		
	}

}
