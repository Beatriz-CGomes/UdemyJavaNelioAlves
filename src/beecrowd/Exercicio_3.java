package beecrowd;

import java.util.Scanner;

public class Exercicio_3 {

	public static void main(String[] args) {
		// ABELHA 1007 Resolvendo esse problema com vetor

		Scanner sc = new Scanner(System.in);

		float[] A = new float[4];
		float[] B = new float[4];
		float[] C = new float[4];
		float[] D = new float[4];
		float[] DIFERENCA = new float[4];

		for (int i = 0; i < 1; i++) {

			System.out.println("Ente com valor de A:");
			A[i] = sc.nextFloat();

			System.out.println("Entre com valor de B: ");
			B[i] = sc.nextFloat();

			System.out.println("Entre com valor de C: ");
			C[i] = sc.nextFloat();

			System.out.println("Entre com valor de D: ");
			D[i] = sc.nextFloat();
		}

		for (int i = 0; i < 1; i++) {
			DIFERENCA[i] = (A[i] + B[i]) + ((C[i] + D[i]));
			System.out.println(DIFERENCA[i]);
		}

		sc.close();

	}

}
