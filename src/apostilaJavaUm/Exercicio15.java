package apostilaJavaUm;

import java.util.Scanner;

public class Exercicio15 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Entra com um numero: ");
		int numero = sc.nextInt();

		if (numero >= 100 && numero <= 200) {
			System.out.println("Está no intervalo entre 100 e 200");
		} else {
			System.out.println("Está fora do intervalo!");
		}

		sc.close();
	}

}
