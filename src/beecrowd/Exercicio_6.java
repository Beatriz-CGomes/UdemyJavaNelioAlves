package beecrowd;

import java.util.Scanner;

public class Exercicio_6 {

	public static void main(String[] args) {
		// ABELHA 1017 - beecrowd
		
		Scanner sc = new Scanner(System.in);

		int tempo, velocidade;
		int velocidadeMedia;
		double litros = 1;
		double KL = 12 * litros;
		double valor;

		System.out.println("Entre com tempo percorrido: ");
		tempo = sc.nextInt();

		System.out.println("Entre com a velocidade percorrida: ");
		velocidade = sc.nextInt();

		velocidadeMedia = tempo * velocidade;

		valor = (velocidadeMedia * tempo / KL);

		System.out.printf("%.3f", valor);
		sc.close();

	}

}
