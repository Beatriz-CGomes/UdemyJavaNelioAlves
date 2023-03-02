package application;

import java.util.Scanner;

import entities.Stock;

public class ProgramStock {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Entre com a quantidade de produtos para cadastrar no estoque: ");
		int n = sc.nextInt();
		Stock[] stock = new Stock[n];

		for (int i = 0; i < stock.length; i++) {

			System.out.println("Entre com o nome do produto: ");
			String name = sc.next();

			System.out.print("Entre com valor do produto: ");
			double price = sc.nextDouble();
			stock[i] = new Stock(name, price);
		}

		double sum = 0;
		for (int i = 0; i < stock.length; i++) {
			sum += stock[i].getPrice();
		}

		double media = sum / n;

		System.out.println("A Média dos produtos: " + media);

		sc.close();
	}

}
