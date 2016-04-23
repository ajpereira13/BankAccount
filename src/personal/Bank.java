package personal;

import java.util.LinkedList;
import java.util.Scanner;

public class Bank {
	static LinkedList<Account> bank = new LinkedList<Account>();
	public Bank(int toGen) {
		for(int i = 0; i < toGen; i++) {
			bank.add(new Account(i, Math.round(Math.random()*10000)));
		}
	}
	
	public void transfer(double value, int from, int to) {
		if (value >= bank.size()) {
			System.out.println("Not a valid account no.!");
		}
		else {
		Account one = null, two = null;
		for(Account a : bank) {
			if(a.getIndex() == from) {
				one = a;
			}
			else if (a.getIndex() == to) {
				two = a;
			}
		}
	
		if (one.getBalance() >= value) {
			one.withdraw(value);
			two.deposit(value);
			System.out.println("Account no. " + one.getIndex() + " has " + one.getBalance() + ".");
			System.out.println("Account no. " + two.getIndex() + " has " + two.getBalance() + ".");
		}
		else {
			System.out.println("Account no. " + one.getIndex() + " has " + one.getBalance() + ". Insufficient funds.");
		}
		}
	}
	
	public void checkbal(int acct) {
		
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("How many accounts to generate?");
		Bank b = new Bank(scan.nextInt());
		boolean contin = true;
		
		while (contin) {
			System.out.println("TRANSFER / CHECKBAL / QUIT");
			String input = scan.nextLine();
		
			if (input.equalsIgnoreCase("transfer")) {
				System.out.println("From which account no.?");
				int i = scan.nextInt();
				System.out.println("Into which account no.?");
				int j = scan.nextInt();
				System.out.println("How much to transfer?");
				b.transfer(scan.nextDouble(), i, j);
			}
			else if (input.equalsIgnoreCase("checkbal")) {
				System.out.println("Which account no.");
				int i = scan.nextInt();
				Account one = null;
				for (Account a : bank) {
					if (a.getIndex() == i) {
						one = a;
					}
				}
				System.out.println(one.getBalance());
				
			}
			else if (input.equalsIgnoreCase("quit")) {
				contin = false;
			}
			else {
				System.out.println("BAD INPUT.");
			}
		}
		scan.close();
	}
}

