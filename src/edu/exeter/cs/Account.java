package edu.exeter.cs;

public class Account {
	
	private double balance;
	private String name;
	
	public Account(String name, double balance){
		this.name = name;
		this.balance = balance;
	}
	
	public void Deposit(double num){
		balance += num;
	}
	
	public void Withdraw(double num){
		if (num <= balance) {
			balance = balance - num;
		} else {
			System.out.println("You can't withdraw more than your account balance.");
		}
	}
	
	public void setBalance(double num){
		balance = num;
	}
	
	public double getBalance(){
		return balance;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public String toString(){
		String str1 = Double.toString(balance);
		return name + "'s account has " + str1 + ".";
	}

}
