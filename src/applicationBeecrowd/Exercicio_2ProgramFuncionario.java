package applicationBeecrowd;

import java.util.Scanner;

import entitiesBeecrowd.Exercicio_2Funcionario;

public class Exercicio_2ProgramFuncionario {

	public static void main(String[] args) {
		// ABELHA 1009 Respendendo com metados
		Scanner sc = new Scanner(System.in);

		Exercicio_2Funcionario fun = new Exercicio_2Funcionario();

		System.out.println("---TABELA DO FUNCIONÁRIO---");
		System.out.println("Nome do funcionário : ");
		fun.nome = sc.nextLine();

		System.out.println("Salário do funcionario: ");
		fun.salario = sc.nextDouble();

		System.out.println("Vendas do mês: ");
		fun.vendaMes = sc.nextDouble();

		System.out.println("Fechamento da folha: ");
		System.out.println(fun);
		sc.close();

	}

}
