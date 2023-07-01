package ApostilaJavaUm;

import java.util.Scanner;

public class Exercicio25 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Valor de A:");
		double A = sc.nextDouble();

		System.out.println("Valor de B:");
		double B = sc.nextDouble();

		if(A != B && A > B) {
			System.out.println("São Diferente é a A é maior do que B ");
		} else if (A == B) {
			System.out.println("São iguais");
		} else {
			System.out.println("São Diferente é a B é maior do que A ");
		}
		
		sc.close();
	}

}
