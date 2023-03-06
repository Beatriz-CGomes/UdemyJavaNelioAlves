package entitiesBeecrowd;

public class Exercicio_1Funcionarios {

	public int matricula;
	public double horasTrabalhadas;
	public double horasPagas;

	public Exercicio_1Funcionarios() { // metodo padrão

	}

	public Exercicio_1Funcionarios(int matricula, double horasTrabalhadas, double horasPagas) {
		super();
		this.matricula = matricula;
		this.horasTrabalhadas = horasTrabalhadas;
		this.horasPagas = horasPagas;
	}

	public int getMatricula() {
		return matricula;
	}

	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}

	public double getHorasTrabalhadas() {
		return horasTrabalhadas;
	}

	public double getHorasPagas() {
		return horasPagas;
	}

	public double salary() {
		return horasTrabalhadas * horasPagas;
	}

	@Override
	public String toString() {
		return "Matricula : " +  matricula  + "  Salário R$: " + salary();
	}
}
