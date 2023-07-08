package nelioEntites;

public class GradeEscolar {

	public String nomeAluno;
	public double notaUm;
	public double notaDois;
	public double notaTres;

	public double notaGrade() {
		return notaUm + notaDois + notaTres;
	}

	public void notaGradeStatus() {
		if (notaGrade() >= 60) {
			System.out.println("PASSOU!");
		} else {
			System.out.println("REPROVOU!");
		}
	}

	public double faltandoPontos() {
		if (notaGrade() < 60) {
			return 60 - notaGrade();
		} else {
			return 0.0;
		}
	}

}
