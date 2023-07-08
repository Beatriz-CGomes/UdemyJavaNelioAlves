package ApostilaJavaUm;

import java.util.Scanner;

public class Exercicio33 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		double soma = 0, somaF = 0;

		System.out.println("Insira o nome do professor: ");
		String nome = sc.next();
		sc.nextLine();

		System.out.println("Quantidade de aulas dadas na semana: ");
		int aulasD = sc.nextInt();

		System.out.println("Quantidade de dias trabalhados no mês: ");
		int diasT = sc.nextInt();

		System.out.println("/tTABELA DE PAGAMENTO DOS PROFESSORES: ");
		System.out.println(" 1 - NIVEL 1 - R$ 12,00 por houra/aula");
		System.out.println(" 2 - NIVEL 2 - R$ 17,00 por houra/aula");
		System.out.println(" 3 - NIVEL 3 - R$ 25,00 por houra/aula");
		System.out.println();
		System.out.println("Entre com a opção desejada: ");
		int op = sc.nextInt();

		switch (op) {
		case 1:
			soma = aulasD * 12.00;
			somaF = diasT * soma;
			System.out.println("Salário Nível 1 Semanal: " + soma);
			System.out.println(nome +  " Salário Mensal: " + somaF);
			break;

		case 2:
			soma = aulasD * 17.00;
			somaF = diasT * soma;
			System.out.println("Salário Nível 2 Semanal: " + soma);
			System.out.println(nome +  " Salário Mensal: " + somaF);
			break;

		case 3:
			soma = aulasD * 25.00;
			somaF = diasT * soma;
			System.out.println("Salário Nível 3 Semanal: " + soma);
			System.out.println(nome +  " Salário Mensal: " + somaF);
			break;

		default:
			System.out.println("Erro!!");
			break;
		}

		sc.close();
	}

}
