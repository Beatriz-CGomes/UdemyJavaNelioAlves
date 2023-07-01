package beecrowd;

import java.util.Scanner;

public class exercicio_14 {

	public static void main(String[] args) {
		// 1071

		Scanner sc = new Scanner(System.in);
		int soma = 0;

		System.out.println("Valor de X: ");
		int x = sc.nextInt();

		System.out.println("Valor de Y: ");
		int y = sc.nextInt();

		if (x < y) {
			for (int i = x + 1; i < y; i++) {
				if (i % 2 != 0) {
					soma += i;
				}
			}
		}

		if (y < x) {
			for (int i = y + 1; i < x; i++) {
				if (i % 2 != 0) {
					soma += i;
				}
			}
		}

		System.out.println(soma);
		sc.close();
	}

}
