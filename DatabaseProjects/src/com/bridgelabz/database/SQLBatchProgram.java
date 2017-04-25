package com.bridgelabz.database;

import java.sql.DriverManager;
import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;

public class SQLBatchProgram {

	public static void main(String[] args) throws Exception {
		// LODING DRIVER.
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		// GETTING CONNECTION.
		Connection conn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/AddressBook","root","password");
		
		Statement stmt = (Statement) conn.createStatement();
//		conn.setAutoCommit(false);
		String query = "insert into Registration values(119,'Raj', 'Kundra', 5649871230)";
		stmt.addBatch(query);
		String query2 = "delete from Registration where id=118";
		stmt.addBatch(query2);
		String query3 = "update Registration set lastname ='KUMAR' where id=117";
		stmt.addBatch(query3);
		stmt.executeBatch();
		
		int[] countRow = stmt.executeBatch();
		System.out.println(countRow.toString());
//		conn.commit();
		
	}

}
