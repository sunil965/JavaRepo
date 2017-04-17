package com.bridgelabz.week1;

import java.util.Scanner;

public class NumberMagic{
 public static void main(String[] args) {
		NumberMagic nm = new NumberMagic();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter limit for steps ");
		//int limit = sc.nextInt();
		//int number = (int) Math.pow(2, limit);
		int high = sc.nextInt();
		System.out.println("Select a number between 0 and "+ high+"-1");
		
		int num = nm.secret(0, high);
		System.out.println("Your number is "+num);
		sc.close();
	}
	
	public int secret(int low, int high){
		
		
		if((high - low)==1)		
			return low;
		
		int mid = low + (high - low)/2;
		
		System.out.println("Is less then "+mid);
//		boolean status = true;
		
		Scanner sc = new Scanner(System.in);
		boolean status;
		if(status = sc.nextBoolean())
					return secret(low, mid );
				else 
					return secret(mid,high);

	}
}
