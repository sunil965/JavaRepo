package com.bridgelabz.week1;

import java.util.Scanner;


public class HarmonicNumber{
  public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	System.out.println("Get user input for harmonic calculation");
	int userInput = sc.nextInt();
	double harmonic = 0;
	for(double i=1; i<=userInput; i++)
	{	 
	  harmonic =harmonic+ (1/i);
          System.out.println(harmonic);
        }
 } 
}
