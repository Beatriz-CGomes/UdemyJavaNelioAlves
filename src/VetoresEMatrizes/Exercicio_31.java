package VetoresEMatrizes;

import java.util.Scanner;

public class Exercicio_31 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("M: ");
		int m = sc.nextInt();

		System.out.println("N: ");
		int n = sc.nextInt();

		int[][] numeros = new int[m][n];

		for (int i = 0; i < numeros.length; i++) {
			for (int j = 0; j < numeros.length; j++) {
				System.out.println("Número de Linhas: " + (i + 1));
				numeros[i][j] = sc.nextInt();
			}
		}

		System.out.println("X: ");
		int x = sc.nextInt();

		for (int i = 0; i < numeros.length; i++) {
			for (int j = 0; j < numeros.length; j++) {
				if (numeros[i][j] == x) {
					System.out.println("Posição " + i + "," + j + ":");
				}
				if (j > 0) {
					System.out.println("Esquerda: " + numeros[i][j - 1]);
				}
				if (j < numeros[i].length - 1) {
					System.out.println("Direita: " + numeros[i][j + 1]);
				}
				if (i < numeros.length - 1) {
					System.out.println("Baixo: " + numeros[i + 1][j]);
				}
				if (i > 0) {
					System.out.println("Em cima: " + numeros[i - 1][j]);
				}

			}
		}

		sc.close();

	}

}
