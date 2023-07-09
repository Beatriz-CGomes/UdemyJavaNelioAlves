package VetoresEMatrizes;

import java.util.Scanner;

public class Exercicio_20 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Quantos números vc vai digita: ");
		int n = sc.nextInt();

		int[] numeros = new int[n];

		for (int i = 0; i < numeros.length; i++) {
			System.out.println("Digite um numero : " + (i + 1));
			numeros[i] = sc.nextInt();
		}

		System.out.println("Números Negativos: ");
		for (int i = 0; i < numeros.length; i++) {
			if (numeros[i] < 0) {
				System.out.println(numeros[i]);
			}
		}

		sc.close();
	}

}
