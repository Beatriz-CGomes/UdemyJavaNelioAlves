package EstruturaSequencial;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Faça um programa para ler o valor do raio de um círculo, e depois mostrar o
		// valor da área deste círculo
		// com quatro casas decimais conforme exemplos. Fórmula da área: area = π .
		// raio2 .Considere
		// o valor de π = 3.14159

		Scanner sc = new Scanner(System.in);

		double pi = 3.14159, area, r;

		System.out.println("Digite o valor do raio ");
		r = sc.nextDouble();

		area = pi * r * r;

		System.out.printf("A=%.4f%n", area);
		sc.close();

	}

}
