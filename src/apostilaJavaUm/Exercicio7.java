package apostilaJavaUm;

import java.util.Scanner;

public class Exercicio7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		double c, f;

		System.out.println("Digite a temperatura em C°: ");
		c = sc.nextDouble();

		f = (9 * c + 160) / 5;

		System.out.println("A temperatura em  Fahrenheit é: " + f);

		sc.close();

	}

}
