package edu.exeter.cs;

import java.util.Scanner;

public class Bank {

	public static void main(String[] args) {
		
		Account acct1, acct2;
		Scanner scan = new Scanner(System.in);
		System.out.println("What would you like to name your first account?");
		String string1 = scan.nextLine();
		System.out.println("How much would you like to deposit?");
		String string2 = scan.nextLine();
		double amount1 = Double.parseDouble(string2);
		acct1 = new Account(string1, amount1);
		System.out.println("What would you like to name your second account?");
		String string3 = scan.nextLine();
		System.out.println("How much would you like to deposit?");
		String string4 = scan.nextLine();
		double amount2 = Double.parseDouble(string4);
		acct2 = new Account(string3, amount2);
		System.out.println(acct1);
		System.out.println(acct2);
		scan.close();
		
	}
	
	public static void Transfer(Account giver, Account receiver, double amount) {
		giver.Withdraw(amount);
		receiver.Deposit(amount);
	}

}
