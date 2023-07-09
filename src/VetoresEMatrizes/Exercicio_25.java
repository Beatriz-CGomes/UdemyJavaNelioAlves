package VetoresEMatrizes;

import java.util.Scanner;

public class Exercicio_25 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Quantos valores vai ter cada vetor? ");
		int n = sc.nextInt();

		int[] A = new int[n];
		int[] B = new int[n];
		int[] C = new int[n];

		System.out.println("Valores de A: ");
		for (int i = 0; i < A.length; i++) {
			A[i] = sc.nextInt();
		}

		System.out.println("Valores de B: ");
		for (int i = 0; i < B.length; i++) {
			B[i] = sc.nextInt();
		}

		
		for (int i = 0; i < C.length; i++) {
			C[i] = A[i] + B[i];
		}
		
		System.out.println("VETOR RESULTANTE: ");
		for (int i = 0; i < C.length; i++) {
			System.out.println(C[i]);
		}
		

		sc.close();

	}

}
