package ApostilaJavaUm;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Valor 1: ");
		double a = sc.nextDouble();

		System.out.println("Valor 2: ");
		double b = sc.nextDouble();

		double soma = 0;
		soma = a + b;

		System.out.println("O resultado da soma é: " + soma);
		sc.close();

	}

}
