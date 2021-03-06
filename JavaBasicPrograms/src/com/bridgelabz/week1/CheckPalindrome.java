package com.bridgelabz.week1;

import java.util.*;
import java.util.Scanner;

public class CheckPalindrome {

	public static void main(String[] args) 
	{
	    CheckPalindrome object = new CheckPalindrome();		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter any string.");
		String userInput = scan.next();
		object.isPalindrome(userInput);
	}

    public void isPalindrome(String input)
     {
    	Deque list = new LinkedList();    	
	    for(int i=input.length()-1; i>=0; i--)
		{			
			list.add(input.charAt(i));			
		}
	   System.out.println(list);
		 String reverse = "";
		while(!list.isEmpty())
		{
			reverse += list.remove();			
		}
		if(input.equals(reverse))
		   System.out.println(input+" is palindrome");
		else
			System.out.println(input+" is not palindrome.");
  }
}
