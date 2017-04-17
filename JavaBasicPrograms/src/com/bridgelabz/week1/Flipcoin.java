package com.bridgelabz.week1;

import java.util.Scanner;
import java.util.Random;

public class Flipcoin{
   public static void main(String[] args){
	double head = 0;
	double tail = 0;
	int count = 0;
  	Scanner sc = new Scanner(System.in);
	System.out.println("How many times you have to toss");
	int toss = sc.nextInt();

	while(count <= toss)
	{
		double randomValue = Math.random();
		if(randomValue > 0.5)
		{
		 System.out.println("you got HEAD !!");
		 head++;
		 count++;	
		}
		else{
  		 System.out.println("you got Tail !!");
		 tail++;
		 count++;

                }
		
   	 }
		System.out.println("Head's % = "+(head/count)*100);
		System.out.println("Tail's % = "+(tail/count)*100);
  }
}
