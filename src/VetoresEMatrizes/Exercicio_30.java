package VetoresEMatrizes;

import java.util.Scanner;

public class Exercicio_30 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Quantos numeros serão ldios?");
		int num = sc.nextInt();

		int[][] digiteN = new int[num][num];

		int numerosNegativos = 0;

		for (int i = 0; i < num; i++) {
			for (int j = 0; j < num; j++) {
				System.out.println("Leia um munero:");
				digiteN[i][j] = sc.nextInt();
			}
		}

		for (int i = 0; i < num; i++) {
			for (int j = 0; j < num; j++) {
				if (digiteN[i][j] < 0) {
					numerosNegativos++;
				}
			}
		}
		System.out.println("Diagonal ");
		for (int i = 0; i < num; i++) {
			for (int j = 0; j < num; j++) {
				if (digiteN[i][i] == digiteN[j][j]) {
					System.out.println(digiteN[i][j]);
				}
			}
		}

		System.out.println("Números negativos: " + numerosNegativos);

		sc.close();
	}

}
