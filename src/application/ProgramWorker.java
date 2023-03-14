package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import entities.Worker;
import entities.WorkerDepartament;
import entities.WorkerHourContract;
import entities.enums.WorkerLevel;

public class ProgramWorker {

	public static void main(String[] args) throws ParseException {
// Ler os dados de um trabalhador com N contratos (N fornecido pelo usuário). Depois, solicitar do usuário um mês e mostrar qual foi o salário do funcionário nesse mês, conforme exemplo (próxima página).		

		Scanner sc = new Scanner(System.in);

		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

		System.out.print("Enter department's name:");
		String departamenteName = sc.nextLine();

		System.out.println("Enter worker data:");

		System.out.print("Name: ");
		String name = sc.nextLine();

		System.out.print("Level: ");
		String workerLevel = sc.nextLine();

		System.out.print("Base Salary: ");
		double baseSalary = sc.nextDouble();

		Worker worker = new Worker(name, WorkerLevel.valueOf(workerLevel), baseSalary,
				new WorkerDepartament(departamenteName));

		System.out.println("How many contracts to this worker? ");
		int n = sc.nextInt();

		for (int i = 0;  i < n; i++) {
			System.out.println("Enter contract  #" + (i + 1) + " data: ");
			System.out.print("Date (DD/MM/YYYY): ");
			Date contractDate = sdf.parse(sc.next());

			System.out.print("Value per hour:");
			double valuePerHour = sc.nextDouble();

			System.out.print("Duration (hours):");
			int hours = sc.nextInt();

			WorkerHourContract contract = new WorkerHourContract(contractDate, valuePerHour, hours);
			worker.addContract(contract);
		}

		System.out.println();
		System.out.print("Enter month and year to calculate income (MM/YYYY): ");
		String monthAndYear = sc.next();
		
		int month = Integer.parseInt(monthAndYear.substring(0, 2));
		int year = Integer.parseInt(monthAndYear.substring(3));
		
		System.out.println("Name: " + worker.getName());
		System.out.println("Departament: " + worker.getDepartament().getName());
		System.out.println("Income for: " + monthAndYear + " : " + String.format("%.2f", monthAndYear, worker.income(year, month)));
		
		sc.close();

	}

}
