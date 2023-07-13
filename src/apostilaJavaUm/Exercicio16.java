package apostilaJavaUm;

import java.util.Scanner;

public class Exercicio16 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Nome: ");
		String nome = sc.nextLine();
		System.out.println("Nota 1: ");
		double nota1 = sc.nextDouble();
		System.out.println("Nota 2: ");
		double nota2 = sc.nextDouble();
		System.out.println("Nota 3: ");
		double nota3 = sc.nextDouble();

		double media = (nota1 + nota2 + nota3) / 3;

		if (media >= 7) {
			System.out.println("Parabéns, " + nome + " você foi APROVADO! sua média foi de: " + media);
		} else if (media >= 5.1 && media <= 6.9) {
			System.out.println("Fique esperto(a), " + nome + " você está de RECUPERAÇÃO! sua média foi de: " + media);
		} else {
			System.out.println("Infelizmente, " + nome + " você foi REPROVADO! sua média foi de: " + media);
		}

		sc.close();

	}

}
