package com.testyantra.empwebapp.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.testyantra.empwebapp.dao.EmployeeDAO;
import com.testyantra.empwebapp.dto.EmployeeInfo;
import com.testyantra.empwebapp.util.EmployeeDAOManger;

@WebServlet("/register")
public class RegisterServlet extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	
		String msg="";
		int id=Integer.parseInt(req.getParameter("id"));
		String name=req.getParameter("name");
		String email=req.getParameter("email");
		String password=req.getParameter("password");
		
		EmployeeInfo info=new EmployeeInfo();
		info.setName(name);
		info.setEmial(email);
		info.setId(id);
		info.setPassword(password);
		
		EmployeeDAO dao=EmployeeDAOManger.getEmolyeeDao();
		boolean check=dao.registerEmployee(info);
		
		PrintWriter out=resp.getWriter();
		
		if(check) {
			 msg="Register Successfull";
			
		}else {
			 msg="Id can't be Repeated";
			
		}
		req.setAttribute("msg", msg);
		RequestDispatcher dispatcher=req.getRequestDispatcher("/login.jsp");
		dispatcher.include(req, resp);
	}//end of dopost
}
