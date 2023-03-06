package beecrowd;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercicio_4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		ArrayList<Double> funcionarios = new ArrayList<>();

		System.out.println("\tTABELA DOS FUNCIONÁRIOS: ");

		System.out.println("Entre com a Matricula do funcionário: ");
		double matricula = sc.nextInt();
		funcionarios.add(matricula);

		System.out.println("Entre con as horas trabalhadas: ");
		double horasTra = sc.nextDouble();
		funcionarios.add(horasTra);

		System.out.println("Entre com valor pago por hora: ");
		double horaPa = sc.nextDouble();
		funcionarios.add(horaPa);
		
		
		

		sc.close();

	}

}
