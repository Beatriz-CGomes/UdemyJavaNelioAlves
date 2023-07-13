package apostilaJavaUm;

import java.util.Scanner;

public class Exercicio30 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("A: ");
		int A = sc.nextInt();

		System.out.println("B: ");
		int B = sc.nextInt();

		System.out.println("C: ");
		int C = sc.nextInt();

		if (A < B && A < C && B > C) {
			System.out.println("ORDEM : A,B,C " + A  + B  +  C); 
		} else if (B < A && B < C && A < C) {
			System.out.println("ORDEM B,A,C: " + B  +  A +  C);
		} else if (A < B && A < C && C > B) {
			System.out.println( "ORDEM : A,C,B " + A  +  C +  B);
		}  else if (B < A && B < C && C < A) {
			System.out.println( "ORDEM : B,C,A " +  B  + C + A);
		} else if (C < A && C < B && A < B) {
			System.out.println("ORDEM : C,A,B " +  C +  A +  B);
		} else if (C < A && C < B && B < A) {
			System.out.println( "ORDEM : C,B,A " +  C + B + A);
		}

		sc.close();
	}

}
