package com.bridgelabz.week1;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class OrderedList {
	File file = new File("/home/bridgeit/JavaRepo/datastructure/src/list/fileofwords.txt");
	ArrayList list = new ArrayList();
    
	public void read() throws IOException
	{		
		FileInputStream fis = new FileInputStream(file);
		String str = "";
		int content;
		while((content = fis.read())!=-1){
			str += (char) content;
		}		
		String[] arr = str.split(" ");	
		Arrays.sort(arr);
		for(int i=0; i<arr.length; i++){
			list.add(arr[i]);			
		}	
		System.out.println("List 1 : "+list);
      fis.close();	    
	}
	
	public void write() throws IOException
	{
		FileWriter out = new FileWriter(file);		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter the Input to be matched..");
		String input = scan.next();
		
	    if(list.contains(input))
	     {	
	    	list.remove(input); 
	    	for (int i = 0; i < list.size(); i++) {
				out.write(list.get(i) + " ");
				out.flush();
			}
			out.close();
	     }
	    else
	    	{
	    	list.add(input);
	    	Collections.sort(list);
	    	for (int i = 0; i < list.size(); i++) {
				out.write(list.get(i) + " ");
				out.flush();
			  }
			out.close();
	    	}	    
	    System.out.print("List 2 : "+list);
//	    scan.close();		
	}
	
	
	public static void main(String[] args) throws IOException 
	{
		OrderedList odlist = new OrderedList();
		Scanner scan = new Scanner(System.in);
		
		char ch;
		do {
			System.out.println("");
			System.out.println("......... MENU .........");
			System.out.println("1. Read File Data.");
			System.out.println("2. Enter Search Data.");
			
			System.out.println("\nEnter your choice.");
			int choice = scan.nextInt();
			System.out.println("");
			switch (choice)
			{

			case 1:
				   odlist.read();
		           break;
		           
		    case 2:
				  odlist.write();
				  break;
				  
			default :
					System.out.println("Invalid Argument. Please try again");
					break;
		   }
			System.out.println("\nDo you want to continue (Type y or n) \n");
	        ch = scan.next().charAt(0);  
		}while(ch == 'Y' || ch == 'y');
	}
}
