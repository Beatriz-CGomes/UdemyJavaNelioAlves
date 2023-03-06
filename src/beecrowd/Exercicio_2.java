package beecrowd;

import java.util.Scanner;

public class Exercicio_2 {

	public static void main(String[] args) {

		// ABELHA 1006 - resolvendo problema com Matriz
		Scanner sc = new Scanner(System.in);

		System.out.println("Quantos alunos serão cadastrados? ");
		int numAlunos = sc.nextInt();

		System.out.println("Quantas notas serã cadastradas? ");
		int numNotas = sc.nextInt();

		String[] nomesAlunos = new String[numAlunos];
		double[][] notasAlunos = new double[numAlunos][numNotas];
		double[] somaMediaAlunos = new double[numAlunos];

		System.out.println("\tDADOS DOS ALUNOS(A) : ");
		for (int i = 0; i < numAlunos; i++) {

			System.out.println("Nome do Aluno(a): ");
			sc.skip("\\R?");
			nomesAlunos[i] = sc.nextLine();

			for (int j = 0; j < numNotas; j++) {
				System.out.println("Entre com a nota " + (j + 1) + " : ");
				notasAlunos[i][j] = sc.nextDouble();
			}

		}

		System.out.println("\tBOLETIM DO ALUNO ");
		System.out.println("MÉDIA: ");

		for (int i = 0; i < numAlunos; i++) {
			for (int j = 0; j < numNotas; j++) {

				somaMediaAlunos[i] += (notasAlunos[i][j]) / numNotas;
			}
			System.out.println(somaMediaAlunos[i]);

			if (somaMediaAlunos[i] >= 6.75) {
				System.out.println("Parabéns " + nomesAlunos[i] + ", você está APROVADO! ");
				System.out.println("-------------------------------------");
			} else if (somaMediaAlunos[i] >= 5.50 && somaMediaAlunos[i] <= 6.74) {
				System.out.println(nomesAlunos[i] + ", você está de RECUPERAÇÃO! ");
				System.out.println("-------------------------------------");
			} else {
				System.out.println(nomesAlunos[i] + ", você está de REPROVADO! ");
				System.out.println("-------------------------------------");
			}
		}

		sc.close();

	}

}
