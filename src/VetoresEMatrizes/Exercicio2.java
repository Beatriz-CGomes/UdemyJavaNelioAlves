package VetoresEMatrizes;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int quantidade;

		System.out.println("Entre com a quantidade:  ");
		quantidade = sc.nextInt();

		double[] somaEstoque = new double[quantidade];

		for (int i = 0; i < quantidade; i++) {
			System.out.println("Preço do produto: ");
			somaEstoque[i] = sc.nextDouble();
		}

		double soma = 0.0;
		for (int i = 0; i < somaEstoque.length; i++) {
			soma += somaEstoque[i];

		}

		double mediaEstoque = soma / quantidade;

		System.out.println("A média é: " + mediaEstoque);

		sc.close();
	}

}
