package com.testyantra.filehandling;

import java.io.*;
import java.util.Properties;

public class PropertiesFileReader {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String path="Text.properties";
		FileReader reader;
		try {
			
			reader=new FileReader(path);
			
			Properties properties=new Properties();
			properties.load(reader);
			
			String name=properties.getProperty("name");
			String company=properties.getProperty("company");
			String gf=properties.getProperty("gf");
			
			System.out.println("Name: "+name+" Comapny: "+company+" Gf: "+gf);
			
			
		} catch (Exception e) {
		
			e.printStackTrace();
		}
		
		
	}

}
