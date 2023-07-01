package ApostilaJavaUm;

import java.util.Scanner;

public class Exercicio35 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		double valorConta;
		
		System.out.println("Entre com a quantidade de KW/H:");
		double kwh = sc.nextDouble();

		System.out.println("\tTABELA DO CONSUMIDOR");
		System.out.println(" 1 A - RESIDENCIAÇ 0,60");
		System.out.println(" 2 B - COMERCIO 0,48");
		System.out.println(" 3 C - INDUSTRIA 1,29");
		System.out.println();
		System.out.println("Entre com a opção para calcular sua conta");
		int opcao = sc.nextInt();

		switch (opcao) {
		case 1:
			valorConta = kwh * 0.60;
			System.out.printf("Valor da sua conta de luz R$ %.2f%n" , valorConta , " REAIS ");
			break;

		case 2:
			valorConta = kwh * 0.48;
			System.out.printf("Valor da sua conta de luz R$ %.2f%n" , valorConta , " REAIS ");
			break;

		case 3:
			valorConta = kwh * 1.29;
			System.out.printf("Valor da sua conta de luz R$ %.2f%n" , valorConta , " REAIS ");
			break;

		default:
			System.out.println("Opção Inválida!");
			break;
		}

		sc.close();

	}

}
