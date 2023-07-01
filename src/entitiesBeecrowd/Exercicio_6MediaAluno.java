package entitiesBeecrowd;

public class Exercicio_6MediaAluno {

	private double nota1;
	private double nota2;
	private double nota3;
	private double nota4;
	double mediaAluno = 0;

	public Exercicio_6MediaAluno() {
	}

	public Exercicio_6MediaAluno(double nota1, double nota2, double nota3, double nota4) {
		this.nota1 = nota1;
		this.nota2 = nota2;
		this.nota3 = nota3;
		this.nota4 = nota4;
	}

	public double getNota1() {
		return nota1;
	}

	public double getNota2() {
		return nota2;
	}

	public double getNota3() {
		return nota3;
	}

	public double getNota4() {
		return nota4;
	}

	public double NotaFinal(double nota1, double nota2, double nota3, double nota4) {
		mediaAluno = nota1 + nota2 + nota3 + nota4;
		return mediaAluno;
	}

	public double mediaAluno() {
		mediaAluno = mediaAluno / 4;
		if (mediaAluno >= 7.75) {
			System.out.println("Aluno Aprovado!");
		} else if (mediaAluno >= 5.50 && mediaAluno < 7.75) {
			System.out.println("Aluno de Recuperação! ");
		} else {
			System.out.println("Aluno Reprovado! ");
		}

		return mediaAluno;
	}

	public String toString() {
		return "Media do aluno " + mediaAluno;
	}

}
