package application;


import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.Mercadoria;
import entities.MercadoriaImportada;
import entities.MercadoriaUsada;

public class ProgramMercadoria {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		List<Mercadoria> list = new ArrayList<>();
		Mercadoria mercadoria;

		System.out.println("Enter the number of products: ");
		int n = sc.nextInt();

		for (int i = 0; i < n; i++) {
			System.out.println("Product #" + (i + 1) + " data:");
			System.out.println("Commom, used or imported (c/u/i) ? ");
			char res = sc.next().charAt(0);

			System.out.println("Name: ");
			sc.nextLine();
			String name = sc.nextLine();

			System.out.println("Price: ");
			double price = sc.nextDouble();

			if (res == 'i') {
				System.out.println("Customs fee: ");
				double customFee = sc.nextDouble();

				mercadoria = new MercadoriaImportada(name, price, customFee);
				list.add(mercadoria);
			}

			if (res == 'c') {
				mercadoria = new Mercadoria(name, price);
				list.add(mercadoria);
			}

			if (res == 'u') {
				System.out.println("Manufacture date (DD/MM/YYYY): ");
				LocalDate date = LocalDate.parse(sc.next(), DateTimeFormatter.ofPattern("dd/MM/yyyy"));

				mercadoria = new MercadoriaUsada(name, price, date);
				list.add(mercadoria);

			}
		}

		System.out.println();
		System.out.println("PRICE TAGS: ");
		for(Mercadoria mercado : list) {
			System.out.println(mercado.priceTag());
		}
		
		sc.close();
	}

}
