package com.bridgelabz.week1;
import java.util.Arrays;
import java.util.Scanner;


public class BinarySearchInteger {

	public static void main(String[] args)
	{
		BinarySearchInteger bsint = new BinarySearchInteger();
		InsertionSortInteger inssort = new InsertionSortInteger();
		Scanner sc1 = new Scanner(System.in);
  		System.out.println("No of integers ?");
  		int number1 = sc1.nextInt();			  		
  		int[] arr1 = new int[number1];
  		System.out.println("Enter integers ");
  		for(int k=0; k<arr1.length; k++)
  		{ 	arr1[k]=sc1.nextInt();	}
  		Arrays.sort(arr1);
  		System.out.println("Which number you have to search ?");
  		int num = sc1.nextInt();		
  		
  		bsint.search(arr1, num);
  		
	}
 
	 public void search(int[] arr, int item)
	 {   
		 int first = 0;
         int last = item - 1;
         int middle = (first + last)/2;
         while( first <= last )
          {  if ( arr[middle] < item )
        		 first = middle + 1;
        	 else if ( arr[middle] == item )
        	 {  System.out.println(item + " found at location " + (middle + 1) + ".");
        	 	break;
        	 }
             else
              { last = middle - 1; }
        	    middle = (first + last)/2;
          }
         if ( first > last )
         System.out.println(item + " is not found.\n");
	 } 
}
