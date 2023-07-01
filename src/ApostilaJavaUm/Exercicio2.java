package ApostilaJavaUm;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Valor 1: ");
		double a = sc.nextDouble();

		System.out.println("Valor 2: ");
		double b = sc.nextDouble();

		double soma, somaS, somaM, somaD = 0;

		soma = a + b;
		somaS = a - b;
		somaM = a * b;
		somaD = a / b;

		System.out.println("O resultado da soma é: " + soma);
		System.out.println("O resultado da subtração é: " + somaS);
		System.out.println("O resultado da multiplioação é: " + somaM);
		System.out.println("O resultado da divisão é: " + somaD);
		sc.close();
	}

}
