package ApostilaJavaUm;

import java.util.Scanner;

public class Exercicio21 {

	public static void main(String[] args) {

		char resp;
		int total = 0, totalAptos = 0, totalNAptos = 0;

		Scanner sc = new Scanner(System.in);

		do {
			System.out.println("Nome: ");
			String nome = sc.next();
			sc.nextLine();

			System.out.println("Idade: ");
			int idade = sc.nextInt();

			System.out.println(" Sexo: 'F' - FEMININO / 'M' - MASCULINO");
			char sexo = sc.next().charAt(0);

			System.out.println(" Sáude Boa? 'S' - SIM / 'N' - NÃO ");
			char saude = sc.next().charAt(0);

			if (idade >= 18 && idade <= 60 && saude == 'S') {
				// System.out.println("Apto");
				totalAptos++;
				total++;
			} else {
				// System.out.println("Não Apto");
				totalNAptos++;
				total++;
			}

			System.out.println("Deseja continuar cadastrando? 'S' - SIM / 'N' - NÃO ");
			resp = sc.next().charAt(0);
		} while (resp == 'S' || resp == 's');

		System.out.println("Total de inscritos " + total);
		System.out.println("Total Aptos " + totalAptos);
		System.out.println("Total Não Aptos " + totalNAptos);
		sc.close();
	}

}
