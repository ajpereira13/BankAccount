package personal;

public class Account {
	private String name;
	private double balance;
	int index;
	public Account(int index, double balance) {
		this.index = index;
		this.balance = balance;
	}
	public Account(String name, double balance) {
		this.name = name;
		this.balance = balance;
	}
	
	public void deposit(double d) {
		balance += d;
	}
	public void withdraw(double w) {
		balance -= w;
	}
	
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public void setIndex(int index) {
		this.index = index;
	}
	public double getBalance() {
		return balance; 
	}
	public int getIndex() {
		return index;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
}