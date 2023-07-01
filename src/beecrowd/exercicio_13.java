package beecrowd;

import java.util.Scanner;

public class exercicio_13 {

	public static void main(String[] args) {
		// 1072

		Scanner sc = new Scanner(System.in);

		int into = 0;
		int out = 0;

		System.out.println("Numero N de vezes ");
		int numeroN = sc.nextInt();

		for (int i = 0; i < numeroN; i++) {
			System.out.println("Numero X lidos na " + (i + 1) + " posição ");
			int numeroX = sc.nextInt();

			if (numeroX >= 10 && numeroX <= 20) {
				into++;
			} else {
				out++;
			}

		}

		System.out.println("Dentro " + into);
		System.out.println("Fora " + out);
		sc.close();

	}

}
