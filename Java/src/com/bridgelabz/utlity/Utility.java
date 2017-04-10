package com.bridgelabz.utlity;

import java.io.File;
import java.io.FileNotFoundException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Utility {
	Scanner scan = new Scanner(System.in);
	
	
	// to get a String input
	public String getString(){
		return scan.nextLine(); 
	}
	
	// to get a Integer input
	public int getInteger(){
		return scan.nextInt(); 
	}
	
	// to get a Integer input
		public String getDate(){
			Date date = new Date();
			String newstring = new SimpleDateFormat("DD/MM/YYYY").format(date);
			return newstring; 
		}
		
	// to read from file.
	public String readFileContent(String path) {
		String string="";
		try {
			string = new Scanner(new File(path)).useDelimiter("\\Z").next();
		} catch (FileNotFoundException e) {
			
			System.out.println("File not found.");
		}
		return string;
	}
	

	
}
