package apostilaJavaUm;

import java.util.Scanner;

public class Exercicio11 {

	public static void main(String[] args) {

		double precoNovo = 0;
		Scanner sc = new Scanner(System.in);

		System.out.println("Preco: ");
		double preco = sc.nextDouble();
		System.out.println("Porcetagem: ");
		double p = sc.nextDouble();

		precoNovo = (preco * p) + preco;

		System.out.println("Preco de venda: " + precoNovo);
		sc.close();
	}

}
