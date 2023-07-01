package ApostilaJavaUm;

import java.util.Scanner;

public class Exercicio20 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double somaF = 0, somaD = 0, totalCarrosDoisMil = 0, totalGeral = 0;
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
				totalCarrosDoisMil++;
				totalGeral++;
				break;

			case 2:
				somaD = valorCarro * 0.07;
				somaF = somaD - valorCarro;
				totalGeral++;
				break;

			default:
				System.out.println("Opção Invalida");
				break;
			}

			System.out.println("Deseja continuar calculado? 'S' - SIM / 'N' - NÃO");
			resp = sc.next().charAt(0);
		} while (resp == 'S' || resp == 's');
		sc.close();
		System.out.printf("O valor do desconto: %.2f %n", somaD, " valor a ser pago: ", somaF);
		System.out.println("Total de carros vendidos: " + totalGeral);
		System.out.println("Total de carro de Até 2000: " + totalCarrosDoisMil);

	}

}
