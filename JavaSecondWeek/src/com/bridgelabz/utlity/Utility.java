package com.bridgelabz.utlity;

import java.io.File;
import java.io.FileNotFoundException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import com.sun.org.apache.bcel.internal.generic.NEW;

import javafx.scene.input.DataFormat;

public class Utility {
	Scanner scan = new Scanner(System.in);

	// to get a String input
	// takes no input arguments
	// and returns string
	public String getString() {
		return scan.nextLine();
	}

	// to get a Integer input
	// takes no input arguments
		// and returns integers
	public int getInteger() {
		return scan.nextInt();
	}

	// to get a Integer input
	public String getDate() {
		DateFormat dateformat = new SimpleDateFormat("DD/MM/YYYY");
		String date = dateformat.format(new Date());
		return date;
	}

	// to read from file.
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
