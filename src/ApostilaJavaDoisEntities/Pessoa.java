package ApostilaJavaDoisEntities;



public class Pessoa {

	private String nome;
	private String dataNascimento;
	private double altura;
	private int anoNascimento;
	private int anoAtual;

	public Pessoa() {
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public double getAnoNascimento() {
		return anoNascimento;
	}

	public void setAnoNascimento(int anoNascimento) {
		this.anoNascimento = anoNascimento;
	}

	public double getAnoAtual() {
		return anoAtual;
	}

	public void setAnoAtual(int anoAtual) {
		this.anoAtual = anoAtual;
	}

	public double calculaIdade() {
		int idadeE = anoAtual - anoNascimento;
		return idadeE;
	}

	@Override
	public String toString() {
		return "Nome: " + nome + "\nData de nascimento " + dataNascimento + "\nAltura: " + altura + "\nidade "
				+ calculaIdade() + " anos ";
	}

}
