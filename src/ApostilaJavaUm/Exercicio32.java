package ApostilaJavaUm;

import java.util.Scanner;

public class Exercicio32 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("A: ");
		int A = sc.nextInt();

		System.out.println("B: ");
		int B = sc.nextInt();

		System.out.println("C: ");
		int C = sc.nextInt();

		if (A == B && A == C) {
			System.out.println("Equilátero");
		} else if (A == B || A == C || B == C) {
			System.out.println("Isósceles");
		} else if (A + B > C && A + C > B && B + C > A) {
			System.out.println("Triangulo");
		} else {
			System.out.println("Escaleno ");
		}

		sc.close();

	}

}
