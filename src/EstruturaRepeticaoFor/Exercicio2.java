package EstruturaRepeticaoFor;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		int in = 0, out = 0;

		System.out.println("Entre com valor inteiro: ");
		int N = sc.nextInt();

		for (int i = 0; i <= N; i++) {
			System.out.println("Entre com valor para X: ");
			int X = sc.nextInt();
			if (X >= 10 && X <= 20) {
				in += 1;
			} else {
				out += 1;
			}
		}

		System.out.println("Total de numeros impares dentro do intervalor de 10/20 " + in);
		System.out.println("Total de numeros pares dentro do intervalor de 10/20 " + out);

		sc.close();
	}

}
