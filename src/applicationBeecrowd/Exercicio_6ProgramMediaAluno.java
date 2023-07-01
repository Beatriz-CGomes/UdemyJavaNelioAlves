package applicationBeecrowd;

import java.util.Scanner;

import entitiesBeecrowd.Exercicio_6MediaAluno;

public class Exercicio_6ProgramMediaAluno {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		Exercicio_6MediaAluno medAL = new Exercicio_6MediaAluno();

		System.out.println("Entre com a nota 1: ");
		double nota1 = sc.nextDouble();

		System.out.println("Entre com a nota 2: ");
		double nota2 = sc.nextDouble();

		System.out.println("Entre com a nota 3: ");
		double nota3 = sc.nextDouble();

		System.out.println("Entre com a nota 4: ");
		double nota4 = sc.nextDouble();

		System.out.println("A Nota final do aluno é: " + medAL.NotaFinal(nota1, nota2, nota3, nota4));
		System.out.println("A Média final do aluno é: " + medAL.mediaAluno());
	
		
		sc.close();
	}

}
