package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.TaxPayer;
import entities.TaxPayerCompany;
import entities.TaxPayerIndividual;

public class ProgramTaxPayer {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		List<TaxPayer> list = new ArrayList<>();

		System.out.println("Enter the number of tax payers:");
		int num = sc.nextInt();

		for (int i = 1; i <= num; i++) {
			System.out.println("Tax payer #" + i + " data: ");
			System.out.print("Individual or company (i/c) ? ");
			char decisao = sc.next().charAt(0);

			if (decisao == 'i') {
				System.out.println("Name: ");
				sc.nextLine();
				String name = sc.nextLine();

				System.out.println("Anual income: ");
				double anuallncome = sc.nextDouble();

				System.out.println("Health expenditure: ");
				double heathExpenditures = sc.nextDouble();

				list.add(new TaxPayerIndividual(name, anuallncome, heathExpenditures));

			} else {
				System.out.println("Name: ");
				sc.nextLine();
				String name = sc.nextLine();

				System.out.println("Anual income: ");
				double anuallncome = sc.nextDouble();

				System.out.println("Number of employees: ");
				int numberOfEmployees = sc.nextInt();

				list.add(new TaxPayerCompany(name, anuallncome, numberOfEmployees));
			}
		}

		System.out.println();
		System.out.println("TAXES PAID: ");
		for (TaxPayer tax : list) {
			System.out.println(tax.getName() + " R$ " + String.format("%.2f", tax.tax()));
		}

		System.out.println();

		double sum = 0.0;
		for (TaxPayer tax : list) {
			sum += tax.tax();
		}

		System.out.println("TOTAL TAXES: ");
		for (TaxPayer tax : list) {
			System.out.println(String.format("%.2f", sum));
		}

		sc.close();
	}

}
