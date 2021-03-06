package com.bridgelabz.week1;

public class BubbleSort
{
	public static void main (String... args)
	{
		int[] arr = {2,4,7,1,5,3};
		int n = arr.length;
		
		System.out.println("Array before sorting...");
		for(int a:arr){
			System.out.print(a+ " ");
		}
		
		BubbleSort bs = new BubbleSort();
		bs.sort(arr, n);
		
		System.out.println("\n Array after sorting...");
		for(int a:arr){
			System.out.print(a+" ");
		}
	}
	
	public void sort(int a[], int n)
	{
		for(int k=0; k<n-1;k++)
		{
			for(int i=0; i<n-k-1; i++){
				if(a[i] > a[i+1]){
					int temp = a[i];
					a[i] = a[i+1];
					a[i+1] = temp;
				}
			}
		}
	}
}



 //      Bubble sort of string
/*
//		for(int i=0;i<arr.length;i++)
//		{
//			
//			for(int j=i+1;j<arr.length;j++)
//				{
//				if(arr[i].compareTo(arr[j])>0)
//				{
//					String temp=arr[i];
//					arr[i]=arr[j];
//					arr[j]=temp;
//				}
//				}
//		}
//		for(int i=0;i<arr.length;i++)
//		{
//			System.out.println(arr[i]);
//		}
*/