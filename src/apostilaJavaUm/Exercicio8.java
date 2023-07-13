package apostilaJavaUm;

import java.util.Scanner;

public class Exercicio8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		double soma = 0;

		System.out.println("Dolar: ");
		double dolar = sc.nextDouble();

		System.out.println("Cotação");
		double cotacao = sc.nextDouble();

		soma = cotacao * dolar;

		System.out.printf("R$ %.2f %n" , soma);
		sc.close();
	}

}
