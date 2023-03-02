package VetoresEMatrizes;

import java.util.Scanner;

public class Exercicio_12 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Quantas pessoas serão digitadas? ");
		int nu = sc.nextInt();

		String[] nomes = new String[nu];
		int[] idades = new int[nu];
		double[] alturas = new double[nu];

		for (int i = 0; i < alturas.length; i++) {

			System.out.println("Dados da " + i + "º pessoa");
			System.out.println("Nome: ");
			nomes[i] = sc.next();

			System.out.println("Idade: ");
			idades[i] = sc.nextInt();

			System.out.println("Altura: ");
			alturas[i] = sc.nextDouble();
		}

		
		// Media altura
		double AlturaMedia = 0;
		for (int i = 0; i < alturas.length; i++) {
			AlturaMedia += alturas[i] / nu;
		}

		System.out.printf("Altura média: %.2f\n " + AlturaMedia);

		// idade e porcentagem
		
		double nuMenores = 0, porcentagem = 0;
		for (int i = 0; i < alturas.length; i++) {
			if (idades[i] < 16) {
				nuMenores++;
			}
		}
		porcentagem = (nuMenores / nu) * 100;
		
		System.out.println();
		System.out.println("Porcentagem de total menores " + porcentagem);
        System.out.println();
		
		//nomes
		for (int i = 0; i < idades.length; i++) {
			if (idades[i] < 16) {
				System.out.println("Pesoas menores de idade: " + nomes[i]);
			}
		}

		sc.close();

	}

}
