package ApostilaJavaUm;

import java.util.Scanner;

public class Exercicio24 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Entre com a quantidade de numeros para ser processados: ");
		int n = sc.nextInt();

		for (int i = 1; i < n; i++) {
			System.out.println("Entre com os números: ");
			int numeroE = sc.nextInt();
			if (numeroE > 0) {
				System.out.println(numeroE + " Positivo ");
			} else if (numeroE < 0) {
				System.out.println(numeroE + " Negativo ");
			} else {
				System.out.println(numeroE + " Igual a Zero");
			}
		}
		sc.close();

	}

}
