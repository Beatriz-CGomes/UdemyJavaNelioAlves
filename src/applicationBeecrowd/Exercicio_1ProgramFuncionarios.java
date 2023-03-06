package applicationBeecrowd;

import java.util.Scanner;

import entitiesBeecrowd.Exercicio_1Funcionarios;

public class Exercicio_1ProgramFuncionarios {

	public static void main(String[] args) {
		// ABELHA 1008 Resolvendo exercico com metados

		Scanner sc = new Scanner(System.in);

		Exercicio_1Funcionarios exf = new Exercicio_1Funcionarios();

		System.out.println("\tDADOS DO FUNCIONÁRIO: ");
		System.out.println("Entre com a Matricula :");
		exf.matricula = sc.nextInt();

		System.out.println("Entre com as horas trabalhadas: ");
		exf.horasTrabalhadas = sc.nextDouble();

		System.out.println("Entre com as horas pagas: ");
		exf.horasPagas = sc.nextDouble();

		System.out.println("Folha de pagamento :");
		System.out.println(exf);

		sc.close();
	}

}
