package EstruturaRepeticaoFor;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		System.out.println("Entre com um valor inteiro");
		int num = sc.nextInt();

		for (int i = 0; i <= num; i++) {
			if (i % 2 != 0) {
				System.out.println("Numeros impares " + i);
			}
		}

		sc.close();

	}

}
