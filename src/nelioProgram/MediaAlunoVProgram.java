package nelioProgram;

import java.util.Scanner;

import nelioEntites.MediaAlunoV;

public class MediaAlunoVProgram {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		double soma = 0, media = 0;

		System.out.println("Quantos alunos serao digitados?");
		int n = sc.nextInt();

		MediaAlunoV[] mediaA = new MediaAlunoV[n];

		for (int i = 0; i < mediaA.length; i++) {
			System.out.println("Dados do aluno " + (i + 1));
			sc.nextLine();
			System.out.print("Nome: ");
			String nome = sc.nextLine();

			System.out.print("Nota 1: ");
			double nota1 = sc.nextDouble();

			System.out.print("Nota 2: ");
			double nota2 = sc.nextDouble();

			mediaA[i] = new MediaAlunoV(nome, nota1, nota2);
		}

		System.out.println("Alunos aprovados: ");

		for (int i = 0; i < mediaA.length; i++) {
			soma = mediaA[i].getNota1() + mediaA[i].getNota2();
			media = soma / 2;

			if (media >= 6) {
				System.out.println(mediaA[i].getNome());
			}
		}

		sc.close();

	}

}
