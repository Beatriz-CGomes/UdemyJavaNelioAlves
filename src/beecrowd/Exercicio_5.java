package beecrowd;

import java.util.Scanner;

public class Exercicio_5 {

	public static void main(String[] args) {
		// ABELHA 1010 Respondendo com vetor
		Scanner sc = new Scanner(System.in);

		System.out.println("Quantos produtos serão comprados? ");
		int n = sc.nextInt();

		int[] codigo = new int[n];
		int[] quantidade = new int[n];
		double[] valor = new double[n];

		double[] valorTotal = new double[n];
		double soma = 0;

		for (int i = 0; i < n; i++) {
			System.out.println("Entre com código do produto " + (i + 1) + " : ");
			codigo[i] = sc.nextInt();

			System.out.println("Entre com a quantidade do produto  " + (i + 1) + " : ");
			quantidade[i] = sc.nextInt();

			System.out.println("Entre com valor do produto " + (i + 1) + " : ");
			valor[i] = sc.nextDouble();

		}

		for (int i = 0; i < n; i++) {

			valorTotal[i] = (valor[i] * quantidade[i]);
			soma += valorTotal[i];

		}

		System.out.println("VALOR A PAGAR: " + soma);
		sc.close();

	}

}
