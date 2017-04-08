package bank.cash.counter;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Bank {

	static double bankBalance = 50000;
	Scanner scan = new Scanner(System.in);
	
	static Queue list = new LinkedList();
	
	@SuppressWarnings("resource")
	public static void main(String[] args)
	{
	   System.out.println("Cash in Bank : "+ bankBalance+"\n");
	   System.out.println("Customers in line ?");
	   int listSize = new Scanner(System.in).nextInt();
	 
	 for(int i=0; i<listSize; i++)
	 {
		 System.out.println("Customer Name");
		 String name = new Scanner(System.in).next();
		 System.out.println("Transaction Amount");
		 double amount = new Scanner(System.in).nextDouble();		 
		 Customer customer = new Customer(name, amount);
		 list.add(customer);
		 
	 }
	 Tansaction transaction = new Tansaction();
	 transaction.bankOPeration(list, bankBalance);
//	 Bank bank = new Bank();
//	 bank.transaction(list);
	}
	

	
}
