package nelioProgram;

import java.util.Scanner;

import nelioEntites.ProdutosEstoques;

public class ProdutosEstoqueProgram {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Quantos produtos serão cadastrados: ");
		int nP = sc.nextInt();

		ProdutosEstoques[] produtos = new ProdutosEstoques[nP];

		for (int i = 0; i < produtos.length; i++) {
			sc.nextLine();
			System.out.println("Nome: ");
			String name = sc.nextLine();

			System.out.println("Preço: ");
			double price = sc.nextDouble();

			produtos[i] = new ProdutosEstoques(name, price);
		}

		double soma = 0;
		for (int i = 0; i < produtos.length; i++) {
			soma += produtos[i].getPrice() / nP;
		}

		System.out.println("Preco Médio: " + soma);
		sc.close();
	}

}
