//package com.tsestyantra.employeedata;
//
//import java.io.FileReader;
//import java.io.IOException;
//import java.io.PrintWriter;
//import java.sql.Connection;
//import java.sql.DriverManager;
//import java.sql.ResultSet;
//import java.sql.Statement;
//import java.util.Properties;
//
//import javax.servlet.ServletException;
//import javax.servlet.http.HttpServlet;
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//
//public class EmployeeServlet extends HttpServlet{
//
//	@Override
//	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//		
//		PrintWriter out=resp.getWriter();
//		
//		String search=req.getParameter("search");
//		int empid=Integer.parseInt(search);
//		
//		
//	
////			Class.forName(prop.getProperty("driver-class-name"));
////			
////			String url=prop.getProperty("url");
////			String sql=prop.getProperty("slect-query");
////			
//			try(Connection conn=DriverManager.getConnection(url, prop);
//					Statement stmt=conn.createStatement();
//					ResultSet rs=stmt.executeQuery(sql)){
//					
//					while(rs.next()) {
//						System.out.println("Id is:"+rs.getInt("id"));
//						System.out.println("Name is:"+rs.getString("name"));
//						System.out.println("Salary is:"+rs.getInt("salary"));
//						System.out.println("Gender is:"+rs.getString("gender"));
//					}
//				
//			
//			
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//	}
//}
