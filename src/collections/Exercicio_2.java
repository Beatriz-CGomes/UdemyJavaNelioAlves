package collections;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercicio_2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> salary = new ArrayList<>();

		int op;
		int soma = 0, bonus = 0, salario = 0;
		do {
			System.out.println("-------------------------");
			System.out.println("1 - Cadastrar Matricula ");
			System.out.println("2 - Cadastrar Salario ");
			System.out.println("3 - Cadastrar Bônus: ");
			System.out.println("4 - Listar dados do funcionário ");
			System.out.println("5 - Sair ");
			System.out.println("** Entre com a opção desejada **");
			System.out.println("-------------------------");
			op = sc.nextInt();

			switch (op) {
			case 1:
				System.out.println("Cadastro da Matricula: ");
				int matricula = sc.nextInt();
				salary.add(matricula);
				break;

			case 2:
				System.out.println("Cadastrar salario: ");
				salario = sc.nextInt();
				salary.add(salario);
				break;

			case 3:
				System.out.println("Cadastra a porcentagem de bonus");
				bonus = sc.nextInt();
				salary.add(bonus);

			case 4:
				sc.nextLine();
				System.out.println("Dados do Funcionário: ");
				System.out.println(salary);
				System.out.println("Salário Atualizado " + soma);
				soma = salario * bonus / 100 + salario;
				break;

			case 5:
				sc.nextLine();
				System.out.println("Obrigado por utilizar nosso sistema");
				sc.close();
				System.exit(0);
				break;

			default:
				System.out.println("Opção Invalida");
				break;
			}

		} while (op != 5);

	}

}
