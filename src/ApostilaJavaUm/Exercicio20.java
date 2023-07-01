package ApostilaJavaUm;

import java.util.Scanner;

public class Exercicio20 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double somaF = 0, somaD = 0;
		char resp;

		do {
			System.out.println("Entre com valor do carro: ");
			double valorCarro = sc.nextDouble();

			System.out.println("/tFERIÃO DE DESCONTO DE CARROS ");
			System.out.println("/desconto conforme o ano do carro");
			System.out.println(" 1 - Até 2000 - 12 %");
			System.out.println(" 2 - Acima 2000 - 7 %");
			System.out.println(" Entra com a opção que correspondem ao ano do seu carro");
			int opcao = sc.nextInt();

			switch (opcao) {
			case 1:
				somaD = valorCarro * 0.12;
				somaF = somaD - valorCarro;
				break;

			case 2:
				somaD = valorCarro * 0.07;
				somaF = somaD - valorCarro;

				break;

			default:
				System.out.println("Opção Invalida");
				break;
			}

			System.out.println("Deseja continuar calculado? 'S' - SIM / 'N' - NÃO");
			resp = sc.next().charAt(0);
		} while (resp == 'S');
		sc.close();
		System.out.println("O valor do desconto: " + somaD + " valor a ser pago: " + somaF);

	}

}
