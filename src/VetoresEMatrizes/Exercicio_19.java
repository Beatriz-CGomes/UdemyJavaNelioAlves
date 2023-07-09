package VetoresEMatrizes;

import java.util.Scanner;

public class Exercicio_19 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		double soma = 0;
		System.out.println("N: ");
		int n = sc.nextInt();

		double[] lista = new double[n];

		for (int i = 0; i < lista.length; i++) {
			System.out.println("Digite " + (i + 1));
			lista[i] = sc.nextDouble();
		}

		for (int i = 0; i < lista.length; i++) {
			soma += lista[i] / n;
		}

		System.out.println(soma);

		sc.close();

	}
}
