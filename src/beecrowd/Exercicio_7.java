package beecrowd;

import java.util.Scanner;

public class Exercicio_7 {

	public static void main(String[] args) {
		// BEE 1059 respondendo com vetor
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Entre com quantidade de numeros");
		int num = sc.nextInt();

		int[] pares = new int[num];

		for (int i = 1; i <= num; i++) {
			if (i % 2 == 0) {
				System.out.println(i);
			}

		}

		sc.close();

	}

}
