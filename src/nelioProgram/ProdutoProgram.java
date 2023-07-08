package nelioProgram;

import java.util.Scanner;

import nelioEntites.Produto;

public class ProdutoProgram {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Produto p = new Produto();

		System.out.println("Entre com dados do produto: ");
		System.out.println("Nome: ");
		p.nome = sc.nextLine();

		System.out.println("Preço: ");
		p.preco = sc.nextDouble();

		System.out.println("Quantidade: ");
		p.quantidade = sc.nextInt();

		System.out.println("Produto: " + p);
		System.out.println();

		System.out.println("Entre com o numero de produtos para add no estoque");
		System.out.println("Adicionar quantidade: ");
		int quantidade = sc.nextInt();
		p.addProduto(quantidade);

		System.out.println("Update: " + p);

		System.out.println();
		System.out.println("Entre com o numero de produtos para remove no estoque");
		System.out.println("remover quantidade: ");
		quantidade = sc.nextInt();
		p.removerProduto(quantidade);

		System.out.println("Update: " + p);

		sc.close();

	}

}
