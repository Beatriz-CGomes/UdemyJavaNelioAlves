package ApostilaJavaUm;

import java.util.Scanner;

public class Exercicio22 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		double totalCusto = 0, totalVenda = 0;

		System.out.println("Quantos produtos vc deseja verificar?");
		int numeroP = sc.nextInt();

		double[] custo = new double[numeroP];
		double[] valorVenda = new double[numeroP];

		for (int i = 0; i < numeroP; i++) {
			System.out.println("Entra com Valor de Custo: " + (i + 1) + " produto ");
			custo[i] = sc.nextDouble();

			System.out.println("Entra com Valor de Venda: " + (i + 1) + " produto ");
			valorVenda[i] = sc.nextDouble();

			if (custo[i] > valorVenda[i]) {
				System.out.println("************************");
				System.out.println("Houve um prejuízo");
				System.out.println("Seu valor de custo é: " + custo[i]);
				System.out.println("Seu valor de venda é: " + valorVenda[i]);
				System.out.println("************************");
			} else if (custo[i] == valorVenda[i]) {
				System.out.println("Houve um empate");
				System.out.println("Seu valor de custo é: " + custo[i]);
				System.out.println("Seu valor de venda é: " + valorVenda[i]);
				System.out.println("************************");
			} else {
				System.out.println("Houve um Lucro");
				System.out.println("Seu valor de custo é: " + custo[i]);
				System.out.println("Seu valor de venda é: " + valorVenda[i]);
			}

		}

		//laço de repetição para soma o valor do custo
		for (int i = 0; i < custo.length; i++) {
			totalCusto += custo[i];

		}

		//laço de repetição para soma o valor da venda
		for (int i = 0; i < valorVenda.length; i++) {
			totalVenda += valorVenda[i];
		}

		totalCusto = totalCusto / numeroP;
		totalVenda = totalVenda / numeroP;

		System.out.println("**************************************");
		System.out.println("A Media de custo foi: " + totalCusto);
		System.out.println("A Media de venda foi: " + totalVenda);
		sc.close();
	}

}
