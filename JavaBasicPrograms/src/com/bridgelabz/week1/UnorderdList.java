package com.bridgelabz.week1;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.util.LinkedList;
import java.util.Scanner;

public class UnorderdList 
{
	File file = new File("/home/bridgeit/JavaRepo/datastructure/src/list/fileofwords.txt");
	LinkedList list = new LinkedList();
    
	public void read() throws IOException
	{		
		FileInputStream fis = new FileInputStream(file);
		String str = "";
		int content;
		while((content = fis.read())!=-1){
			str += (char) content;
		}		
		String[] arr = str.split(" ");		
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
		
		System.out.println("Enter the input..");
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
	    	for (int i = 0; i < list.size(); i++) {
				out.write(list.get(i) + " ");
				out.flush();
			  }
			out.close();
	    	}	    
	    System.out.print("List 2 : "+list);
	    scan.close();		
	}
	
	
	public static void main(String[] args) throws IOException 
	{
		UnorderdList unlist = new UnorderdList();
		unlist.read();
		unlist.write();
		
	}

}
