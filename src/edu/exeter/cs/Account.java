package edu.exeter.cs;

public class Account {
	
	private double balance;
	private static int acctNumber = 0;
	private int acctNumberInd = 0;
	
	public Account(){
		balance = 0;
		acctNumber++;
		acctNumberInd = acctNumber;
	}
	
	public void setBalance(double num){
		balance = num;
	}
	
	public double getBalance(){
		return balance;
	}
	
	public void deposit(double num){
		balance = balance + num;
	}
	
	public void withdraw(double num){
		balance = balance - num;
	}

	public int getAcctNumber() {
		return acctNumberInd;
	}

	public void setAcctNumber(int acctNumberInd) {
		this.acctNumberInd = acctNumberInd;
	}

}
