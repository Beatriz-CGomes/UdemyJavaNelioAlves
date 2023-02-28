package application;

import java.util.Scanner;

import entities.Product;

public class ProgramProduct {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		Product product = new Product();

		System.out.println("Enter product data: ");
		System.out.print("Name: ");
		product.name = sc.nextLine();

		System.out.print("Price");
		product.price = sc.nextDouble();

		System.out.print("Quantity in stock");
		product.quantity = sc.nextInt();

		product.toString();

		System.out.println();
		System.out.println("Product data: " + product);
		System.out.println();

		System.out.println("Enter the number of products to be added in stock: ");
		int quantity = sc.nextInt();
		product.addProdutcts(quantity);

		System.out.println();
		System.out.println("Update data: " + product);
		System.out.println();

		System.out.println("Enter the number of products to be removed from stock: ");
		int quantidade = sc.nextInt();
		product.removeProducts(quantidade);

		System.out.println();
		System.out.println("Update data: " + product);

		sc.close();
	}

}
