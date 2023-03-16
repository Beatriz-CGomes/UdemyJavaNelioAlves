package entities;

public class Funcionarios {

	private String nome;
	private Integer hora;
	private Double valorPorHora;

	public Funcionarios() {

	}

	public Funcionarios(String nome, Integer hora, Double valorPorHora) {
		this.nome = nome;
		this.hora = hora;
		this.valorPorHora = valorPorHora;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Integer getHora() {
		return hora;
	}

	public Double getValorPorHora() {
		return valorPorHora;
	}

	public double pagamento() {
		return hora * valorPorHora;
	}

}
