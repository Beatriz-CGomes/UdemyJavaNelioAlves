package entitiesBeecrowd;

public class Exercicio_5Loja {

	private String nome;
	private double compra;
	private double compraExtra;

	// Construtores Padrão e sobrecarga
	public Exercicio_5Loja() {

	}

	public Exercicio_5Loja(String nome, double compra) {
		super();
		this.nome = nome;
		this.compra = compra;

	}

	public Exercicio_5Loja(String nome, double compra, double compraExtra) {
		super();
		this.nome = nome;
		this.compra = compra;
		this.compraExtra = compraExtra;
	}

	public String getNome() {
		return nome;
	}

	public double getCompra() {
		return compra;
	}

	public double getCompraExtra() {
		return compraExtra;
	}

	public double compras(double mais ) {
		return compra +=  5;
	}

	public double compraExtra() {
		return compra += compraExtra + 5;
	}

	@Override
	public String toString() {
		return " Nome do Cliente: " + nome +
				" Total Compra:  " + compra;
	}

	
	
	
}
