package application;

import java.util.Scanner;

import util.UtilCurrencyConverter;

public class ProgramCurrencyConverter {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("What is the dollar price?: ");
		double dollar = sc.nextDouble();

		System.out.println(" How many dollars will be bought? ");
		double dollarBought = sc.nextDouble();

		double result = UtilCurrencyConverter.dollarToReal(dollar, dollarBought);
		System.out.println("Amount to be paid in reais = " + result);

		sc.close();

	}

}
