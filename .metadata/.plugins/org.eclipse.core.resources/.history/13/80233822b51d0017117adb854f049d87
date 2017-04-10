package com.bridgelabz.java;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;

import com.bridgelabz.utlity.Utility;

public class Hashmapping {
	
	public static void main(String[] args) {
		Utility ult = new Utility();
		String number = ult.readFileContent("/home/bridgeit/JavaRepo/Java/src/HashFile.txt");
		
		String[] strArray = number.split(",");
		int[] intarray = new int[strArray.length];
		int i=0;
		for(String s:strArray)
		   {
			intarray[i] = Integer.parseInt(s);
			i++;
			}
//		for(int j:intarray){
//			System.out.println(j);
//		}
		
		
		ArrayList<Integer> list = new ArrayList<>();
		HashMap<Integer, LinkedList<Integer>> hash = new HashMap();
		
		for(int k=0; k<hash.size();k++){
			if(intarray[i]%11 ==0)
				list.add(intarray[i]);
		}
		System.out.println(hash.size());
	}

}
