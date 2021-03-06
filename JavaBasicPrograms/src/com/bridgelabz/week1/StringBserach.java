package com.bridgelabz.week1;

import java.io.*;
import java.util.*;

public class StringBserach
{
 public static void main(String[] args) throws IOException 
 {  
   Scanner sc = new Scanner(System.in); 	
   String content = new Scanner(new File("/home/bridgeit/Desktop/sample.txt")).useDelimiter("\\Z").next();
   System.out.println(content);
   System.out.println("............................");

   String[] strArray = content.split(" ");
   for(String s:strArray)
   {System.out.println(s); }
   System.out.println("............................");

   Arrays.sort(strArray);
   for(int i=0; i<strArray.length; i++)
   {System.out.println(); }

   System.out.println("Which word you have to search.");
   String word = sc.next();

  	int result = binarySearch(strArray, word);
	System.out.println("Your searched word is at index "+result);
 }

  public static int binarySearch(String array[], String value)
  {
      int first = 0;
      int last = array.length - 1;
  	 if(first > last) System.out.println("No words !");
	    
		while(first < last)
		{
			int mid = first + (last - first)/2;
			if(value.compareTo(array[mid])==0)
				return mid;
			
		        if(value.compareTo(array[mid])<0)
				last = mid-1; 
		        else
		          first = mid+1;
		 }
	     return -1;
		
   }
}

