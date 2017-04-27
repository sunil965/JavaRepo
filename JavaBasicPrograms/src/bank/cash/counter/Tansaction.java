package bank.cash.counter;

import java.util.Queue;
import java.util.Scanner;

public class Tansaction {

	@SuppressWarnings("resource")
	public void bankOPeration(Queue list, double bankBalance) 
	{
		double balance;
		int len = list.size();
		for (int i = 0; i <len ; i++) 
		{ 
			Customer customer = (Customer) list.remove();
			System.out.println("\n What you want Withdraw or Deposite");
			String operation = new Scanner(System.in).next();
			if (operation.equalsIgnoreCase("deposite")) {
				bankBalance = bankBalance + customer.getAmount();
				balance = customer.getBalance() + customer.getAmount();
				System.out.println(customer.getName() + "  balance is : "
						+ balance);
				customer.setBalance(balance);
			} else {
				if (customer.getAmount() <= customer.getBalance()) {
					bankBalance = bankBalance - customer.getAmount();
					balance = customer.getBalance() - customer.getAmount();
					System.out.println(customer.getName() + " balance is : "
							+ balance);
					customer.setBalance(balance);
				} else {
					System.out.println("Balance is below then required");
				}
			}
			System.out.println("Bank Balance after " + customer.getName()
					+ " : " + bankBalance);
		}
	}

}
