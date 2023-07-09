package VetoresEMatrizes;

import java.util.Scanner;

public class Exercicio_23 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Quantos numeros voce vai digitar?");
		int n = sc.nextInt();

		int[] numeros = new int[n];

		int maior = numeros[0], posicao = 0;

		for (int i = 0; i < numeros.length; i++) {
			System.out.println("Digite um numero:" + (i + 1));
			numeros[i] = sc.nextInt();
		}

		for (int i = 0; i < numeros.length; i++) {
			if (numeros[i] > maior) {
				maior = numeros[i];
				posicao = i;
			}
		}

		System.out.println("Maior valor: " + maior);
		System.out.println("Posicao do maior valor: " + posicao);
		sc.close();
	}

}
