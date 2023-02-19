package EstruturaRepeticaoWhile;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Escreva um programa para ler as coordenadas (X,Y) de uma quantidade
		// indeterminada de pontos no sistema
		// cartesiano. Para cada ponto escrever o quadrante a que ele pertence. O
		// algoritmo será encerrado quando
		// pelo menos uma de duas coordenadas for NULA (nesta situação sem escrever
		// mensagem alguma.

		Scanner sc = new Scanner(System.in);

		float X, Y;
		System.out.println("Entre com valor para X: ");
		X = sc.nextFloat();

		System.out.println("Entre com valor para Y: ");
		Y = sc.nextFloat();

		while (X != 0 && Y != 0) {
			if (X > 0 && Y > 0) {
				System.out.println("Primeiro");
			} else if (X < 0 && Y > 0) {
				System.out.println("Segundo");
			} else if (X < 0 && Y < 0) {
				System.out.println("Terceiro");
			} else {
				System.out.println("Quarto");
			}

			System.out.println("Entre com valor para X: ");
			X = sc.nextFloat();

			System.out.println("Entre com valor para Y: ");
			Y = sc.nextFloat();
		}
		sc.close();
	}

}
