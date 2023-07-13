package apostilaJavaUm;

import java.util.Scanner;

public class Exercicio26 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Entre com valor ");
		int n = sc.nextInt();

		switch (n) {
		case 1:
			System.out.println("Um");
			break;

		case 2:
			System.out.println("Dois");
			break;

		case 3:
			System.out.println("Três");
			break;

		case 4:
			System.out.println("Quatro");
			break;

		case 5:
			System.out.println("Cinco");
			break;

		default:
			System.out.println("Número Invalido!");
			break;
		}

		// outra solução
		if (n >= 1 && n <= 5) {
			System.out.println("De 1 a 5");
		} else {
			System.out.println("Número Invalido!");
		}

		sc.close();
	}

}
