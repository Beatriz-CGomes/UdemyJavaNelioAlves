package VetoresEMatrizes;

import java.util.Scanner;

public class Exercicio_21 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int soma = 0, media = 0;
		System.out.println("Quantos numeros voce vai digitar? ");
		int n = sc.nextInt();

		int[] numeros = new int[n];

		for (int i = 0; i < numeros.length; i++) {
			System.out.println("Digite um numero: ");
			numeros[i] = sc.nextInt();
		}

		System.out.println("Valores: ");
		for (int i = 0; i < numeros.length; i++) {
			System.out.println(numeros[i]);
		}

		for (int i = 0; i < numeros.length; i++) {
			soma += numeros[i];
		}

		System.out.println("Soma = " + soma);

		media = soma / n;
		System.out.println("Média = " + media);

		sc.close();
	}

}
