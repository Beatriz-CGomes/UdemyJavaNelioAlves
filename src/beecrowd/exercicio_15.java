package beecrowd;

import java.util.Scanner;

public class exercicio_15 {

	public static void main(String[] args) {
		// 1075

		Scanner sc = new Scanner(System.in);

		System.out.println("Leia um numero ");
		int n = sc.nextInt();

		for (int i = 1; i < 1000; i++) {
			if (i % n == 2) {
				System.out.println(i);
			}

		}

		sc.close();

	}

}
