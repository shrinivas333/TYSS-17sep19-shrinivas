package com.tyss.sampleproject;


import java.sql.*;


import com.mysql.jdbc.Driver;


public class ExecuteUpdateQuery {

	public static void main(String[] args) {
		
		Connection conn=null;
//		Statement stmt=null;
		PreparedStatement pstmt=null;
		
		String url="jdbc:mysql://localhost:3306/ust_ty_db";
		
		try {
			
		
			//Step 1: Loading a Driver
			Class.forName("com.mysql.jdbc.Driver");
			
			//Get the Connection.
			
			conn=DriverManager.getConnection(url, "root","root");
			
//			stmt=conn.createStatement();
			String sql="update employee set name=?, salary=? ,gender=? where id=?";
			pstmt=conn.prepareStatement(sql);
			
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
