package com.bridgelabz.week1;
import java.util.Scanner;

public class Frog {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter height of wall.");
		int wallHeight = scanner.nextInt();

		System.out.println("How long frog jumps ?");
		int jumpLength = scanner.nextInt();

		System.out.println("Slip in each steps ?");
		int slip = scanner.nextInt();

		Frog frog = new Frog();
		frog.frogJump(wallHeight, jumpLength, slip);

	}

	public void frogJump(int wallHeight, int jump, int slip) {
		int travel = 0;
		int count = 0;
		while (travel < wallHeight) {
			travel = travel + jump - slip;
			count++;
		}
		System.out.println("Total jupms requires = " + count);
	}

}
