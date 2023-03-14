package beecrowd;

import java.util.Scanner;

public class Exercicio_8 {

	public static void main(String[] args) {
		// ABELHA 1060 respondido com vetor 
		// BEE 1064 inserindo a soma para o exercico 1064


		Scanner sc = new Scanner(System.in);

		System.out.println("Entre com a quantidade de números: ");
		int numeros = sc.nextInt();

		double[] valores = new double[numeros];
		double positivo = 0, negativos = 0;
		double soma = 0;

		for (int i = 0; i < numeros; i++) {
			System.out.println("Digite os numeros " + (i + 1) + "º posição : ");
			valores[i] = sc.nextDouble();
		}

		for (int i = 0; i < numeros; i++) {
			if (valores[i] > 0) {
				positivo++;

			} else {
				negativos++;
			}
			
			soma += valores[i];
		}
		System.out.println(positivo + " valores positivos ");
		System.out.println("A soma dos valores positivos " + soma);
		System.out.println(negativos + " valores negativos ");
		sc.close();

	}

}
