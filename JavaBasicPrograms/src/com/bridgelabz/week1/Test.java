package com.bridgelabz.week1;
import java.util.Date;

import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public class Test {

  public static void main(String[] args) {
	  
	  JSONObject rice1 = new JSONObject();
		 rice1.put("name", "A_Class");
		 rice1.put("weight", "10");
		 rice1.put("price", "25");
			 JSONObject rice2 = new JSONObject();
			 rice2.put("name", "B_Class");
			 rice2.put("weight", "20");
			 rice2.put("price", "30");
		 JSONObject rice3 = new JSONObject();
		 rice3.put("name", "C_Class");
		 rice3.put("weight", "13");
		 rice3.put("price", "35");
		 
		 JSONArray riceList = new JSONArray();
		 riceList.add(rice1);
		 riceList.add(rice2);
		 riceList.add(rice3);
		 

		 
		 JSONObject pulse1 = new JSONObject();
		 pulse1.put("name", "1st");
		 pulse1.put("weight", 5);
		 pulse1.put("price", "75");
		 JSONObject pulse2 = new JSONObject();
		 pulse2.put("name", "2nd");
		 JSONObject pulse3 = new JSONObject();
		 pulse3.put("name", "3rd");
		 
//		 JSONObject obj2 = new JSONObject();
		 JSONArray pulseList = new JSONArray();
		 pulseList.add(pulse1);
		 pulseList.add(pulse2);
		 pulseList.add(pulse3);
//		 obj2.put("Pulse", pulseList);
		 
		 
		 JSONObject wheat1 = new JSONObject();
		 wheat1.put("name", "Abc");
		 JSONObject wheat2 = new JSONObject();
		 wheat2.put("name", "Xyz");
		 JSONObject wheat3 = new JSONObject();
		 wheat3.put("name", "Mno");
		 
		 JSONArray wheatList = new JSONArray();
		 wheatList.add(wheat1);
		 wheatList.add(wheat2);
		 wheatList.add(wheat3);
		 
		 
		 
		 JSONArray dataList = new JSONArray();
		 dataList.add(riceList);
		 dataList.add(pulseList);
		 dataList.add(wheatList);
		 
		 JSONObject obj = new JSONObject();
		 obj.put("data", dataList);
		 
		 System.out.print(obj);
		 try (FileWriter file = new FileWriter("/home/bridgeit/JavaRepo/Test/output.txt")) {

	         file.write(obj.toJSONString());
	         file.flush();

	     } catch (IOException e) {
	         e.printStackTrace();
	     }

  }
}