package edu.exeter.cs;

public class Account {
	
	private double balance;
	
	public Account(){
		balance = 0;
	}
	
	public void setAcct(double num){
		balance = num;
	}
	
	public void deposit(double num){
		balance = balance + num;
	}
	
	public void withdraw(double num){
		balance = balance - num;
	}
	
	public double getBalance(){
		return balance;
	}

}
