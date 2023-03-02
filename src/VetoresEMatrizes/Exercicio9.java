package VetoresEMatrizes;

import java.util.Scanner;

public class Exercicio9 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Quantos valores vai ter cada vetor? ");
		int numero = sc.nextInt();

		int[] A = new int[numero];
		int[] B = new int[numero];
		int[] C = new int[numero];

		for (int i = 0; i < A.length; i++) {
			System.out.println("Digite os valores do vetor A: ");
			A[i] = sc.nextInt();
		}

		for (int i = 0; i < B.length; i++) {
			System.out.println("Digite os valores do vetor B: ");
			B[i] = sc.nextInt();
		}

		for (int i = 0; i < C.length; i++) {
			C[i] = A[i] + B[i];
			System.out.println("Vetor Resultante: " + C[i]);
		}

		sc.close();

	}

}
