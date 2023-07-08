package nelioEntites;

public class Funcionario {

	public String nome;
	public double salario;
	public double taxa;

	public double proximoSalario() {
		return salario - taxa;
	}

	public double aumentarSalario(double p) {
		return salario = salario  + salario * p /100;
	}

	@Override
	public String toString() {
		return "Funcionário " + nome + ", R$ " + proximoSalario();
	}

	

}
