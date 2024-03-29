package com.testyantra.empwebapp.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.testyantra.empwebapp.dao.EmployeeDAO;
import com.testyantra.empwebapp.dto.EmployeeInfo;
import com.testyantra.empwebapp.util.EmployeeDAOManger;
@WebServlet("/search")
public class SearchServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		HttpSession session=req.getSession(false);
		if(session==null) {
			RequestDispatcher dispatcher=req.getRequestDispatcher("/login.jsp");
			dispatcher.forward(req, resp);
		}else {
		int id=Integer.parseInt(req.getParameter("id"));
		EmployeeDAO dao=EmployeeDAOManger.getEmolyeeDao();
		EmployeeInfo info=dao.searchEmployee(id);

		req.setAttribute("info", info);
		RequestDispatcher dispatcher=req.getRequestDispatcher("/search.jsp");
		dispatcher.forward(req, resp);
		
//		PrintWriter out=resp.getWriter();
//		
//		out.println("<html>");
//		out.println("<a href='./home'>Home</a>");
//		out.println("<a href='./logout' style='float:right'>Logout</a>");
//		
//		if(info!=null) {
//		out.println("<table align='center'style='border: solid 1px black'>");
//		
//		out.println("<tr style='border: solid 1px black'>");
//		out.println("<th>Id");out.println("</th>");
//		out.println("<th>Name");out.println("</th>");
//		out.println("<th>Email");out.println("</th>");
//		out.println("</tr>");
//		
//		out.println("<tr style='border: solid 1px black'>");
//		out.println("<td>");out.println(info.getId()); out.println("</td>");
//		out.println("<td>");out.println(info.getName());out.println("</td>");
//		out.println("<td>");out.println(info.getEmial());out.println("</td>");
//		out.println("</tr>");
//		
//		out.println("</table>");
//		}else {
//		out.println("<h2>No Data Found</h2>");
//		}
//		
//		out.println("</html>");
		}
	}//end of doGet()
	
}//end of class
