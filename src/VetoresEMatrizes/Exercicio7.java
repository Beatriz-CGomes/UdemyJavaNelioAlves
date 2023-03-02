package VetoresEMatrizes;

import java.util.Scanner;

public class Exercicio7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println(" Quantos numeros voce vai digitar? ");
		int numeroP = sc.nextInt();

		int[] pares = new int[numeroP];
		for (int i = 0; i < pares.length; i++) {
			System.out.println("Digite um numero ");
			pares[i] = sc.nextInt();
		}

		int contador = 0;
		for (int i = 0; i < pares.length; i++) {
			if (pares[i] % 2 == 0) {
				System.out.println("Números pares " + pares[i]);
				contador += 1;
			}
		}

		System.out.println("Quantidade de pares " + contador);

		sc.close();

	}

}
