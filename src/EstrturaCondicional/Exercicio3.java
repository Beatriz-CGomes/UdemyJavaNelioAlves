package EstrturaCondicional;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//Leia 2 valores inteiros (A e B). Após, o programa deve mostrar uma mensagem "Sao Multiplos" ou "Nao sao 
// Multiplos", indicando se os valores lidos são múltiplos entre si. Atenção: os números devem poder ser
// digitados em ordem crescente ou decrescente.

		Scanner sc = new Scanner(System.in);

		int A, B;

		System.out.println("Entre com valor para  A: ");
		A = sc.nextInt();

		System.out.println("Entre com valor para B: ");
		B = sc.nextInt();
		if(A % B == 0 || B % A == 0) {
			System.out.println("São Multiplos");
		} else {
			System.out.println("Não São Multiplos");
		}

		sc.close();
	}

}
