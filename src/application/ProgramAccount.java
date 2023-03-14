package application;

import java.util.Scanner;

import entities.Account;

public class ProgramAccount {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		Account account;

		System.out.print("Enter account number: ");
		int number = sc.nextInt();
		
		
		System.out.print("Enter account holder: ");
		sc.nextLine();
		String holder = sc.nextLine();
		
		
		System.out.println("Is there na initial deposit (y/n)?: ");
		char response = sc.next().charAt(0);

		if (response == 'y') {
			System.out.println("Enter initial deposit value: ");
			double initialDeposit = sc.nextDouble();
			
			account = new Account(number, holder, initialDeposit); // sobrecarga
		} else {
			account = new Account(number, holder); // sobrecarga
		}

		System.out.println();
		System.out.println("Account data: ");
		System.out.println(account);

		System.out.println();
		System.out.print("Enter a deposit value: ");
		double depositValue = sc.nextDouble();
		account.deposit(depositValue);
		System.out.println("Updated account data: ");
		System.out.println(account);

		System.out.println();
		System.out.println("Enter a withdraw value: ");
		double withdrawValue = sc.nextDouble();
		account.withdraw(withdrawValue);
		System.out.println("Updated account data: ");
		System.out.println(account); 

		sc.close();

	}

}
