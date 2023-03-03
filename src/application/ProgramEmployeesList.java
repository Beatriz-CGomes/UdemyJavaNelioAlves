package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.EmployeesList;

public class ProgramEmployeesList {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		List<EmployeesList> list = new ArrayList<>();

		System.out.println("How many employees will be registred? ");
		int num = sc.nextInt();

		for (int i = 0; i < num; i++) {
			System.out.println();
			System.out.println("Employees # " + (i + 1) + " : ");
			System.out.print("Id: ");
			Integer id = sc.nextInt();

			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();

			System.out.println("Salary: ");
			Double salary = sc.nextDouble();

			EmployeesList emp = new EmployeesList(id, name, salary);
			list.add(emp);

		}

		System.out.println();
		System.out.println("Enter the employee id that will have salary increase:");
		int id = sc.nextInt();
		EmployeesList emp = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
		if (emp == null) {
			System.out.println("This id doesn't exist! ");
		} else {
			System.out.println("Enter the percentage: ");
			double porce = sc.nextDouble();
			emp.increaseSalary(porce);
		}

		System.out.println("List of employees: ");
		for (EmployeesList obj : list) {
			System.out.println(obj);
		}

		sc.close();

	}

}
