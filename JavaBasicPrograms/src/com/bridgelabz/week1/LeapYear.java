package com.bridgelabz.week1;

import com.bridgelabz.utility.Utility;

public class LeapYear {
	static Utility utility = new Utility();

	public static void main(String[] args) {

		System.out.println("Enter the year you have to check");
		int year = utility.getInteger();
		if ((year >= 1000) && (year <= 10000)) {
			if ((year % 4 == 0) || (year % 400 == 0) && (year % 100 != 0))
				System.out.println(year + " Is Leap Year");
			else
				System.out.println(year + " Isn't Leap Year");
		} else
			System.out.println("Year should be of four digits !");
	}
}
