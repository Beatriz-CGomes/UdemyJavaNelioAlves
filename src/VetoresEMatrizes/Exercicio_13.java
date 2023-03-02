package VetoresEMatrizes;

import java.util.Scanner;

public class Exercicio_13 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Quantas pessoas você vai digitar? ");
		int numero = sc.nextInt();

		String[] nomes = new String[numero];
		int[] idades = new int[numero];

		for (int i = 0; i < numero; i++) {
			System.out.println("Dados da " + i + " ° pessoa");
			System.out.println("Nome: ");
			nomes[i] = sc.next();

			System.out.println("Idade: ");
			idades[i] = sc.nextInt();
		}

		int maior = 0, posicao = 0;
		for (int i = 0; i < numero; i++) {
			if (idades[i] > maior) {
				maior = idades[i];
				posicao = i;
			}
		}

		System.out.println("Pessoa mais velha " + nomes[posicao]);
		System.out.println(maior + " anos ");

		sc.close();

	}

}
