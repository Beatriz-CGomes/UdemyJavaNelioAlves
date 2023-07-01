package caelum;

import java.util.Scanner;

public class Exercicio0 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int S = 0, N = 0, NS = 0;

		System.out.println("Quantas pessoas serão entrevistadas?");
		int qtEn = sc.nextInt();

		for (int i = 0; i < qtEn; i++) {
			System.out.println("Você gosta de Futebol? 'S' - SIM / 'N' - NÃO");
			char respostas = sc.next().charAt(0);

			switch (respostas) {
			case 'S':
				S++;
				break;
			case 'N':
				N++;
				break;
			default:
				System.out.println("Opção Invalida!");
				NS++;
				break;
			}

		}

		System.out.println("Total das que gostam " + S);
		System.out.println("Total das que não gostam " + N);
		System.out.println("Total das que não souberam responder " + NS);

	}

}
