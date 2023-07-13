package classesAbstratas;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AccountProgram {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		List<Account> list = new ArrayList<>();
		
		list.add(new AccountSaving(1001, "Alex", 500.0, 0.01));
		list.add(new AccountBussiness(1002, "Bob", 1000.0, 400.0));
		list.add(new AccountSaving(1003, "Maria", 300.0, 0.01));
		list.add(new AccountBussiness(1004, "José", 500.0, 500.0));
		
		double soma = 0, soma2 = 0;
		for(Account c : list) {
			soma += c.getBalance();
		}
		
		System.out.println(soma);
		
		for(Account c : list) {
			 c.deposit(10);
		}
		
		for(Account c : list) {
		//	System.out.println(c.getBalance());
			System.out.println(c.deposit(10));
		}
		
	
	
		System.out.println();
	}

}
