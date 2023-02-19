package EstrturaCondicional;

import java.util.Scanner;

public class Exercicio7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//Leia 2 valores com uma casa decimal (x e y), que devem representar as coordenadas 
// de um ponto em um plano. A seguir, determine qual o quadrante ao qual pertence o 
		// ponto, ou se está sobre um dos eixos cartesianos ou na origem (x = y = 0).
		// Se o ponto estiver na origem, escreva a mensagem “Origem”.

		Scanner sc = new Scanner(System.in);

		float x, y;
		System.out.println("Entre com valor para X: ");
		x = sc.nextFloat();

		System.out.println("Entre com valor para Y: ");
		y = sc.nextFloat();

		if (x == 0 && y == 0) {
			System.out.println("Origem ");
		} else if (x == 0) {
			System.out.println("Eixo Y");
		} else if (y == 0) {
			System.out.println("Eixo X ");
		} else if (x > 0 && y > 0) {
			System.out.println("Q1");
		} else if (x < 0 && y > 0) {
			System.out.println("Q2");
		} else if (x < 0 && y < 0) {
			System.out.println("Q3");
		} else {
			System.out.println("Q4");
		}
		sc.close();

	}

}
