package entitiesBeecrowd;

public class Exercicio_3NovoSalario {

	public double salary;
	public double porcentagem;
	public double novoSalary;

	public Exercicio_3NovoSalario() {

	}

	public Exercicio_3NovoSalario(double salary, double porcentagem, double novoSalary) {
		super();
		this.salary = salary;
		this.porcentagem = porcentagem;
		this.novoSalary = novoSalary;
	}

	public double getSalary() {
		return salary;
	}

	public double getPorcentagem() {
		return porcentagem;
	}

	public double getNovoSalary() {
		return novoSalary;
	}

	public double newSalary() {
		 novoSalary = salary * porcentagem / 100;
		return novoSalary + salary;

	}

	public String toString() {
		return "Novo Salário  " + String.format("%.2f", newSalary()) + 
				" Reajuste :  " + novoSalary
				+ " Em percentual:  " + porcentagem + " % ";
	}

}
