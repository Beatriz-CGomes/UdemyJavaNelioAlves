package EstruturaSequencial;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Faça um programa para ler dois valores inteiros, e depois mostrar na tela a
		// soma desses números com uma
		// mensagem explicativa, conforme exemplos.

		Scanner sc = new Scanner(System.in);

		int n1, n2, soma;

		System.out.println("ENTRA COM UM NUMERO");
		n1 = sc.nextInt();

		System.out.println("ENTRA COM OUTRO NUMERO");
		n2 = sc.nextInt();

		soma = n1 + n2;

		System.out.println("A soma dos dois numeros " + soma);
		sc.close();
	}

}
