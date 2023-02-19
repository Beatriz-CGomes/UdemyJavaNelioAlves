package EstruturaRepeticaoFor;

import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		int n1, n2, N;
		double soma;

		System.out.println("Entre com a quantidade para serem somados: ");
		N = sc.nextInt();

		for (int i = 0; i < N; i++) {
			System.out.println("Entre com o numerador ");
			n1 = sc.nextInt();
			System.out.println("Entre com o denominador ");
			n2 = sc.nextInt();
			if (n2 == 0) {
				System.out.println("divisao impossivel");
			} else {
				soma = n1 / n2;
				System.out.println("A soma da divisão é " + soma);
			}
		}

		;
		sc.close();

	}

}
