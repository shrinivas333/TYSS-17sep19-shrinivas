package com.testyantra.jdbcapp;

import java.sql.*;

import com.mysql.jdbc.Driver;

public class ExecuteInsertQuery {

	public static void main(String[] args) {
		
		Connection conn=null;
		Statement stmt=null;
//		ResultSet rs=null;
		
		try {
			//Step 1 Load the drive
			Driver driver=new Driver();
			DriverManager.registerDriver(driver);

			//get the connection
			String url="jdbc:mysql://localhost:3306/ust_ty_db";
			conn=DriverManager.getConnection(url, "root", "root");
			
			
			stmt=conn.createStatement();
			String sql="insert into employee values(6,'abhilash',10000,'m')";
			int Count=stmt.executeUpdate(sql);
			System.out.println(Count +" Row(s) inserted");
		} catch (SQLException e) {
				e.printStackTrace();
		}finally {
			
			try {
				if(conn!=null)
					conn.close();
				if(stmt!=null)
					stmt.close();
				
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	
		
	}
}