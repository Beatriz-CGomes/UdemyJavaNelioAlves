package apostilaJavaUm;

import java.util.Scanner;

public class Exercicio23 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Entre com um numero");
		int n = sc.nextInt();

		if (n > 80 || n < 25 || n == 40) {
			System.out.println(" OK ");
		} else {
			System.out.println(" ERROR");
		}

		sc.close();
	}

}
