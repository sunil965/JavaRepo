package bank.cash.counter;


import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Tansaction {
	Scanner scan = new Scanner(System.in);
	public void bankOPeration(Queue list, double bankBalance)
	{
//		Customer cusStomer=(Customer) list.remove();
	    double balance; 
		for(int i=0;i<=list.size();i++)
		    {
			  Customer customer=(Customer) list.remove();
			  System.out.println("\n What you want Withdraw or Deposite");
			  String operation = scan.next();
			  if(operation.equalsIgnoreCase("deposite"))
			  {
				  bankBalance = bankBalance +customer.getAmount();
				  balance= customer.getBalance() + customer.getAmount();
				  System.out.println(customer.getName()+"  balance is : "+balance);
				  customer.setBalance(balance);
			  }
			  else
			  {
				  if(customer.getAmount() <= customer.getBalance())
				    { bankBalance = bankBalance - customer.getAmount();
					  balance= customer.getBalance() - customer.getAmount();
					  System.out.println(customer.getName()+" balance is : "+balance); 
					  customer.setBalance(balance);
				    }
				  else
				    { System.out.println("Balance is below then required");
				    }
			  }  System.out.println("Bank Balance after "+customer.getName()+" : "+ bankBalance);  
		  }
	}

}
