package com.tyss.sampleproject;

import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


import com.mysql.jdbc.Driver;

public class DyanamicSelectQuery {

	public static void main(String[] args) {

		String url="jdbc:mysql://localhost:3306/ust_ty_db";
//		String Sql="Select * from employee where id=?";
		
		Connection conn=null;
		PreparedStatement pstmt=null;
		ResultSet rs=null;
		
		String sql="select * from employee where id=?";
		
		
		try {
		

			Class.forName("com.mysql.jdbc.Driver");
			
			//get the connection
			conn=DriverManager.getConnection(url, "root","root");
			
			//isuue a sql query
			pstmt=conn.prepareStatement(sql);
			
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
				
				
			} catch (Exception e) {
				e.printStackTrace();
			}
			
			
		}//end of try-catch finally
	
	
	}

}
