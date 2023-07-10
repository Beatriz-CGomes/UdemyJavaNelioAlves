package VetoresEMatrizes;

import java.util.Scanner;

public class Exercicio_29 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		double media = 0, alturaTotal = 0, soma = 0, idadeMenor = 0, totalIdades = 0;

		System.out.println("Quantas pessoas serao digitadas?");
		int n = sc.nextInt();

		String[] nome = new String[n];
		int[] idade = new int[n];
		double[] altura = new double[n];

		for (int i = 0; i < nome.length; i++) {
			System.out.printf("Dados da  " + (i + 1) + " pessoa\n");
			System.out.print("Nome: ");
			nome[i] = sc.next();

			System.out.println("Idade: ");
			idade[i] = sc.nextInt();

			System.out.println("Altura: ");
			altura[i] = sc.nextDouble();

		}

		// altura media
		for (int i = 0; i < nome.length; i++) {
			soma += altura[i];
			alturaTotal++;
		}

		media = soma / alturaTotal;
		System.out.printf("Altura média: %.2f ", media);

		// total de idades
		for (int i = 0; i < nome.length; i++) {
			totalIdades++;
		}

		// pessoas com menos de 16 anos e sua porcentagem
		for (int i = 0; i < nome.length; i++) {
			if (idade[i] < 16) {
				idadeMenor++;
				soma = (idadeMenor * 100) / totalIdades;
			}
		}

		System.out.println("Porentagem " + soma);

		for (int i = 0; i < nome.length; i++) {
			if (idade[i] < 16) {
				System.out.println(nome[i]);
			}
		}

		sc.close();
	}

}
