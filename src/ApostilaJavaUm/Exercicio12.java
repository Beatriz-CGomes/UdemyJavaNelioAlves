package ApostilaJavaUm;

import java.util.Scanner;

public class Exercicio12 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		double imposto = 0.45;
		double distribuidor = 0.28;
		double valorFinal, valorImposto = 0;

		System.out.println("Valor de Fabrica: ");
		double custoFabrica = sc.nextDouble();

		valorImposto = (custoFabrica * imposto) + custoFabrica;
		valorFinal = (valorImposto * distribuidor) + valorImposto;

		System.out.println("Valor da Fabrica: " + custoFabrica);
		System.out.println("Valor Final " + valorFinal);

	}

}
