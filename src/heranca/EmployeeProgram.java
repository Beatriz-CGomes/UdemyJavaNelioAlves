package heranca;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmployeeProgram {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the number of employees:");
		int n = sc.nextInt();

		List<Employee> list = new ArrayList<>();

		for (int i = 0; i < n; i++) {
			System.out.println("Employee # " + i + 1 + " data: ");
			System.out.print("Outsourced (y/n)?");
			char resp = sc.next().charAt(0);

			sc.nextLine();
			System.out.print("Name: ");
			String name = sc.nextLine();

			System.out.print("Hours: ");
			int hours = sc.nextInt();

			System.out.print("Value per hour: ");
			double valueperhour = sc.nextDouble();

			if (resp == 'y' || resp == 'Y') {
				System.out.print("Additional Charge: ");
				double additionalCharge = sc.nextDouble();
				list.add(new EmployeeOutsource(name, hours, valueperhour, additionalCharge));
			} else {
				list.add(new Employee(name, hours, valueperhour));
			}

			System.out.println();
			System.out.println("Payments: ");
			for (Employee emp : list) {
				System.out.println(emp);
				System.out.println(emp.getName() + " - R$: " + emp.payment());
			}
		}

		sc.close();

	}

}
