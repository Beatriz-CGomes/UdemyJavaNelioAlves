package VetoresEMatrizes;

import java.util.Scanner;

public class Exercicio6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int soma = 0, media;

		System.out.println(" Quantos numeros voce vai digitar? ");
		int numero = sc.nextInt();

		int[] valores = new int[numero];
		for (int i = 0; i < valores.length; i++) {
			System.out.println("Digite um numero: ");
			valores[i] = sc.nextInt();
		}

		// Imprimindo os valores
		for (int i = 0; i < valores.length; i++) {
			System.out.println("Valores = " + valores[i]);
		}

		// soma
		for (int i = 0; i < valores.length; i++) {
			soma += valores[i];
		}

		System.out.println("Soma: " + soma);

		// mrdia
		media = soma / numero;

		System.out.println("Media: " + media);
		sc.close();

	}

}
