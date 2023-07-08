package nelioProgram;

import java.util.Scanner;

import nelioEntites.Funcionario;

public class FuncionariosProgram {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		Funcionario fun = new Funcionario();

		System.out.println("Nome: ");
		fun.nome = sc.nextLine();

		System.out.println("Salario: ");
		fun.salario = sc.nextDouble();

		System.out.println("taxa: ");
		fun.taxa = sc.nextDouble();

		System.out.println(fun);
		System.out.println();

		System.out.println("Qual a porcentagem do salario");
		double p = sc.nextDouble();
		fun.aumentarSalario(p);
		System.out.println("Update "  + fun);

		sc.close();
	}

}
