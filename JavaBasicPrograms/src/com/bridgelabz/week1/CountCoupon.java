package com.bridgelabz.week1;

import java.util.Random;
import com.bridgelabz.utility.Utility;

public class CountCoupon {
	public static void main(String[] args) {
		Utility utility = new Utility();
		System.out.println("Enter no of coupon");
		int numberOfCoupan = utility.getInteger();
		int coupansArray[] = new int[numberOfCoupan];
		int count = 0;
		for (int i = 0; i < numberOfCoupan; i++) {
			Random ran = new Random();
			int randumNumber = ran.nextInt(numberOfCoupan);
			coupansArray[i] = randumNumber;
			count++;
			for (int j = 0; j < i; j++) {
				if (coupansArray[j] == randumNumber) {
					i--;
				}
			}
		}// end of for.

		for (int a : coupansArray)
			System.out.println(a);
			System.out.println("Random number's count : " + count);
	}// end of main.
}
