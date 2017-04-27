package com.bridge.database;

import java.sql.DriverManager;

import com.mysql.jdbc.Connection;

public class MyConnection {
static Connection conn;
static public Connection connect(){
	
	try{
		Class.forName("com.mysql.jdbc.Driver");
		conn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/AddressBook",
				"root",
				"password");
	}
	catch(Exception e){
		e.printStackTrace();
	}
	return conn;
  }
}
