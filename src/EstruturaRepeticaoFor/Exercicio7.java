package EstruturaRepeticaoFor;

import java.util.Scanner;

public class Exercicio7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		System.out.println("Entre com valor");
		int N = sc.nextInt();

		for (int x = 1; x <= N; x++) {
			int um = x;
			int dois = x * x;
			int tres = x * x * x;

			System.out.println(um + dois + tres);
		}

		sc.close();

	}

}
