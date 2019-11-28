package com.testyantra.jdbcapp;

import java.io.BufferedReader;
import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;

import com.mysql.jdbc.PreparedStatement;

public class InsertWithCSVFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String url="jdbc:mysql://localhost:3306/ust_ty_db";
		String sql="insert into employee values(?,?,?,?)";
		try (FileReader in=new FileReader("CSV.txt");
				BufferedReader reader =new BufferedReader(in);
				Connection conn=DriverManager.getConnection(url, "root", "root");
				PreparedStatement pstmt=(PreparedStatement) conn.prepareStatement(sql)){
			
			while(reader.ready()) {
				String line=reader.readLine();
				String[] datas=line.split(",");
				
				int id=Integer.parseInt(datas[0]);
				String name=datas[1];
				int sal=Integer.parseInt(datas[2]);
				String gender=datas[3];
				
				pstmt.setInt(1, id);
				pstmt.setString(2, name);
				pstmt.setInt(3, sal);
				pstmt.setString(4, gender);
//				
//				int count=pstmt.executeUpdate();
//				System.out.println(count+" Rows inserted");
			
				pstmt.addBatch();// it will add the all data before hitting the database
			}
			int[] counts=pstmt.executeBatch();//return type of executebatch() is int arrya
			System.out.println(counts.length+" rows Inserted");
			
		} catch (Exception e) {
			e.printStackTrace();
			
			
		}
	}

}
