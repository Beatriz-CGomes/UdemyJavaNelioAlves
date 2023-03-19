package application;

import java.util.Scanner;

import model.entities.Bank;
import model.exceptions.BankDomainException;

public class ProgramBank {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		try {
		System.out.println("Enter account data");
		System.out.println("Number: ");
		int number = sc.nextInt();
		
		System.out.println("Holder: ");
		sc.nextLine();
		String holder = sc.nextLine();
		
		System.out.println("Initial balance: ");
		double balance = sc.nextDouble();
		
		
		System.out.println("Withdaw limit: ");
		double withdrawLimit = sc.nextDouble();
		
		Bank bank = new Bank(number, holder, balance, withdrawLimit);
		
		System.out.println();
		System.out.println("Enter amount for withdraw:");
		double withdraw = sc.nextDouble();
		bank.withdraw(withdraw);
		
		System.out.println("New balance: " + bank.getBalance());
		
		
		
		} catch (BankDomainException e) {
			System.out.println("Withdraw error: " + e.getMessage());
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		sc.close();

	}

}
