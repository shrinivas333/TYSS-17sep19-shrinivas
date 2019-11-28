package com.testyantra.empapp;


import java.util.List;
import java.util.Scanner;

import com.testyantra.empapp.dao.EmployeeDAO;
import com.testyantra.empapp.dao.EmployeeDAOImpl;
import com.testyantra.empapp.dto.EmployeeBean;
import com.testyantra.empapp.util.EmployeeManger;


public class App {

	public static void main(String[] args) {
		
		System.out.println("press 1 for get the employee data");
		System.out.println("press 2 for insert employee data");
		System.out.println("press 3 for update the employee data");
		System.out.println("press 4 for delete the employee data");
		System.out.println("press 5 for search single the employee data");
		
		Scanner sc=new Scanner(System.in);
		int ch=sc.nextInt();
		
		switch (ch) {
		case 1:
			EmployeeDAO impl= EmployeeManger.getEmployeeDAo();
			List<EmployeeBean> bean=impl.getAllEmployeeData();
			for (EmployeeBean Bean : bean) {
				System.out.println("id is: "+Bean.getId());
				System.out.println("name is: "+Bean.getName());
				System.out.println("salary is: "+Bean.getSalary());
				System.out.println("gender is: "+Bean.getGender());
			}
			break;
		case 2:
			break;
			
		case 3:
			break;
			
		case 4:
			break;
		case 5:
			EmployeeDAO impl5=EmployeeManger.getEmployeeDAo();
			int id=sc.nextInt();
		EmployeeBean bean5=impl5.searchEmployeeData(id);
			if(bean5!=null) {
				System.out.println("id is: "+bean5.getId());
				System.out.println("name is: "+bean5.getName());
				System.out.println("salary is: "+bean5.getSalary());
				System.out.println("gender is: "+bean5.getGender());
				System.out.println("========================");
			}else {
				System.out.println("No Data Found!!!");
			}
			break;

			
			
		}
		
		
	sc.close();
	}//end of main method
}//end of class
