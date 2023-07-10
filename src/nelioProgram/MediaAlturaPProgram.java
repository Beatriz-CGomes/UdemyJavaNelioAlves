package nelioProgram;

import java.util.Scanner;

import nelioEntites.MediaAlturaP;

public class MediaAlturaPProgram {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Quantas pessoas serao digitadas?");
		int n = sc.nextInt();

		MediaAlturaP[] mediaP = new MediaAlturaP[n];

		for (int i = 0; i < mediaP.length; i++) {
			System.out.printf("Dados da  " + (i + 1) + " pessoa\n");
			System.out.print("Nome: ");
			String nome = sc.next();

			System.out.println("Idade: ");
			int idade = sc.nextInt();

			System.out.println("Altura: ");
			double altura = sc.nextDouble();

			mediaP[i] = new MediaAlturaP(nome, idade, altura);
		}

		double media = 0, alturaTotal = 0, soma = 0, idadeMenor = 0;

		// altura media
		for (int i = 0; i < mediaP.length; i++) {
			soma += mediaP[i].getAltura();
			alturaTotal++;
		}

		media = soma / alturaTotal;
		System.out.printf("Altura média: %.2f ", media);

		// pessoas com menos de 16 anos e sua porcentagem
		for (int i = 0; i < mediaP.length; i++) {
			if (mediaP[i].getIdade() < 16) {
				idadeMenor++;
				soma = (idadeMenor * 100) / n;
			}
		}

		System.out.println("Porentagem " + soma);

		for (int i = 0; i < mediaP.length; i++) {
			if (mediaP[i].getIdade() < 16) {
				System.out.println(mediaP[i].getNome());
			}
		}

		sc.close();

	}

}
