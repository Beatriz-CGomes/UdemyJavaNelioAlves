package VetoresEMatrizes;

import java.util.Scanner;

public class Exercicio_15 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Quantas pessoas serão digitadas? ");
		int numero = sc.nextInt();

		double maior = 0, menor = 0, mediaMulher = 0, mediaMulherAltura = 0;
		int F = 0, M = 0;

		double[] altura = new double[numero];
		char[] genero = new char[numero];

		for (int i = 0; i < numero; i++) {

			System.out.println("Altura da pessoa " + i);
			altura[i] = sc.nextDouble();

			System.out.println("Genero da pessoa " + i + "(F/M)");
			genero[i] = sc.next().charAt(0);
		}

		maior = altura[0];
		menor = altura[0];

		// Maior
		for (int i = 0; i < numero; i++) {
			if (altura[i] > maior) {
				maior = altura[i];
			}
		}

		// Menor
		for (int i = 0; i < numero; i++) {
			if (altura[i] < menor) {
				menor = altura[i];
			}
		}
		// Media Altura Mulher

		for (int i = 0; i < numero; i++) {
			if (genero[i] == 'F') {
				F++;
				mediaMulher = mediaMulher + altura[i];
			}
		}

		mediaMulherAltura = mediaMulher / F;

		// Quantidade de homens
		for (int i = 0; i < numero; i++) {
			if (genero[i] == 'M') {
				M++;
			}

		}

		System.out.println("Menor altura: " + menor);
		System.out.println("Maior altura: " + maior);
		System.out.println("Média Altura mulher " + mediaMulherAltura);
		System.out.println("Número de Homens: " + M);

		sc.close();
	}

}
