package ApostilaJavaUm;

import java.util.Scanner;

public class Exercicio17 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int dentro = 0, fora = 0;

		for (int i = 0; i < 5; i++) {
			System.out.println("Digite o numero da " + (i + 1) + " posição ");
			int numeros = sc.nextInt();

			if (numeros >= 3 && numeros <= 5) {
				dentro++;
			} else {
				fora++;
			}

		}

		System.out.println("Foram entrados " + dentro + " nuemros dentro do intervalo de 3 a 5");
		System.out.println("Foram entrados " + fora + " numeros fora do intervalo de 3 a 5");

		sc.close();
	}

}
