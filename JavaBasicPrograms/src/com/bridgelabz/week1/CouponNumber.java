package com.bridgelabz.week1;

//import java.util.Random;
import java.lang.StringBuffer;

public class CouponNumber
{
 public static void main(String[] args)
 {
  char[] character = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890".toCharArray();
  int max = 100000000;
  int randomNum =(int) (Math.random()*max);
  StringBuffer sb = new StringBuffer();
	while (randomNum>0)
		{
			sb.append(character[randomNum % character.length]);
			randomNum /= character.length;
		}

		String couponCode=sb.toString();
		System.out.println("Coupon Code: "+couponCode);	
 }
}
