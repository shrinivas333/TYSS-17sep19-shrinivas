package com.testyantra.webap.servlets;

import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Properties;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class EmployeeId extends HttpServlet {
	
		@Override
		protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
				
			String search=req.getParameter("search");
			int empid=Integer.parseInt(search);
			PrintWriter out=resp.getWriter();
		
	
		
		String url="jdbc:mysql://localhost:3306/ust_ty_db";
		String sql="Select * from employee where id=?";
			
			try(Connection conn=DriverManager.getConnection(url,"root","root");
					PreparedStatement pstmt=conn.prepareStatement(sql);
					ResultSet rs=pstmt.executeQuery()){
//					pstmt.set
					while(rs.next()) {
						out.println(rs.getInt("id"));
						out.println(rs.getString("name"));
						out.println(rs.getInt("salary"));
						out.println(rs.getString("gender"));
						
					}
				
			}
			 catch (Exception e) {
			e.printStackTrace();
		}
			
			out.println("<html>");
			out.println("<body>");
			
			out.println("<table>");
			out.println("<tr>");
			out.println("<th>id</th>");
			out.println("<th>name</th>");
			out.println("<th>salary</th>");
			out.println("<th>gender</th>");
			out.println("</tr>");
			
			out.println("<tr>");
			out.println("<td");out.println();
			out.println("<td>name</td>");
			out.println("<td></td>");
			out.println("<td>id</td>");
			
			out.println("</table>");
			out.println("</body>");
			out.println("</html>");
			
			
	}

}
