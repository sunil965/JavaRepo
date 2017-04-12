package com.bridgelabz.java;

import java.io.FileReader;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class SampalJSON {

	public static void main(String[] args) {
		double sum = 0.0;
		// TODO Auto-generated method stub
		JSONParser parser = new JSONParser();
		try{
			Object ob = parser.parse(new FileReader("/home/bridgeit/JavaRepo/Java/src/JSON.txt"));
			JSONObject object = (JSONObject) ob;//json object created
			
			 JSONArray data = (JSONArray) object.get("data");
			 String[] string = {"Rice","Pulses","Wheat"};
			
		 /*
		  * To read the .json file content i.e Object and each Object [name,values]
		  * */
		 for(int i=0;i<data.size();i++){
			 JSONObject itemObj = (JSONObject) data.get(i);
			 JSONArray item = (JSONArray) itemObj.get(string[i]);
			 System.out.println(string[i]+" Data:");
			 /*
			  * To display the array elements[name,value]
			  * */
			
			 for (int y = 0; y < item.size(); y++) {
			        JSONObject itemData = (JSONObject) item.get(y);
			        System.out.println("name: "+itemData.get("name"));
			      
			        Object quantObject = itemData.get("weight");
			        int quantity = Integer.parseInt((String)quantObject);
			        System.out.println("Weight: "+quantity+" Kg");
			       
			        Object priceObject = itemData.get("price");
			        double price = Double.parseDouble((String) priceObject);
			        System.out.println("price: "+price+" Rs/Kg");
			        
			        sum=sum+price;
			        System.out.println("--------------------------------");
				  }
			 System.out.println("Total Price of Item:"+sum);
			 System.out.println("****************************");
		 }

	}
	catch(Exception e){
		System.out.println(e);
	}
	}

}
