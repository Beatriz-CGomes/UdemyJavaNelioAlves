package tryCacth;

import java.util.Scanner;

public class FixacaoAccountProgram {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		FixacaoAccountEntites account = new FixacaoAccountEntites();
		
		try {
			System.out.println("Enter account data");
			System.out.print("Number:");
			int number = sc.nextInt();

			System.out.print("Holder: ");
			sc.nextLine();
			String holder = sc.nextLine();

			System.out.print("Initial balance:");
			double initialBalance = sc.nextDouble();

			System.out.print("Withdraw limit:");
			double withdrawLimit = sc.nextDouble();

			account = new FixacaoAccountEntites(number, holder, initialBalance, withdrawLimit);

			System.out.println();
			System.out.println("Enter amount for withdraw:");
			double withdraw = sc.nextDouble();
			account.withdraw(withdraw);

			System.out.println("New Balance: " + String.format("%.2f", account.getBalance()));

		} catch (NullPointerException e) {
			System.out.println(e.getMessage());
		} catch (FixacaoAccount_ExceptionPersonalizada e) {
			System.out.println(e.getMessage());
		} catch (RuntimeException e) {
			System.out.println("Unexpected error");
		}
		sc.close();

	}

}
