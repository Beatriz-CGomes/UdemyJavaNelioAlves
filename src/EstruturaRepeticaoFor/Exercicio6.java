package EstruturaRepeticaoFor;

import java.util.Scanner;

public class Exercicio6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		System.out.println("Entre com um numero");
		int numero = sc.nextInt();

		for (int i = 1; i <= numero; i++) {

			if (numero % i == 0) {
				System.out.println(i);
			}
		}
		sc.close();
	}

}
