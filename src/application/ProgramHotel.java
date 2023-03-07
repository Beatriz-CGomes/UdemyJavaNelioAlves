package application;

import java.util.Scanner;

import entities.Hotel;

public class ProgramHotel {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Quantos quartos serão alugados? ");
		int numero = sc.nextInt();

		Hotel[] quartos = new Hotel[numero];

		for (int i = 1; i <= numero; i++) {
			System.out.println("Alugados # " + i + ": ");
			System.out.println("Name: ");
			sc.nextLine();
			String nome = sc.nextLine();

			System.out.println("Email: ");
			String email = sc.next();

			System.out.println("Room: ");
			int numQuarto = sc.nextInt();

			quartos[numQuarto] = new Hotel(nome, email);
		}

		System.out.println();
		System.out.println("Quartos Ocupados: ");
		for (int i = 0; i < 10; i++) {
			if (quartos[i] != null) {
				System.out.println(i + " : " + quartos[i]);
			}
		}
		sc.close();

	}

}
