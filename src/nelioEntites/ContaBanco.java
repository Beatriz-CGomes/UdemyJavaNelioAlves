package nelioEntites;

public class ContaBanco {

	private int numero;
	private String nome;
	private double valor;

	public ContaBanco() {
	}

	public ContaBanco(int numero, String nome) {
		this.numero = numero;
		this.nome = nome;
	}

	public ContaBanco(int numero, String nome, double valor) {
		this.numero = numero;
		this.nome = nome;
		//protegendo para mudar apenas o metodo.
		depositar(valor);
	}

	public int getNumero() {
		return numero;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getValor() {
		return valor;
	}

//encapsulamento estamos fazendo uma regra de negócio caso mudar para cada deposito o banco desconta 1 real, eu mudaria apenas a regra do metado sem precisar mexer no construtor
	public void depositar(double quantia) {
		valor = (this.valor + quantia) - 1.0;
	}

	public void retirar(double quantia) {
		valor = (this.valor - quantia) - 5;
	}

	@Override
	public String toString() {
		return "Número da Conta: " + numero + ", " + "Titular: " + nome + " ," + "Valor: R$" + valor;
	}
}
