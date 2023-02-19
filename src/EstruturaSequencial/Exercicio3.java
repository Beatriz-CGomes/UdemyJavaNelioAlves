package EstruturaSequencial;

import java.util.Scanner;

public class Exercicio3 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
// Fazer um programa para ler quatro valores inteiros A, B, C e D. A seguir, calcule e mostre a diferença 
//do produto de A e B pelo produto de C e D segundo a fórmula: DIFERENCA = (A * B - C * D).

		Scanner sc = new Scanner(System.in);
		int A, B, C, D, soma;

		System.out.println("Entre com valor para A ");
		A = sc.nextInt();

		System.out.println("Entre com valor para B ");
		B = sc.nextInt();

		System.out.println("Entre com valor para C ");
		C = sc.nextInt();

		System.out.println("Entre com valor para D");
		D = sc.nextInt();

		soma = (A * B) - (C * D);

		System.out.println("A diferença: " + soma);

		sc.close();

	}

}