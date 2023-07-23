package ApostilaJavaDoisApplication;

import java.util.Scanner;

import ApostilaJavaDoisEntities.MediaAlunoA;

public class MediaAlunoAProgram {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Matricula: ");
		Integer matricula = sc.nextInt();
		System.out.print("Nome: ");
		sc.nextLine();
		String nome = sc.nextLine();
		
		System.out.print("Nota 1: ");
		Double nota1 = sc.nextDouble();
		System.out.print("Nota 2: ");
		Double nota2 = sc.nextDouble();
		System.out.print("Nota Trabalho: ");
		Double notaT = sc.nextDouble();
		
		System.out.println();
		System.out.println();
		MediaAlunoA mediaA = new MediaAlunoA(matricula, nome, nota1, nota2, notaT);
		System.out.println(mediaA);
		System.out.println("Média final: " + mediaA.media());
		System.out.println("Pontos para passar: " + mediaA.finalNota());
	}

}
