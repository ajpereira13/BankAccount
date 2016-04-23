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
	
	public void Deposit(double num){
		balance = balance + num;
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

	public int getAcctNumber(){
		return acctNumberInd;
	}
	
	public String toString(){
		String result = Double.toString(balance);
		return result;
	}

}
