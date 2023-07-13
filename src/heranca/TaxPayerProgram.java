package heranca;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TaxPayerProgram {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the number of tax payers:");
		int n = sc.nextInt();

		List<TaxPayer> list = new ArrayList<>();

		for (int i = 0; i < n; i++) {
			System.out.print("Tax payer # " + (i + 1) + " data:");
			System.out.print("Individual or company (i/c)?");
			char resp = sc.next().charAt(0);

			System.out.println("Name: ");
			sc.nextLine();
			String name = sc.nextLine();

			System.out.println("Anual income:");
			double anuallncome = sc.nextDouble();

			if (resp == 'i' || resp == 'I') {

				System.out.println("Health expenditures:");
				double healthExpenditures = sc.nextDouble();

				list.add(new TIndividual(name, anuallncome, healthExpenditures));
			} else {

				System.out.println("Number of employees:");
				int numberOfEmployees = sc.nextInt();

				list.add(new TCompany(name, anuallncome, numberOfEmployees));

			}
		}

		System.out.println();
		System.out.println("TAXES PAID: ");
		for (TaxPayer tax : list) {
			System.out.println(tax.getName() + ": R$ " + String.format("%.2f", tax.tax()));
		}
		System.out.println();
		double sum = 0;
		for (TaxPayer tax : list) {
			sum = +tax.tax();
			System.out.println("TOTAL TAXES: " + String.format("%.2f", sum));
		}

		sc.close();

	}

}
