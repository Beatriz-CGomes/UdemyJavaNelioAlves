package beecrowd;

import java.util.Scanner;

public class Exercicio_1 {

	public static void main(String[] args) {

		// ABELHA 1005 - resolvendo o problema com vetor

		Scanner sc = new Scanner(System.in);

		System.out.println("Quantos alunos serã cadastrados? ");
		int num = sc.nextInt();

		String[] nomeAluno = new String[num];
		double[] notaA = new double[num];
		double[] notaB = new double[num];
		double[] somaNota = new double[num];

		System.out.println("\tDADOS DO ALUNO:");

		for (int i = 0; i < num; i++) {
			System.out.println("Nome aluno(a): ");
			sc.skip("\\R");
			nomeAluno[i] = sc.nextLine();

			System.out.println("Nota 1: ");
			notaA[i] = sc.nextDouble();

			System.out.println("Nota 2: ");
			notaB[i] = sc.nextDouble();
		}

		System.out.println("\tBOLETIM DO ALUNO(A)");
		for (int i = 0; i < num; i++) {
			somaNota[i] = (notaA[i] + notaB[i]) / 2;

			System.out.println("A soma média do aluno(a) :  " + somaNota[i]);

			if (somaNota[i] >= 6.75) {
				System.out.println("Parabéns  " + nomeAluno[i] + ", você está APROVADOO!");
				System.out.println("-----------------------------");
			} else if (somaNota[i] >= 5.50 && somaNota[i] <= 6.74) {
				System.out.println(nomeAluno[i] + ", você está de RECUPERAÇÃO ");
				System.out.println("-----------------------------");

			} else {
				System.out.println(nomeAluno[i] + ", você está REPROVADOO! ");
				System.out.println("-----------------------------");
			}
		}

	}
}
