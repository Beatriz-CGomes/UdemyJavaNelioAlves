package VetoresEMatrizes;

import java.util.Scanner;

public class Exercicio_27 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Quantos alunos serao digitados?");
		int n = sc.nextInt();

		String[] nome = new String[n];
		double[] nota1 = new double[n];
		double[] nota2 = new double[n];

		for (int i = 0; i < n; i++) {
			System.out.println("Dados do aluno " + (i + 1));
			sc.nextLine();
			System.out.print("Nome: ");
			nome[i] = sc.nextLine();

			System.out.print("Nota 1: ");
			nota1[i] = sc.nextDouble();

			System.out.print("Nota 2: ");
			nota2[i] = sc.nextDouble();

		}

		System.out.println("Alunos aprovados: ");
		double soma = 0, media = 0;
		for (int i = 0; i < nota2.length; i++) {
			soma = nota1[i] + nota2[i];
			media = soma / 2;

			if (media >= 6) {
				System.out.println(nome[i]);
			}
		}
		sc.close();

	}

}
