package com.bridgelabz.java;

import java.io.File;
import java.io.FileReader;
import java.util.*;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class DataInventory {

	public static void main(String[] args) {
		     double itemPrice = 0;
		     double itemTotal = 0;
		     double grossTotal = 0;
		     JSONParser parser = new JSONParser();

		try {
			Object object = parser.parse(new FileReader("/home/bridgeit/JavaRepo/Java/src/JSON.txt"));
			JSONObject jsonObj1 = (JSONObject) object;
			JSONArray data = (JSONArray) jsonObj1.get("data");
			String[] strings = {"Rice","Pulses","Wheat"};
			
			for(int i=0; i<data.size(); i++){
				JSONObject jsonObj2 = (JSONObject) data.get(i);
				JSONArray secondArray = (JSONArray) jsonObj2.get(strings[i]);
				System.out.println("\n"+strings[i]+" Data:\n");
				
				for(int j=0; j<strings.length; j++)
				{
					JSONObject jsonObj3 = (JSONObject) secondArray.get(j);
					System.out.println("Name : "+jsonObj3.get("name"));
					
					Object quantObject = jsonObj3.get("weight");
			        int quantity = Integer.parseInt((String)quantObject);
			        System.out.println("Weight : "+quantity+" Kg");
			       
			        Object priceObject = jsonObj3.get("price");
			        double price = Double.parseDouble((String) priceObject);
			        System.out.println("Price : "+price+" Rs/Kg");
			        
			        itemPrice = quantity*price;
			        itemTotal += itemPrice;
			        System.out.println("\nItem Price : "+itemPrice);
			        System.out.println("\n..........xxxx........\n");
				}
					System.out.println("=====");
					System.out.println("Item Total Price : "+itemTotal);
					System.out.println("=====");
					double total = itemTotal;
					itemTotal = 0;
					grossTotal += total; 
			}
		    System.out.println("Total Price : "+grossTotal);
		    grossTotal=0;
		} 
		catch (Exception e) {
			e.getMessage();
		}

	}

}
