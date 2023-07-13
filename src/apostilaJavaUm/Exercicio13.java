package apostilaJavaUm;

import java.util.Scanner;

public class Exercicio13 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Entra com um numero: ");
		int numero = sc.nextInt();

		if (numero > 10) {
			System.out.println("Numero digitado é maior que 10");
		} else {
			System.out.println("Numero digitado é menor que 10");
		}

		sc.close();

	}

}
