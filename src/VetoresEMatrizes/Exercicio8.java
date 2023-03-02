package VetoresEMatrizes;

import java.util.Scanner;

public class Exercicio8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Quantos números você vai digitar: ");
		int n = sc.nextInt();

		int[] vetor = new int[n];

		for (int i = 0; i < vetor.length; i++) {
			System.out.println("Entre com um número: ");
			vetor[i] = sc.nextInt();
		}

		int maior = vetor[0];
		int posicao = 0;

		for (int i = 0; i < vetor.length; i++) {
			if (vetor[i] > maior) {
				maior = vetor[i];
				posicao = i;

			}
		}

		System.out.println("Maior valor =  " + maior);
		System.out.println("Posição: " + posicao);
		sc.close();

	}

}
