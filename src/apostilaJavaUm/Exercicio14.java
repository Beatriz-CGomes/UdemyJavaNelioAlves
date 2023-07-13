package apostilaJavaUm;

import java.util.Scanner;

public class Exercicio14 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Valor de A: ");
		int a = sc.nextInt();
		System.out.println("Valor de B: ");
		int b = sc.nextInt();

		if (a > b) {
			System.out.println("Valor de A é Maior");
		} else {
			System.out.println("Valor de B é Maior");
		}
		sc.close();
	}

}
