package beecrowd;

import java.util.Scanner;

public class Exercicio_10 {

	public static void main(String[] args) {
		// ABELHA 1080

		Scanner sc = new Scanner(System.in);

		System.out.println("Quantos numeros serao lidos? ");
		int numeros = sc.nextInt();

		double[] tabelas = new double[numeros];
		int posicao = 0;
		double maior = 0;

		for (int i = 0; i < tabelas.length; i++) {
			System.out.println("Entre com valores para tabela: " + (i + 1));
			tabelas[i] = sc.nextDouble();
		}

		for (int i = 0; i < tabelas.length; i++) {
			if (tabelas[i] > maior) {
				maior = tabelas[i];
				posicao = i;
			}

		}

		System.out.println(maior);
		System.out.println(posicao);

		sc.close();

	}

}
