package com.testyantra.webap.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MyFirstServlet extends HttpServlet{
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		
		String companyName=getServletContext().getInitParameter("company-name");
		
		ServletConfig config=getServletConfig();
		String batchName=config.getInitParameter("Batch-name");

		Object obj=req.getAttribute("obj");
		
		PrintWriter out=resp.getWriter();
		resp.setContentType("text/html");
		out.println("<html>");
		out.println("<body>");
		
		Date date=new Date();
		out.println("<h1 style='color:red'>Date and Time is:");
		out.println(date.toString());
		out.println("</h1>");
		out.print("<br>");
		
		
		out.println("<h2>");
		out.println(companyName);
		out.println("</h2>");
		out.print("<br>");
		

		
		out.println("<h2>");
		out.println(batchName);
		out.println("</h2>");
		out.print("<br>");
		
		out.println("<h2>");
		out.println(obj);
		out.println("</h2>");
		out.print("<br>");
		
		String url=req.getRequestURI();
		String method=req.getMethod();
		
		out.println(url);
		out.print("<br>");
		out.println(method);
		
		out.println("</body>");
		out.println("</html>");
	
		
		
		
	}//end of doGet

}//end of myFirst servlet
