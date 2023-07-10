package nelioProgram;

import java.util.Scanner;

import nelioEntites.QuartosHoteis;

public class QuartosHoteisProgram {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Quantoas pessoas serão registradas? ");
		int n = sc.nextInt();

		QuartosHoteis[] quartos = new QuartosHoteis[10];

		for (int i = 0; i < n; i++) {
			System.out.println("Rent # " + (i + 1));
			sc.nextLine();
			System.out.print("Nome: \n");

			String nome = sc.nextLine();

			System.out.println("Email: ");
			String email = sc.nextLine();

			System.out.print("Quarto: ");
			int numeroQuarto = sc.nextInt();

			quartos[numeroQuarto] = new QuartosHoteis(nome, email);

		}

		System.out.println();
		System.out.println("Quartos Ocupados: ");
		for (int i = 1; i < quartos.length; i++) {
			if (quartos[i] != null) {
				System.out.println(i + ":" + quartos[i]);
			}
		}

		sc.close();

	}

}
