package VetoresEMatrizes;

import java.util.Scanner;

public class Exercicio_18 {


		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);

			System.out.println("---------------------------------------");
			System.out.println("Mural das aulas  ");
			System.out.println("     1 - Português ");
			System.out.println("     2 - Matemática ");
			System.out.println("     3 - História  ");
			System.out.println("     4 - Geografia ");
			System.out.println("");
			System.out.println("Escolha a matéria para visualizar sua nota");
			int op = sc.nextInt();

			System.out.println("Quantas notas serão cadastradas? ");
			int numeroNotas = sc.nextInt();

			float[][] notas = new float[1][numeroNotas];
			float[] soma = new float[numeroNotas];

			for (int i = 0; i < 1; i++) {
				for (int j = 0; j < numeroNotas; j++) {
					System.out.println("Entre com a " + (j + 1) + " nota");
					notas[i][j] = sc.nextFloat();
				}
			}

			for (int i = 0; i < 1; i++) {
				for (int j = 0; j < numeroNotas; j++) {
					soma[i] += (notas[i][j]) / numeroNotas;
				}

				if (soma[i] >= 6.78) {
					System.out.println("Aprovado");
				} else if (soma[i] >= 5.50 && soma[i] <= 6.74) {
					System.out.println("Recuperação");
				} else {
					System.out.println("Reprovado!");
				}

			}

			sc.close();
		}

	}

