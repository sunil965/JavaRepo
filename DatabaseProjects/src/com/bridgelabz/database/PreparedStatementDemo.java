package com.bridgelabz.database;

import java.sql.DriverManager;
import java.util.Scanner;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import com.mysql.jdbc.ResultSet;

public class PreparedStatementDemo {

	static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) throws Exception {
		
		Class.forName("com.mysql.jdbc.Driver");
			String url = "jdbc:mysql://localhost:3306/AddressBook";
		Connection conn = (Connection) DriverManager.getConnection(url,"root","password");
			String query = "insert into Registration values(?,?,?,?)";
		PreparedStatement pstmt = (PreparedStatement) conn.prepareStatement(query);
		
		// INSERTION TO DATABASE.
		System.out.println("ENTER '1' TO INSERT.");
		int choice = scan.nextInt();
		while(choice !=0){
			System.out.println("ENTER ID");
			pstmt.setInt(1,scan.nextInt());
			System.out.println("ENTER FIRSTNAME");
			pstmt.setString(2, scan.next());
			System.out.println("ENTER LASTNAME");
			pstmt.setString(3, scan.next());
			System.out.println("ENTER CONTACT");
			pstmt.setInt(4,scan.nextInt());
			pstmt.executeUpdate();
			System.out.println("ENTER '1' TO INSERT MORE OR '0' TO EXIT.");
			choice = scan.nextInt();
		}
		/*pstmt.setInt(1,107);
		pstmt.setString(2, "Manoj");
		pstmt.setString(3, "Singh");
		pstmt.setInt(4,749456202);
		pstmt.executeUpdate();*/
		
		// DELETION.
		// pstmt.executeUpdate("delete from Registration where id = 109;");
		
		// UPDATION.
		 /*pstmt.executeUpdate("update Registration set firstname = 'Sohail' where id = 112;");
		 pstmt.executeUpdate("update Registration set lastname = 'khan' where id = 112;");*/
		
	     String query2 = "select * from Registration order by firstname";
	     ResultSet rs =  (ResultSet) pstmt.executeQuery(query2);
	     System.out.println("ID  FIRSTNAME LASTNAME  CONTACT");
		 System.out.println("***************************************************");
	      
	      while (rs.next()) {
	         int id = rs.getInt("id");
	         String fname = rs.getString("firstname");
	         String lname = rs.getString("lastname");
	         Long contact = rs.getLong("contact");
	         System.out.println(id + "\t" + fname+"\t"+lname+"\t"+contact);
	      } 

	}

}
