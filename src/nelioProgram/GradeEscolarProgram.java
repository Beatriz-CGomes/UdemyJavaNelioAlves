package nelioProgram;

import java.util.Scanner;

import nelioEntites.GradeEscolar;

public class GradeEscolarProgram {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		GradeEscolar grade = new GradeEscolar();

		System.out.println("Nome: ");
		grade.nomeAluno = sc.nextLine();

		System.out.println("Digite a nota em sequencia: ");
		grade.notaUm = sc.nextDouble();
		grade.notaDois = sc.nextDouble();
		grade.notaTres = sc.nextDouble();

		System.out.println(grade.nomeAluno + " " + grade.notaGrade());
		grade.notaGradeStatus();
		System.out.println("Pontos que faltam para passar: " + grade.faltandoPontos());

		sc.close();

	}

}
