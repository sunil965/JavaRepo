package com.bridgelabz.week1;
import java.util.Scanner;


public class InsertionSortInteger
{
	public static void main(String[] args) {
		InsertionSortInteger bs = new InsertionSortInteger();
        Scanner sc = new Scanner(System.in);		
		System.out.println("No of integers ?");
		int number = sc.nextInt();
		
		int[] arr = new int[number];
		System.out.println("Enter integers ");
		for(int k=0; k<arr.length; k++)
		{
			arr[k]=sc.nextInt();
		}
		int n = arr.length;
		
		System.out.println("Array before  sorting...");
		for(int a:arr){
			System.out.print(a+" ");
		}		
		
		bs.sort(arr, n);
		
		System.out.println("\n Array after sorting...");
		for(int a:arr){
			System.out.print(a+ " ");
		}
	}
	
	public  void sort(int a[] , int n){
		for(int i=1; i<n-1; i++){
			int data = a[i];
			int hole = i;
			while(hole>0 && a[hole-1]>data){
				a[hole] = a[hole-1];
				hole = hole-1;
			}
			a[hole] = data;
		}
	}

}
