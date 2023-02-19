package EstruturaRepeticaoFor;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		double pesonota1 = 2, pesonota2 = 3, pesonota3 = 5, media = 0;
		double notaExame = 0, notaRepro = 0;

		System.out.println("Entre com total de notas a serem somadas");
		double N = sc.nextDouble();

		for (int i = 0; i < N; i++) {
			System.out.println("Digite o valor da nota 1: ");
			double nota1 = sc.nextDouble();
			System.out.println("Digite o valor da nota 2: ");
			double nota2 = sc.nextDouble();
			System.out.println("Digite o valor da nota 3: ");
			double nota3 = sc.nextDouble();

			media = (nota1 * pesonota1 + nota2 * pesonota2 + nota3 * pesonota3) / 10;

			if (media >= 6.75) {
				System.out.println("Aprovado");
			} else if (media >= 5.50 && media <= 6.74) {
				notaExame = 6.75 - media;
				System.out.println("\nExame");
				System.out.println("faltou " + notaExame + " para passar ");
			} else {
				notaRepro = 6.75 - media;
				System.out.println("\nReprovado");
				System.out.println("faltou  " + notaRepro + " para passar");
			}

			System.out.println("A media do aluno(a) é de " + media);

		}

		sc.close();

	}

}
