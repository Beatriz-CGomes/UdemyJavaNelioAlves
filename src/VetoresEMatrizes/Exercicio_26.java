package VetoresEMatrizes;

import java.util.Scanner;

public class Exercicio_26 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Quantas pessoas voce vai digitar?");
		int n = sc.nextInt();

		String[] nome = new String[n];
		int[] idade = new int[n];

		int idadeMaior = idade[0], posicaoMaior = 0;

		for (int i = 0; i < n; i++) {
			System.out.println("Dados da " + (i+1) + " pessoa");
			System.out.print("Nome: ");
			nome[i] = sc.next();

			sc.nextLine();
			System.out.println("Idade: ");
			idade[i] = sc.nextInt();
		}

		for (int i = 0; i < n; i++) {
			if (idade[i] > idadeMaior) {
				idadeMaior = idade[i];
				posicaoMaior = i;
			}
		}

		System.out.println("PESSOA MAIS VELHA: " + nome[posicaoMaior]);

		sc.close();
	}

}
