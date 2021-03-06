package com.bridgelabz.week1;
import java.util.Scanner;


public class InsertionSort {

	public static void main(String[] args)
	{
		InsertionSort ins = new InsertionSort();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("No of string ?");
		int number = sc.nextInt();
		
		String[] arr = new String[number];
		System.out.println("Enter Strings ");
		for(int k=0; k<arr.length; k++)
		{
			arr[k]=sc.next();
		}
		int n = arr.length;
		
		System.out.println("Array before  sorting...");
		for(String a:arr){
			System.out.print(a+" ");
		}
		
		ins.sort(arr, n);
		
	   System.out.println("\n Array after sorting...");
		for(String a:arr){
			System.out.print(a+ " ");
		}
				
	}
	
	public  void sort(String a[] , int n)
	{
		for(int i=1; i<n; i++)
		{
			String data = a[i];
			int hole = i;
			
			while((hole>0) && (data.compareTo(a[hole-1]))<0)
			{
				a[hole] = a[hole-1];
				hole--;
			}
			a[hole] = data;
		}
	}
}
