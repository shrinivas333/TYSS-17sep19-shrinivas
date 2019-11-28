package com.testyantra.jdbcapp;

import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;

import java.sql.Statement;
import java.util.Properties;

public class MyJDBCWithProperties {

	public static void main(String[] args) {
		
		Connection conn=null;
		Statement stmt=null;
		ResultSet rs=null;
		FileReader reader=null;
		
		try {
			
			reader=new FileReader("db.properties");
			Properties prop=new Properties();
			prop.load(reader);
			
			
			
			
			//Step 1: Loading a Driver
			Class.forName(prop.getProperty("driver-class-name"));
			
			//Get the Connection.
			String url=prop.getProperty("url");
			conn=DriverManager.getConnection(url, prop);//getconnection has the three overloaded methods
			
			
			//Step 3 Issue the SQL Query.
			stmt=conn.createStatement();
//			String sql="select * from employee";
			rs=stmt.executeQuery(prop.getProperty("slect-query"));
			
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
			
		} catch (Exception e) {
			
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
				if(reader!=null) {
					reader.close();
				}
			}catch (Exception e) {
			e.printStackTrace();
			}
			
		}
		
		
		
	}
}
