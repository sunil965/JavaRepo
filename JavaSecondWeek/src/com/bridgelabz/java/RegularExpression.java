package com.bridgelabz.java;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.bridgelabz.utlity.Utility;

public class RegularExpression {

	public static void main(String[] args) {

		Utility ul = new Utility();
		Pattern pattern;
		Matcher matcher;

		String message = ul
				.readFileContent("/home/bridgeit/JavaRepo/Java/src/RegexFile.txt");
		System.out.println("Message : " + message);

		System.out.println("Enter Name");
		String name = ul.getString();
		pattern = Pattern.compile("<<name>>");
		matcher = pattern.matcher(message);
		if (matcher.find()) {
			message = message.replace(
					message.substring(matcher.start(), matcher.end()), name);
		}
		// System.out.println(message);

		System.out.println("Enter Full Name");
		String fullName = ul.getString();
		pattern = Pattern.compile("<<full name>>");
		matcher = pattern.matcher(message);
		if (matcher.find()) {
			message = message
					.replace(message.substring(matcher.start(), matcher.end()),
							fullName);
		}

		System.out.println("ENter your Cell Number");
		String contact = ul.getString();
		pattern = Pattern.compile("xxxxxxxxxx");
		matcher = pattern.matcher(message);
		if (matcher.find()) {
			message = message.replace(
					message.substring(matcher.start(), matcher.end()), contact);
		}

		// System.out.println("Date in DD/MM/YY");
		String date = ul.getDate();
		pattern = Pattern.compile("01/01/2016");
		matcher = pattern.matcher(message);
		if (matcher.find()) {
			message = message.replace(
					message.substring(matcher.start(), matcher.end()), date);
		}
		System.out.println("\n" + message);
		// System.out.println(date);
	}

}
