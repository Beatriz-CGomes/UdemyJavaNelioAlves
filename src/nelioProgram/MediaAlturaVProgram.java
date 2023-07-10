package nelioProgram;

import java.util.Scanner;

import nelioEntites.MediaAlturaV;

public class MediaAlturaVProgram {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Quantos alunos serao digitados?");
		int n = sc.nextInt();

		MediaAlturaV[] meAltura = new MediaAlturaV[n];

		for (int i = 0; i < meAltura.length; i++) {
			System.out.println("Altura " + (i + 1) + " pessoa");
			double altura = sc.nextDouble();

			System.out.println("Genero " + (i + 1) + " pessoa");
			char genero = sc.next().charAt(0);

			meAltura[i] = new MediaAlturaV(altura, genero);
		}

		// calculando

		double nHomens = 0, nMulheres = 0, alturaTotalMulheres = 0, maiorAltura, menorAltura;

		maiorAltura = 0;
		menorAltura = 0;

		// calculando a maior e menor altura
		for (int i = 0; i < meAltura.length; i++) {
			if (meAltura[i].getAltura() > maiorAltura) {
				maiorAltura = meAltura[i].getAltura();
			}
		}

		for (int i = 0; i < meAltura.length; i++) {
			if (meAltura[i].getAltura() < menorAltura) {
				menorAltura = meAltura[i].getAltura();

			}
		}

		// calculando mulheres e homens
		for (int i = 0; i < meAltura.length; i++) {
			if (meAltura[i].getGenero() == 'F' || meAltura[i].getGenero() == 'f') {
				nMulheres++;
				alturaTotalMulheres += meAltura[i].getAltura();
			} else {
				nHomens++;
			}
		}

		alturaTotalMulheres /= nMulheres;
		System.out.println("Menor altura = " + menorAltura);
		System.out.println("Maior altura = " + maiorAltura);
		System.out.printf("Media das alturas das mulheres = %.2f\n ", alturaTotalMulheres);
		System.out.println("Número de Homens  = " + nHomens);

		sc.close();
	}

}
