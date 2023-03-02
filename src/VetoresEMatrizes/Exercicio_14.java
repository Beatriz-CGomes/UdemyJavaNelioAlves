package VetoresEMatrizes;

import java.util.Scanner;

public class Exercicio_14 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Quantos alunos serão digitados? ");
		int numero = sc.nextInt();

		String[] nome = new String[numero];
		double[] nota1 = new double[numero];
		double[] nota2 = new double[numero];

		for (int i = 0; i < nota1.length; i++) {
			System.out.println("Dados do aluno " + i);
			System.out.print("Nome: ");
			nome[i] = sc.next();

			System.out.println("Nota 1: ");
			nota1[i] = sc.nextDouble();

			System.out.println("Nota 2: ");
			nota2[i] = sc.nextDouble();

		}

		double somaNotas;
		int posicao = 0;
		
		for (int i = 0; i < numero; i++) {
			somaNotas = (nota1[i] + nota2[i]) / 2;
			posicao = i;
			if (somaNotas >= 6.0) {
				System.out.println("Alunos Aprovados " + nome[posicao]);
			}
		}

		sc.close();
	}

}
