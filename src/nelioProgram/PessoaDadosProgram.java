package nelioProgram;

import java.util.Scanner;

import nelioEntites.PessoaDados;

public class PessoaDadosProgram {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Quantas pessoas voce vai digitar? ");
		int n = sc.nextInt();

		PessoaDados[] pessoa = new PessoaDados[n];

		for (int i = 0; i < pessoa.length; i++) {
			System.out.println("Dados da " + (i + 1) + " pessoa");
			System.out.print("Nome: ");
			String nome = sc.next();

			System.out.print("Idade: ");
			int idade = sc.nextInt();

			pessoa[i] = new PessoaDados(nome, idade);

		}

		int idadeMaior = 0, posicaoMaior = 0;

		for (int i = 0; i < pessoa.length; i++) {
			if (pessoa[i].getIdade() > idadeMaior) {
				idadeMaior = pessoa[i].getIdade();
				posicaoMaior = i;
			}
		}

		System.out.println("PESSOA MAIS VELHA: " + pessoa[posicaoMaior].getNome());
		sc.close();

	}

}
