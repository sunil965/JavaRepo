package bank.cash.counter;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Bank {

	static double bankBalance = 50000;
	Scanner scan = new Scanner(System.in);
	@SuppressWarnings("rawtypes")
	static Queue list = new LinkedList();
	
	@SuppressWarnings({ "unchecked" })
	
	
	public static void main(String[] args)
	{
	   System.out.println("Cash in Bank : "+ bankBalance+"\n");
//	   System.out.println("Customers in line ?");
//	   int listSize = new Scanner(System.in).nextInt();
//	 
//	 for(int i=0; i<listSize; i++)
//	 {
//		 System.out.println("Customer Name");
//		 String name = new Scanner(System.in).next();
//		 System.out.println("Transaction Amount");
//		 double amount = new Scanner(System.in).nextDouble();		 
//		 list.add(new Customer(name, amount));
//	 }
	   Customer cutomer1 = new Customer("first", 1000);
	   Customer cutomer2 = new Customer("second", 2000);
	   Customer cutomer3 = new Customer("third", 3000);
	   Customer cutomer4 = new Customer("fourth", 4000);
	   Customer cutomer5 = new Customer("fifth", 5000);
	   list.add(cutomer1);
	   list.add(cutomer2);
	   list.add(cutomer3);
	   list.add(cutomer4);
	   list.add(cutomer5);
	   
	 Tansaction transaction = new Tansaction();
	 transaction.bankOPeration(list, bankBalance);
	}
}
