package com.testyantra.jdbcapp;

import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Properties;

import com.mysql.jdbc.Driver;

public class DyanamicSelectQuery {

	public static void main(String[] args) {

		String url="jdbc:mysql://localhost:3306/ust_ty_db";
//		String Sql="Select * from employee where id=?";
		
		Connection conn=null;
		PreparedStatement pstmt=null;
		ResultSet rs=null;
		
		FileReader reader=null;
		
		
		try {
		
			
			reader=new FileReader("db.properties");
			Properties prop=new Properties();
			prop.load(reader);
			
			Class.forName(prop.getProperty("driver-class-name"));
			
			//get the connection
			conn=DriverManager.getConnection(url, prop);
			
			//isuue a sql query
			pstmt=conn.prepareStatement(prop.getProperty("select-query1"));
			
			String empid=args[0];
			int id=Integer.parseInt(empid);
			pstmt.setInt(1, id);
			
			rs=pstmt.executeQuery();
			
			//read the results
			
			if(rs.next()) {
				int emp_id=rs.getInt("id");
				int sal=rs.getInt("salary");
				String name=rs.getString("name");
				String gender=rs.getString("gender");
				
				System.out.println("Id is:"+emp_id);
				System.out.println("Name  is:"+name);
				System.out.println(" salary is:"+sal);
				System.out.println("Gender is:"+gender);
				System.out.println("==========================");
			}
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			
			try {
				if(conn!=null)
					conn.close();
				if(rs!=null)
					rs.close();
				if(pstmt!=null)
					pstmt.close();
				if(reader!=null)
					reader.close();
				
			} catch (Exception e) {
				e.printStackTrace();
			}
			
			
		}//end of try-catch finally
	
	
	}

}
