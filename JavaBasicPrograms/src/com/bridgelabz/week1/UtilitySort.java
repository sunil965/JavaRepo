package com.bridgelabz.week1;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;


public class UtilitySort 
{
  public static void main(String[] args) throws IOException
  {
	  InsertionSort inssrt = new InsertionSort();
	  InsertionSortInteger intsort = new InsertionSortInteger();
	  BinarySearchString binserstr = new BinarySearchString();
	  BubbleSort bsint = new BubbleSort();
	  BubbleSortString bsstr = new BubbleSortString();
	  BinarySearchInteger bsnint = new BinarySearchInteger();
	  
	  Scanner scan = new Scanner(System.in);
	  int choice = scan.nextInt();
      System.out.println("Utility for Insertion Bubble and Binary Search");          
      char ch;
      do
      {
          System.out.println("\nWhich Operations you want ?\n");
          System.out.println("1. InsertionSort method for string ");
          System.out.println("2. insertionSort method for integer");
          System.out.println("3. bubbleSort method for integer");
          System.out.println("4. bubbleSort method for string");
          System.out.println("5. binarySearch method for String"); 
            
          switch (choice)
          {
          case 1 :  Scanner sc = new Scanner(System.in);
			  		System.out.println("No of string ?");
			  		int number = sc.nextInt();			  		
			  		String[] arr = new String[number];
			  		System.out.println("Enter Strings ");
			  		for(int k=0; k<arr.length; k++)
			  		{ 	arr[k]=sc.next();	}
			  		int n = arr.length;			  		
			  		inssrt.sort(arr, n);			  		
			  	    System.out.println("\n Array after sorting...");
			  		for(String a:arr){	System.out.print(a+ " ");	}
			  		break;
			  		
          case 2 :  Scanner sc1 = new Scanner(System.in);
			  		System.out.println("No of integers ?");
			  		int number1 = sc1.nextInt();			  		
			  		int[] arr1 = new int[number1];
			  		System.out.println("Enter integers ");
			  		for(int k=0; k<arr1.length; k++)
			  		{ 	arr1[k]=sc1.nextInt();	}
			  		int n1 = arr1.length;
			  		intsort.sort(arr1, n1);
			  		System.out.println("\n Array after sorting...");
			  		for(int a:arr1){	System.out.print(a+ " ");	}
			  		break;
			  		
          case 3 :  Scanner sc3 = new Scanner(System.in);
			  		System.out.println("No of integers ?");
			  		int number2 = sc3.nextInt();			  		
			  		int[] arr2 = new int[number2];
			  		System.out.println("Enter integers ");
			  		for(int k=0; k<arr2.length; k++)
			  		{ 	arr2[k]=sc3.nextInt();	}
			  		int n2 = arr2.length;
			  		bsint.sort(arr2, n2);
			  		System.out.println("\n Array after sorting...");
			  		for(int a:arr2){	System.out.print(a+ " ");	}
			  		break;
			  		
          case 4 :  Scanner sc4 = new Scanner(System.in);
			  		System.out.println("No of string ?");
			  		int number3 = sc4.nextInt();			  		
			  		String[] arr3 = new String[number3];
			  		System.out.println("Enter Strings ");
			  		for(int k=0; k<arr3.length; k++)
			  		{ 	arr3[k]=sc4.next();	}			  		
			  		bsstr.sort(arr3);			  		
			  	    System.out.println("\n Array after sorting...");
			  		for(String a:arr3){	System.out.print(a+ " ");	}
			  		break;
			  		
          case 5 : Scanner sc5 = new Scanner(System.in); 	    	  
  	               File file = new File("/home/bridgeit/Desktop/sample.txt");		
  		           FileInputStream fis = new FileInputStream(file);  		
  		           String str = "";        
                   int content;
                   while ((content = fis.read()) != -1)
                  { str += (char) content; }
                   String[] strArray = str.split(",");
                   Arrays.sort(strArray);
                   System.out.println("Which word you have to search.");
            	   String word = sc5.next();
            	   int result = binserstr.binarySearch(strArray, word);
            	   if(result == -1)
            	  	System.out.println("Not found.");
            	   else
            		 System.out.println("Your searched word is found at index "+result);
            		fis.close();
            		//sc5.close();
                   break;
                   
          case 6 :  Scanner sc6 = new Scanner(System.in);
		    		System.out.println("No of integers ?");
		    		int number11 = sc6.nextInt();			  		
		    		int[] arr11 = new int[number11];
		    		System.out.println("Enter integers ");
		    		for(int k=0; k<arr11.length; k++)
		    		{ 	arr11[k]=sc6.nextInt();	}
		    		Arrays.sort(arr11);
		    		System.out.println("Which number you have to search ?");
		    		int num = sc6.nextInt();		    		
		    		bsnint.search(arr11, num);
	                   
          default : 
              System.out.println("Wrong Entry \n ");
              break;   
          }
          System.out.println("\nDo you want to continue (Type y or n) \n");
          ch = scan.next().charAt(0);                        
       } while(ch == 'Y'|| ch == 'y');    
  }
}
