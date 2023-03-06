package application;

import java.util.Scanner;

import entities.Employee;

public class ProgramEmployee {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		Employee em = new Employee();

		System.out.println("Name: ");
		em.name = sc.nextLine();

		System.out.println("Gross Salary: ");
		em.grossSalary = sc.nextDouble();

		System.out.println("Tax: ");
		em.tax = sc.nextDouble();

		System.out.println("Employee: " + em);
		System.out.println();

		
		System.out.println("Which percentage to increase salary? ");
		double percentage = sc.nextDouble();
		em.increaseSalary(percentage);

		System.out.println();
		System.out.println("Updated data: " + em);

		sc.close();

	}

}
