package VetoresEMatrizes;

import java.util.Scanner;

public class Exercicio_11 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		double soma = 0, media = 0, pares = 0;

		System.out.println("Quantos elementos vai ter o vetor? ");
		int n = sc.nextInt();

		double[] vect = new double[n];
		for (int i = 0; i < vect.length; i++) {
			System.out.println("Digit eum numero: ");
			vect[i] = sc.nextDouble();
		}

		for (int i = 0; i < vect.length; i++) {
			if (vect[i] % 2 == 0) {
				soma += vect[i];
				pares += 1;
			}
		}

		if (pares != 0) {
			media = soma / pares;
			System.out.println("Média dos pares: " + media);
		} else {
			System.out.println("Nenhum númeroro par");
		}

		sc.close();

	}

}
