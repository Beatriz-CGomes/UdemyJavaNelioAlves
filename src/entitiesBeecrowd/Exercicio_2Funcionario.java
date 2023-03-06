package entitiesBeecrowd;

public class Exercicio_2Funcionario {

	public String nome;
	public double salario;
	public double vendaMes;

	public Exercicio_2Funcionario() { // construtor padrão

	}

	public Exercicio_2Funcionario(String nome, double salario, double vendaMes) {
		super();
		this.nome = nome;
		this.salario = salario;
		this.vendaMes = vendaMes;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getSalario() {
		return salario;
	}

	public double getVendaMes() {
		return vendaMes;
	}

	public double salaryComissao() {
		double soma = vendaMes * 15 / 100;
		return salario + soma;
	}

	@Override
	public String toString() {
		return "Nome : " + nome + ", salario do mês :  " + String.format("%.2f", salaryComissao());
	}

}
