package com.testyantra.empwebapp.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.testyantra.empwebapp.dto.EmployeeInfo;

public class EmployeeDAOJdbcImpl implements EmployeeDAO {

	private final String URL="jdbc:mysql://localhost:3306/ust_ty_web_db?user=root&password=root";
	private static final String DRIVER_CLASS_NAME="com.mysql.jdbc.Driver";
	private static final String SELECT_QUERY="select * from employee_info where id=?";
	private static final String INSERT_QUERY="insert into employee_info values(?,?,?,?)";
	private static final String UPDATE_QUERY="update employee_info set password=? where id=?";
	
	@Override
	public EmployeeInfo auth(int id, String password) {
			
		EmployeeInfo info=searchEmployee(id);
		
		if(info!=null) {
			String pass=info.getPassword();
				if(pass.equals(password)) {
					return info;
				}
		}
		
		return null;
	}//end of authenticaton.

	@Override
	public EmployeeInfo searchEmployee(int id) {
		
//		String sql="select * from employee_info where id=?";
		
			try {
			
			Class.forName(DRIVER_CLASS_NAME);
			
			try(Connection conn=DriverManager.getConnection(URL);
				PreparedStatement pstmt=conn.prepareStatement(SELECT_QUERY);){
				
				pstmt.setInt(1, id);
				
			try(ResultSet rs=pstmt.executeQuery()){
				
				if(rs.next()) {
					
					EmployeeInfo info=new EmployeeInfo();
					info.setId(rs.getInt("id"));
					info.setName(rs.getString("name"));
					info.setEmial(rs.getString("email"));
					info.setPassword(rs.getString("password"));
					
					return info;
				}else {
					return null;
				}
			}
				
				
			}
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}//end of try-catch block
		
		
		
	}//end of serch employee

	@Override
	public boolean changePassword(int id, String password) {
		
//		String sql="update employee_info set password=? where id=?";
		
		try {
			
			Class.forName(DRIVER_CLASS_NAME);
			
			try(Connection conn=DriverManager.getConnection(URL);
				PreparedStatement pstmt=conn.prepareStatement( UPDATE_QUERY);) {
				
				pstmt.setInt(2, id);
				pstmt.setString(1, password);
				
				int count=pstmt.executeUpdate();
		
				return count>0?true:false;
				
			}
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}//end of try-catch block
		
	}//end of change password

	@Override
	public boolean registerEmployee(EmployeeInfo info) {
		
//		String sql="insert into employee_info values(?,?,?,?)";
	
			try {
				
				Class.forName(DRIVER_CLASS_NAME);
				
				try(Connection conn=DriverManager.getConnection(URL);
					PreparedStatement pstmt=conn.prepareStatement( INSERT_QUERY);) {
				
						pstmt.setInt(1, info.getId());
						pstmt.setString(2, info.getName());
						pstmt.setString(3, info.getEmial());
						pstmt.setString(4, info.getPassword());
					
					int count=pstmt.executeUpdate();
						if(count>0) {
							return true;
						}else {
							return false;
						}
				}
			} catch (Exception e) {
				e.printStackTrace();
				return  false;
			}
		
		
		
	}

}
