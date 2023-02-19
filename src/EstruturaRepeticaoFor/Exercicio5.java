package EstruturaRepeticaoFor;

import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int fatorial = 0;

		System.out.println("Entre com valor ");
		int numero = sc.nextInt();

		for (int i = 0; i <= numero; i++) {
			fatorial = numero * (numero - 1) * (numero - 2) * (numero - 3);
		}

		System.out.println(fatorial);

		sc.close();

	}

}
