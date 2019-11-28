package com.tyss.sampleproject;

import java.sql.*;

import com.mysql.jdbc.Driver;

public class MyFirstJDBC {

	public static void main(String[] args) {
		
		Connection conn=null;
		Statement stmt=null;
		ResultSet rs=null;
		
		try {
			//Step 1: Loading a Driver
			Driver driver=new Driver();
			DriverManager.registerDriver(driver);
			
			//Get the Connection.
			String url="jdbc:mysql://localhost:3306/ust_ty_db";
			conn=DriverManager.getConnection(url, "root", "root");//getconnection has the three overloaded methods
			
			
			//Step 3 Issue the SQL Query.
			stmt=conn.createStatement();
			String sql="select * from employee";
			rs=stmt.executeQuery(sql);
			
			//Read the result...
			while(rs.next()) {
				int id=rs.getInt(1);
				String name=rs.getString(2);
				int sal=rs.getInt(3);
				String gender=rs.getString(4);
				
				System.out.println("Id :"+id);
				System.out.println("Name :"+name);
				System.out.println("Salary :"+sal);
				System.out.println("Gender :"+gender);
				
				System.out.println("=========================");
			}
			
		} catch (SQLException e) {
			
			e.printStackTrace();
			
		}finally {
			//Close the the objects at last.
			try {
				//To avoid the null pointer exception we are checking with null using if block.
				if(conn!=null) {
					conn.close();
					}
				if(stmt!=null) {
					stmt.close();
					}
				if(rs!=null) {
					rs.close();
					}
			}catch (SQLException e) {
			e.printStackTrace();
			}
			
		}
		
		
	}
}
