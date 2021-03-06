package com.bridgelabz.java;

import java.io.File;
import java.io.FileWriter;
import java.util.*;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;

import com.bridgelabz.utlity.Utility;

public class Hashmapping {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) throws IOException {
		Utility utility = new Utility();
		String string = utility.readFileContent("/home/bridgeit/JavaRepo/Java/src/HashFile.txt");
		String[] strArray = string.split(",");
		int[] intarray = new int[strArray.length];		
		                                           // copying element from string array to int array.
		for(int i=0;i<strArray.length;i++) {
			intarray[i] = Integer.parseInt(strArray[i]);
		   }  	
				
		HashMap<Integer, LinkedList<Integer>> hash = new HashMap<Integer, LinkedList<Integer>>();
	    LinkedList<Integer>[] list = new LinkedList[11];
		
		for(int i=0;i<list.length;i++) {
		   list[i] = new LinkedList<Integer>();
		   hash.put(i, list[i]);
		}
		
		int slotNumber;
		for(int i=0;i<intarray.length; i++)	{            
			 slotNumber = intarray[i]%11;// remainder will be the slot number.
			 list[slotNumber].add(intarray[i]);
		}
		
		    System.out.println("Hashmap With Repeated Element"+hash);
		
			System.out.println("\nEnter Number you want to search or delete");
			int num = utility.getInteger();
			int position = num%11;
		
			if(list[position].contains(num)) {
				list[position].removeFirstOccurrence(num);
			  }
			else {
				  list[position].add(num);
			     }
		
	      	System.out.println("Hashmap Without Repeated Element"+hash);
		
			FileWriter fileWriter = new FileWriter(new File("/home/bridgeit/JavaRepo/Java/src/hashresult.txt"));
			for (int i = 0; i < hash.size(); i++) {
				fileWriter.write(hash.get(i) + " ");
				fileWriter.flush();
			  }
			fileWriter.close();
		
	}
}
