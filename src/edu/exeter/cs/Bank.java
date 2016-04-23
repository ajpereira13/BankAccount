package edu.exeter.cs;

public class Bank {

	public static void main(String[] args) {
		
		Account acct1 = new Account();
		Account acct2 = new Account();
		acct1.Deposit(500.26);
		acct2.Deposit(23.54);
		Transfer(acct1, acct2, 300.06);
		System.out.println(acct1);
		System.out.println(acct2);
		
	}
	
	public static void Transfer(Account giver, Account receiver, double amount) {
		giver.Withdraw(amount);
		receiver.Deposit(amount);
	}

}
