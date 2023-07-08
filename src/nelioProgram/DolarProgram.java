package nelioProgram;

import java.util.Scanner;

import util.utilDolar;

public class DolarProgram {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Qual é o valor dolar: ");
		double dolar = sc.nextDouble();

		System.out.println("Quantos dinheiro será comprado? ");
		double dolarComprado = sc.nextDouble();

		System.out.println("Total em dolares sem IOF:  " + utilDolar.dolares(dolar, dolarComprado));
		System.out.println("Total em dolares com IOF:  " + utilDolar.dolaresTotal());

	}

}
