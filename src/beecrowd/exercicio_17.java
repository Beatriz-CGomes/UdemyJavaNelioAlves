package beecrowd;

import java.util.Scanner;

public class exercicio_17 {

	public static void main(String[] args) {
		// 1132

		Scanner sc = new Scanner(System.in);

		int soma = 0;

		System.out.println(" X: ");
		int X = sc.nextInt();

		System.out.println(" Y: ");
		int Y = sc.nextInt();

		if(X < Y) {
			for(int i = X; i <= Y; i++) {
				if(i % 13 != 0) {
					soma += i;
				}
			}
		} else {
			for(int i = Y; i <= X; i++) {
				if(i % 13 != 0) {
					soma += i;
				}
			}
		}
		
		
		System.out.println(soma);
		sc.close();

	}

}
