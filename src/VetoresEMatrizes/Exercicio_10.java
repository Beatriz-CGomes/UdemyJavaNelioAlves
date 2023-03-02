package VetoresEMatrizes;

import java.util.Scanner;

public class Exercicio_10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("How many elements will it have?  ");
		int numeros = sc.nextInt();

		double[] elementos = new double[numeros];

		for (int a = 0; a < elementos.length; a++) {
			System.out.println("Enter with a number");
			elementos[a] = sc.nextDouble();
		}

		for (int a = 0; a < elementos.length; a++) {
			if (elementos[a] <= 12.125) {
				System.out.println("Elementos abaixo da média: " + elementos[a]);
			}
		}
		sc.close();

	}

}
