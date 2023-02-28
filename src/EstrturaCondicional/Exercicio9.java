package EstrturaCondicional;

import java.util.Scanner;

public class Exercicio9 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Entre three numbers");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();

		if (a > b && a > c) {
			System.out.println("Higer = " + a);
		} else if (b > a && b > c) {
			System.out.println("Higer = " + b);
		} else {
			System.out.println("Higer " + c);
		}

		sc.close();

	}

}
