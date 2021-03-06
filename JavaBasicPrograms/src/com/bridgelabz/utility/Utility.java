package com.bridgelabz.utility;

import java.io.File;
import java.io.FileNotFoundException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Utility {
	Scanner scan = new Scanner(System.in);

	/*
	 * TO GET STRING INPUT TOOK NO ARGUMENT RETURN STRING
	 */
	public String getString() {
		return scan.nextLine();
	}

	/*
	 * TO GET INTEGER INPUT TOOK NO ARGUMENT RETURN INTEGER
	 */
	public int getInteger() {
		return scan.nextInt();
	}

	// TO GET DATE INPUT
	public String getDate() {
		DateFormat dateformat = new SimpleDateFormat("DD/MM/YYYY");
		String date = dateformat.format(new Date());
		return date;
	}

	// TO READ A FILE.
	public String readFileContent(String path) {
		String string = "";
		try {
			string = new Scanner(new File(path)).useDelimiter("\\Z").next();
		} catch (FileNotFoundException e) {

			System.out.println("File not found.");
		}
		return string;
	}

}
