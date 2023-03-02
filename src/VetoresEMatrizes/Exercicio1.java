package VetoresEMatrizes;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite um número para N: ");
		int n = sc.nextInt();
		
		double[] vect = new double[n];
		
		for (int i = 0; i < n; i++) {
			System.out.println(" Digite um numero para a posição " + i);
			vect[i] = sc.nextDouble();
		}

		double sum = 0;
		for (int i = 0; i < n; i++) {
			sum += vect[i];
		}

		double avg = sum / n;

		System.out.println(" AVERAGE HEIGHT = " + avg);
		sc.close();

	}

}
