package VetoresEMatrizes;

import java.util.Scanner;

public class Exercicio_22 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int numeroPares = 0;
		System.out.println("Quantos numeros voce vai digitar?");
		int n = sc.nextInt();

		int[] numeros = new int[n];

		for (int i = 0; i < numeros.length; i++) {
			System.out.println("Digite um numero:");
			numeros[i] = sc.nextInt();
		}

		System.out.println("NUMEROS PARES:");
		for (int i = 0; i < numeros.length; i++) {
			if (numeros[i] % 2 == 0) {
				System.out.println(numeros[i]);
				numeroPares++;
			}

		}

		System.out.println("Quantidade de pares: " + numeroPares);

		sc.close();
	}

}
