package apostilaJavaUm;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		double distancia;
		double combustivel;
		double consumoMedio;

		System.out.println("Distância: ");
		distancia = sc.nextDouble();

		System.out.println("Combustivel: ");
		combustivel = sc.nextDouble();

		consumoMedio = combustivel / distancia;

		System.out.println("Valor gasto por quilometors " + consumoMedio);

		sc.close();
	}
}
