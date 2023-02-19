package EstrturaCondicional;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
// Fazer um programa para ler um número inteiro e dizer se este número é par ou ímpa

		Scanner sc = new Scanner(System.in);

		int num;
		System.out.println("Entre com um numero");
		num = sc.nextInt();
		if (num % 2 != 0) {
			System.out.println("Numero impar ");
		} else {
			System.out.println("Numero par ");
		}

		sc.close();
	}

}
