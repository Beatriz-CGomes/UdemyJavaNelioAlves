package beecrowd;

import java.util.Scanner;

public class exercicio_12 {

	public static void main(String[] args) {
		// abelha | 1070

		Scanner sc = new Scanner(System.in);

		System.out.println("Entre com o valor da quantidade de casas: ");
		int valor = sc.nextInt();

		for (int i = 8; i < valor; i++) {

			if (i % 2 != 0) {
				System.out.println("Numeros impares digitado: " + i);
			}
		}

		sc.close();

	}

}
