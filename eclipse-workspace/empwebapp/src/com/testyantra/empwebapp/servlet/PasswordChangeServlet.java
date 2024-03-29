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

@WebServlet("/changepassword")
public class PasswordChangeServlet extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	
		
		HttpSession seesion=req.getSession();
		if(seesion!=null) {
			String pass=req.getParameter("password");
			String confirmpass=req.getParameter("confirmpassword");
			
			if(pass.equals(confirmpass)) {
				EmployeeInfo info=(EmployeeInfo)seesion.getAttribute("info");
				EmployeeDAO dao=EmployeeDAOManger.getEmolyeeDao();
				dao.changePassword(info.getId(), pass);
				RequestDispatcher dispatcher=req.getRequestDispatcher("/home");
				dispatcher.forward(req, resp);
			}else {
				String msg="Password not matching";
				req.setAttribute("msg", msg);
				
				RequestDispatcher dispatcher=req.getRequestDispatcher("/passwordchange.jsp");
				dispatcher.forward(req, resp);
			}
			
			
			
		}else {
			RequestDispatcher dispatcher=req.getRequestDispatcher("/login.jsp");
			dispatcher.forward(req, resp);
		}
		
	}//end of dopost
}//end of class
