package ApostilaJavaUm;

import java.util.Scanner;

public class Exercicio27 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double valorV, somaD = 0, somaTotal = 0;

		do {
			System.out.println("Entre com valor do veiculo");
			valorV = sc.nextDouble();

			if (valorV == 0) {
				System.out.println("Veiculo sem preço");
				sc.close();
				System.exit(0);
			} 
			
				System.out.println("\tTABELO DE PROMOÇÃo");
				System.out.println(" 1 - Alcool - 25 %");
				System.out.println(" 2 - Gasolina - 21 %");
				System.out.println(" 1 - Diesei - 14 %");
				System.out.println("Entre com a opção do seu combustivel");
				int op = sc.nextInt();

				switch (op) {
				case 1:
					System.out.println("Alcool");
					somaD = valorV * 0.25;
					somaTotal = valorV - somaD;
					break;

				case 2:
					System.out.println("Gasolina");
					somaD = valorV * 0.21;
					somaTotal = valorV - somaD;
					break;

				case 3:
					System.out.println("Diesel");
					somaD = valorV * 0.14;
					somaTotal = valorV - somaD;
					break;

				default:
					System.out.println("Opção Invalida!");
					break;
				}

			
		} while (valorV != 0);

		System.out.println("Valor do Desconto: " + somaD);
		System.out.println("Valor a ser pago: " + somaTotal);

	}

}
