package VetoresEMatrizes;

import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Linha: ");
		int linha = sc.nextInt();

		System.out.println("Coluna: ");
		int coluna = sc.nextInt();

		double[][] posicao = new double[linha][coluna];

		for (int a = 0; a < posicao.length; a++) {
			for (int b = 0; b < posicao[a].length; b++) {
				posicao[a][b] = sc.nextDouble();
			}
		}

		System.out.println("Digite um número qualquer: ");
		int numero = sc.nextInt();

		for (int a = 0; a < posicao.length; a++) {
			for (int b = 0; b < posicao[a].length; b++) {
				if (posicao[a][b] == numero) {
					System.out.println("Posição " + a + " , " + b + ": ");
				}
				if (b > 0) {
					System.out.println("Esquerda: " + posicao[a][b - 1]);
				}
				if (a > 0) {
					System.out.println("Em cima: " + posicao[a - 1][b]);
				}
				if (b < posicao[a].length - 1) {
					System.out.println("Direita: " + posicao[a][b + 1]);
				}
				if (a < posicao.length - 1) {
					System.out.println("Embaixo: " + posicao[a + 1][b]);

				}
			}
		}
		sc.close();

	}

}
