package beecrowd;

import java.util.Scanner;

public class Exercicio_9 {

	public static void main(String[] args) {
		// ABELHA 1072 RESPONDIDO COM VETOR

		Scanner sc = new Scanner(System.in);

		System.out.println("Quantos números serão digitados");
		int numeros = sc.nextInt();

		int[] valores = new int[numeros];
		int out = 0, in = 0;

		for (int i = 0; i < numeros; i++) {
			System.out.println("Entre com os números " + (i + 1));
			valores[i] = sc.nextInt();
		}

		for (int i = 0; i < numeros; i++) {
			if (valores[i] >= 10 && valores[i] <= 20) {
				in++;
			} else {
				out++;
			}
		}

		System.out.println(in + " IN  ");
		System.out.println(out + " OUT  ");
		sc.close();

	}

}
