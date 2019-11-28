package com.tyss.sampleproject;

import java.io.FileReader;
import java.sql.*;
import java.util.Properties;


//import com.mysql.jdbc.Driver;


public class ExecuteDeleteQuery {

	public static void main(String[] args) {
		
		Connection conn=null;
//		Statement stmt=null;
		PreparedStatement pstmt=null;
		

	String url="jdbc:mysql://localhost:3306/ust_ty_db";
		try {
			
			
			
			Class.forName("com.mysql.jdbc.Driver");
			
			//get the connection
			conn=DriverManager.getConnection(url, "root","root");
			
			
			String Sql="delete from employee where id=?";
			pstmt=conn.prepareStatement(Sql);
			
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
