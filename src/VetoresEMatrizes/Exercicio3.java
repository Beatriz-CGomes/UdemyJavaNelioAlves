package VetoresEMatrizes;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Entre com a quantidade do tamanho da sua linha/coluna");
		int n = sc.nextInt();

		int[][] mat = new int[n][n];

		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++) {
				System.out.println("Digite o valor para Linha e Coluna");
				mat[i][j] = sc.nextInt();
			}
		}
		System.out.println("Diaonal: ");
		for (int i = 0; i < mat.length; i++) {
			System.out.println(mat[i][i]);
		}

		System.out.println();
		int contador = 0;
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++) {
				if (mat[i][j] < 0) {
					contador += 1;

				}

			}

		}
		System.out.println("Total Negativos: " + contador );
		sc.close();
	}

}
