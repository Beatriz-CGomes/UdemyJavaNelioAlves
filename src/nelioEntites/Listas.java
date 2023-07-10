package nelioEntites;

public class Listas {

	private Integer id;
	private String nome;
	private Double salario;

	public Listas() {
	}

	public Listas(Integer id, String nome, Double salario) {
		this.id = id;
		this.nome = nome;
		this.salario = salario;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Double getSalario() {
		return salario;
	}

	public void setSalario(Double salario) {
		this.salario = salario;
	}

	public void incrementoSalario(double p) {
		salario = (salario * p / 100) + salario ;
		
	}

	@Override
	public String toString() {
		return id + ", " + nome + ", " + salario;
	}

}
