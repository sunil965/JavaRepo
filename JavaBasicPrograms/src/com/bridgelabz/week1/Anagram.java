package com.bridgelabz.week1;

import java.util.Arrays;
import com.bridgelabz.utility.Utility;

public class Anagram {
	public static void main(String[] args) {
		Utility utility = new Utility();
		System.out.println("Enter first string");
		String stringOne = utility.getString();

		System.out.println("Enter second string");
		String stringTwo = utility.getString();
		boolean flag = true;

		if (stringOne.length() != stringTwo.length()) {
			flag = false;
		} else {
			char[] stringChar1 = stringOne.toLowerCase().toCharArray();
			char[] stringChar2 = stringTwo.toLowerCase().toCharArray();
			Arrays.sort(stringChar1);
			Arrays.sort(stringChar2);
			flag = (Arrays.equals(stringChar1, stringChar2));

		}

		if (flag)
			System.out.println("Anagram !!");
		else
			System.out.println("Not a Anagram");

	}
}
