package EstrturaCondicional;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		
//Fazer um programa para ler um número inteiro, e depois dizer se este número é negativo ou nã

		Scanner sc = new Scanner(System.in);

		int numero;
		System.out.println("Digite um numero");
		numero = sc.nextInt();
		if (numero < 0) {
			System.out.println("Numero negativo");
		} else {
			System.out.println("Numero positivo");
		}

		sc.close();
	}

}
