package ApostilaJavaUm;

import java.util.Scanner;

public class Exercicio34 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Entre com idade: ");
		int idade = sc.nextInt();

		if (idade > 25) {
			System.out.println("idade fora da faixa etária!");
			System.exit(0);
			sc.close();
		} else if (idade < 5) {
			System.out.println("idade fora da faixa etária!");
			System.exit(0);
		}

		System.out.println("\tCATEGORIAS");
		System.out.println(" 1 - INFANTIL A = 5 a 7 ANOS");
		System.out.println(" 2 - INFANTIL B = 8 a 10 ANOS");
		System.out.println(" 3 - JUNEVIL A = 11 a 13 ANOS");
		System.out.println(" 4 - JUVENIL B = 14 a 17 ANOS");
		System.out.println(" 5 - SÊNIOR DE 18 a 25 ANOS");
		System.out.println();
		System.out.println("Entre com a opção ");
		int opção = sc.nextInt();

		switch (opção) {
		case 1:
			if (idade >= 5 && idade <= 7) {
				System.out.println("INFANTIL A VC TEM " + idade + " ANOS ");
			} else {
				System.out.println("DIGITOU ERRADO A OPÇÃO ERRADA!");
			}
			break;

		case 2:
			if (idade >= 8 && idade <= 10) {
				System.out.println("INFANTIL B VC TEM " + idade + " ANOS ");
			} else {
				System.out.println("DIGITOU ERRADO A OPÇÃO ERRADA!");
			}
			break;

		case 3:
			if (idade >= 11 && idade <= 13) {
				System.out.println("JUVEIL A VC TEM " + idade + " ANOS ");
			} else {
				System.out.println("DIGITOU ERRADO A OPÇÃO ERRADA!");
			}
			break;

		case 4:
			if (idade >= 14 && idade <= 17) {
				System.out.println("JUVENIL B VC TEM " + idade + " ANOS ");
			} else {
				System.out.println("DIGITOU ERRADO A OPÇÃO ERRADA!");
			}
			break;

		case 5:
			if (idade >= 18 && idade <= 25) {
				System.out.println("SENIOR VC TEM " + idade + " ANOS ");
			} else {
				System.out.println("DIGITOU ERRADO A OPÇÃO ERRADA!");
			}
			break;

		default:
			System.out.println("Opçao Invalida!");
			break;
		}

		sc.close();

	}

}
