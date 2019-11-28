package com.testyantra.filehandling;

import java.io.*;


public class FileReadingClass {

	public static void main(String[] args) {
	
		String path="C:\\Users\\Hpuser\\Desktop\\Text.txt";
		FileReader reader=null;
		try {
			 reader=new FileReader(path);
			 int i;
			
			 while((i=reader.read())!=-1) {
		
			 System.out.print((char)i);
			
			 }
			 
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}//end of main
}//end of class
