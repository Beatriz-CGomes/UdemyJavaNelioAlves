package VetoresEMatrizes;

import java.util.Scanner;

public class Exercicio_17 {

	public static void main(String[] args) {
		// Criando algo por conta própria para testar meus conhecimentos
		Scanner sc = new Scanner(System.in);

		System.out.println("Quantas pessoas irão ajudar na vaquinha ");
		int numF = sc.nextInt();

		System.out.println("Quantidade de meses que vai contribuir ?  ");
		int numFB = sc.nextInt();

		float[][] valoresContri = new float[numF][numFB];
		float[] somaContri = new float[numFB];
		String[] nomesContri = new String[numF];

		System.out.println("Dados dos funcionários ");

		for (int i = 0; i < numF; i++) {

			System.out.println("Nome do contribuinte : ");
			sc.next();
			nomesContri[i] = sc.nextLine();

			for (int j = 0; j < numFB; j++) {
				System.out.println("Entre com o valor " + (j + 1) + " do mês: ");
				valoresContri[i][j] = sc.nextFloat();
			}
		}

//		System.out.println("A soma do valor dos contribuintes : ");

		for (int i = 0; i < numF; i++) {
			for (int j = 0; j < numFB; j++) {
				somaContri[i] += valoresContri[i][j];
			}
			System.out.println(nomesContri[i] + " : " + somaContri[i]);

			if (somaContri[i] == 3.500) {
				System.out.println("Batemos a meta da vaquina");
				System.out.println("--------------------------------------");
			}
			if (somaContri[i] <= 1.750 && somaContri[i] > 3.499) {
				System.out.println("Estamos na metado do valor pretendido");
				System.out.println("--------------------------------------");
			} else {
				System.out.println("Não vamos conseguir atingir a meta estabelecida ");
				System.out.println("-----------------------------------------------");
			}

		}

		sc.close();
	}

}
