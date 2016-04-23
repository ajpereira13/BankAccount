package personal;

public class Account {
	
	private double balance;
	int index;
	public Account(int index, double balance) {
		this.index = index;
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
	
}