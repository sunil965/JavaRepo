package bank.cash.counter;

public class Customer {

	String name;
	double balance = 10000;
	double amount;
	public Customer() {
		
	}
	public Customer(String name, double amount) {
		super();
		this.name = name;
		this.amount = amount;
	}
	
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	
	
	@Override
	public String toString() {
		return "Customer [name=" + name + ", balance=" + balance + ", amount="
				+ amount + "]";
	}
	
	
}
