package com.bridgelabz.java;

import com.bridgelabz.utlity.Utility;

public class Stopwatch {

	public static void main(String[] args) {
		Utility utility = new Utility();
		Stopwatch watch = new Stopwatch();
		
		double startTime, stopTime, elapsedTime;
		startTime = System.currentTimeMillis();
		
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
		elapsedTime = watch.elapse(startTime, stopTime);
		System.out.println("Elapse time : "+elapsedTime);
	   
	}
	
	public double elapse(double start, double stop){
		double elapsedTime = (stop-start)/1000;
			return elapsedTime;
	}
	

}
