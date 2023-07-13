package apostilaJavaUm;

import java.util.Scanner;

public class Exercicio6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		double C;

		System.out.println("A: ");
		double A = sc.nextDouble();

		System.out.println("B: ");
		double B = sc.nextDouble();

		C = A;
		A = B;
		B = C;

		System.out.println("A: " + A);
		System.out.println("B: " + B);

	}

}
