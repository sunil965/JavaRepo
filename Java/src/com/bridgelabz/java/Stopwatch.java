package com.bridgelabz.java;

import com.bridgelabz.utlity.Utility;

public class Stopwatch {

	public static void main(String[] args) {
		Utility utility = new Utility();
		double startTime = System.currentTimeMillis();
		double stopTime;
		System.out.println("Count number upto....");
		int number = utility.getInteger();  
		for(int i=1; i<=number;i++){
			try {
				System.out.print(i+" ");
				Thread.currentThread().sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		stopTime = System.currentTimeMillis();
		double elapsedTime = (stopTime-startTime)/1000;
		System.out.println("\nTotal Time in Counting : "+elapsedTime+" sec.");
	}

}
