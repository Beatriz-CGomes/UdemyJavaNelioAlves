package ApostilaJavaUm;

import java.util.Scanner;

public class Exercicio18 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int maiorIdade = 0, menorIdade = 0;

		for (int i = 0; i < 5; i++) {
			System.out.println("Digite as idades: ");
			int idade = sc.nextInt();

			if (idade >= 18) {
				System.out.println("Você é MAIOR DE IDADE!");
				maiorIdade++;
			} else {
				System.out.println("Você é MENOR DE IDADE!");
				menorIdade++;
			}
		}

		System.out.println("Total de MAIOR de idade " + maiorIdade);
		System.out.println("Total de MENOR de idade " + menorIdade);
		sc.close();
	}

}
