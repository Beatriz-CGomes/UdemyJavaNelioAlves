package ApostilaJavaUm;

import java.util.Scanner;

public class Exercicio10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Valor da compra: ");
		double valorCompra = sc.nextDouble();

		double p1 = valorCompra / 1;
		double p2 = valorCompra / 2;
		double p3 = valorCompra / 3;
		double p4 = valorCompra / 4;
		double p5 = valorCompra / 5;

		System.out.println("Valor em 1 prestação: " + p1);
		System.out.println("Valor em 2 prestações: " + p2);
		System.out.println("Valor em 3 prestações: " + p3);
		System.out.println("Valor em 4 prestações: " + p4);
		System.out.println("Valor em 5 prestações: " + p5);

	}

}
