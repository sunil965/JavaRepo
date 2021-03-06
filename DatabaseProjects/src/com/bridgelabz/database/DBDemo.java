package com.bridgelabz.database;

import java.sql.Connection;
import java.sql.DriverManager;

import com.mysql.jdbc.ResultSet;
import com.mysql.jdbc.Statement;

public class DBDemo {

	public static void main(String[] args) throws Exception {

		Class.forName("com.mysql.jdbc.Driver");

		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/AddressBook", "root", "password");
		System.out.println("connected");

		Statement stmt = (Statement) con.createStatement();
		
		 //INSERTING VALUES TO DATABASE.
		
		 /*stmt.executeUpdate("insert into Registration values(101,'sunil','kumar',9561762956)");
		 stmt.executeUpdate("insert into Registration values(102,'prince','yadav',789456130)");
		 stmt.executeUpdate("insert into Registration values(103,'manoj','pawne',789456130)");
		 stmt.executeUpdate("insert into Registration values(104,'sanju','domble',789456130)");*/
		
		// UPDATE TABLE.
//		stmt.executeUpdate("update Registration set firstname = 'Sunil' where id = 101");
//		stmt.executeUpdate("update Registration set lastname = 'Kumar' where id = 101");
		
	     //DELETING ROW FROM DATABASE.
		 /* int
		 * result=stmt.executeUpdate("delete from Registration where id=103;");
		 * System.out.println(result+" records affected"); con.close(); */
		
		System.out.println("ID \tFIRSTNAME \tLASTNAME \tCONTACT");
		System.out.println("***************************************************");
		
		ResultSet rs = (ResultSet) stmt.executeQuery("select* from Registration");
		while (rs.next())
		{
			System.out.println(rs.getInt(1) + " \t" + 
							   rs.getString(2) + " \t\t"+ 
							   rs.getString(3) + " \t\t" + 
							   rs.getLong(4));
		}
	}
}
