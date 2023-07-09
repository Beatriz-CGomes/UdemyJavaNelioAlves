package VetoresEMatrizes;

import java.util.Scanner;

public class Exercicio_28 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Quantas pessoas serao digitadas?");
		int n = sc.nextInt();

		double[] altura = new double[n];
		char[] genero = new char[n];

		double menorAltura = altura[0], maiorAltura = altura[0], nHomens = 0, nMulheres = 0, alturaTotalFeminina = 0;

		for (int i = 0; i < altura.length; i++) {
			System.out.println("Altura " + (i + 1) + " pessoa");
			altura[i] = sc.nextDouble();

			System.out.println("Genero " + (i + 1) + " pessoa");
			genero[i] = sc.next().charAt(0);
		}

		// Maior e menor altura
		for (int i = 0; i < altura.length; i++) {
			if (altura[i] > maiorAltura) {
				maiorAltura = altura[i];
			}

		}
		for (int i = 0; i < altura.length; i++) {
			if (altura[i] < menorAltura) {
				menorAltura = altura[i];
			}
		}

		// Media altura feminina e quantidade de homens 
		for (int i = 0; i < altura.length; i++) {
			if (genero[i] == 'F' || genero[i] == 'f') {
				nMulheres++;
				alturaTotalFeminina += altura[i];
			} else {
				nHomens++;
			}
		}

		alturaTotalFeminina /= nMulheres;

		System.out.println("Menor altura = " + menorAltura);
		System.out.println("Maior altura = " + maiorAltura);
		System.out.printf("Media das alturas das mulheres = %.2f\n", alturaTotalFeminina);
		System.out.println("Número de Homens  =" + nHomens);

		sc.close();

	}

}
