package com.bridgelabz.week1;

import java.io.PrintWriter;

import com.bridgelabz.utility.Utility;

public class ArraysProgram {
	
	public static void main(String[] args) {
		Utility utility = new Utility();
		PrintWriter printwriter = new PrintWriter(System.out);
		System.out.println("Enter row size.");
		int row = utility.getInteger();

		System.out.println("Enter column size.");
		int column = utility.getInteger();

		int arrayInt[][] = new int[row][column];
		System.out.println("Enter " + column * row + " values");
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < column; j++) {
				arrayInt[i][j] = utility.getInteger();
			}
		}
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < column; j++) {
				System.out.println("\t");
				printwriter.print("\t" + arrayInt[i][j] + " ");
			}
			printwriter.println("\t");
		}
		printwriter.flush();
		printwriter.close();
	}
}
