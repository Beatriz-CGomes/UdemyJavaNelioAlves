package VetoresEMatrizes;

import java.util.Scanner;

public class Exercicio_24 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int media = 0, soma = 0, numerosPares = 0;

		System.out.println("Quantos numeros voce vai digitar?");
		int n = sc.nextInt();

		int[] numeros = new int[n];

		for (int i = 0; i < numeros.length; i++) {
			System.out.println("Digite um numero:");
			numeros[i] = sc.nextInt();
		}

		for (int i = 0; i < numeros.length; i++) {
			if (numeros[i] % 2 == 0) {
				soma += numeros[i];
				numerosPares++;
			}
		}

		if (numerosPares == 0) {
			System.out.println("NENHUM NUMERO PAR");
		} else {
			media = soma / numerosPares;
			System.out.println("MEDIA DOS NUMEROS PARES: " + media);

		}

		sc.close();

	}

}
