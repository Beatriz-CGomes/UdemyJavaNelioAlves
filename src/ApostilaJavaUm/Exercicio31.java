package ApostilaJavaUm;

import java.util.Scanner;

public class Exercicio31 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		double Soma = 0;
		
		System.out.println("A: ");
		double A = sc.nextDouble();

		System.out.println("B: ");
		double B = sc.nextDouble();

		System.out.println("C: ");
		char C = sc.next().charAt(0);

		switch (C) {
		case '+':
			Soma = A + B;
			System.out.println(Soma);
			break;

		case '-':
			Soma = A - B;
			System.out.println(Soma);
			break;

		case '*':
			Soma = A * B;
			System.out.println(Soma);
			break;

		case '/':
			Soma = A / B;
			System.out.println(Soma);
			break;

		default:
			System.out.println("Operador indefinido!");
			break;
		}

		sc.close();

	}

}
