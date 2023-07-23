package tryCacth;

import java.util.Scanner;

public class Explicacao1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Entre three numbers");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();

		int heigther = max(a, b, c);

		showResult(heigther);

		sc.close();

	}

	// Declarando uma função - Em Orientação a objeto, funções em classes recebem o
	// nome de metado
	public static int max(int x, int y, int z) {
		int aux;
		if (x > y && x > z) {
			aux = x;
		} else if (y > x && y > z) {
			aux = y;
		} else {
			aux = z;
		}
		return aux;
	}

	public static void showResult(int value) {
		System.out.println("Heigher = " + value);
	}

}
