package ApostilaJavaUm;

import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		double media = 0;

		System.out.println("Nome: ");
		String nome = sc.nextLine();
		System.out.println("Nota 1: ");
		double nota1 = sc.nextDouble();
		System.out.println("Nota 2: ");
		double nota2 = sc.nextDouble();
		System.out.println(" Nota 3: ");
		double nota3 = sc.nextDouble();

		media = (nota1 + nota2 + nota3) / 3;

		System.out.println("Nome: " + nome + " Média: " + media);
		sc.close();

	}

}
