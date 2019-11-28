package com.testyantra.jdbcapp;

import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Properties;

public class ExecuteInsertQuery1 {

	public static void main(String[] args) {
		Connection conn=null;
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
//			String sql="insert into employee values(?,?,?,?)";
			
			pstmt=conn.prepareStatement(prop.getProperty("insert-query"));
			
			String empid=args[0];
			int id=Integer.parseInt(empid);
			pstmt.setInt(1, id);
			
			String name=args[1];
			pstmt.setString(2, name);
			

			String emsal=args[2];
			int sal=Integer.parseInt(emsal);
			pstmt.setInt(3, sal);
			
			String gender=args[3];
			pstmt.setString(4, gender);
			
		
			int Count=pstmt.executeUpdate();
			System.out.println(Count +" Row(s) inserted");
		
		} catch (Exception e) {
				e.printStackTrace();
		}finally {
			
			try {
				if(conn!=null)
					conn.close();
//				if(stmt!=null)
//					stmt.close();
				if(pstmt!=null)
					pstmt.close();
				
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

}
