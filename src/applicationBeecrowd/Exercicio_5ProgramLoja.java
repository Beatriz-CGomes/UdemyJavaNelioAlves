package applicationBeecrowd;

import java.util.Scanner;

import entitiesBeecrowd.Exercicio_5Loja;

public class Exercicio_5ProgramLoja {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		Exercicio_5Loja loja;

		System.out.println("\tREGRISTRO DE COMPRA: ");

		System.out.println("Entra com nome do cliente: ");
		String nome = sc.nextLine();

		System.out.println("Entra com valor total da compra: ");
		double compra = sc.nextDouble();

		System.out.println("Cliente levou nosso planos ao finalizar a compra? ");
		char respo = sc.next().charAt(0);

		if (respo == 'y') {
			System.out.println("Entre com valor do plano contratado: ");
			double compraExtra = sc.nextDouble();
			loja = new Exercicio_5Loja(nome, compra, compraExtra);
			loja.compraExtra();

		} else {
			loja = new Exercicio_5Loja(nome, compra);
		}

		System.out.println();
		System.out.println("Dados da compra: ");
		System.out.println(loja);

		sc.close();

	}

}
