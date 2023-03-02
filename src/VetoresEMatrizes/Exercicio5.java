package VetoresEMatrizes;

import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Quantos numeros voce vai digitar? ");
		int n = sc.nextInt();

		double[] vect = new double[n];

		for (int i = 0; i < vect.length; i++) {

			System.out.println("Digite um numero: ");
			vect[i] = sc.nextDouble();
		}

		int contador = 0;
		System.out.println("Números Negativos: ");

		for (int i = 0; i < vect.length; i++) {
			if (vect[i] < 0) {
				System.out.println(vect[i]);
				contador += 1;
			}
		}

		System.out.println("Total Negativos: " + contador);

		sc.close();

	}

}
