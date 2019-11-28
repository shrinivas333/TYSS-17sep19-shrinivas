package com.testyantra.empapp.util;

import com.testyantra.empapp.dao.EmployeeDAO;
import com.testyantra.empapp.dao.EmployeeDAOImpl;

public class EmployeeManger {

	public static  EmployeeDAO getEmployeeDAo() {
		
		return new EmployeeDAOImpl();
	}
}
