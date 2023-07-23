package ApostilaJavaDoisEntities;

public class MediaAlunoA {

	private Integer matricula;
	private String nome;
	private Double notaP1;
	private Double notaP2;
	private Double notaTrabalho;

	public MediaAlunoA() {
	}

	public MediaAlunoA(Integer matricula, String nome, Double notaP1, Double notaP2, Double notaTrabalho) {
		this.matricula = matricula;
		this.nome = nome;
		this.notaP1 = notaP1;
		this.notaP2 = notaP2;
		this.notaTrabalho = notaTrabalho;
	}

	public Integer getMatricula() {
		return matricula;
	}

	public void setMatricula(Integer matricula) {
		this.matricula = matricula;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Double getNotaP1() {
		return notaP1;
	}

	public void setNotaP1(Double notaP1) {
		this.notaP1 = notaP1;
	}

	public Double getNotaP2() {
		return notaP2;
	}

	public void setNotaP2(Double notaP2) {
		this.notaP2 = notaP2;
	}

	public Double getNotaTrabalho() {
		return notaTrabalho;
	}

	public void setNotaTrabalho(Double notaTrabalho) {
		this.notaTrabalho = notaTrabalho;
	}

	public double media() {
		return ((this.notaP1 + this.notaP2) * 2.5 + this.notaTrabalho * 2) / 7;

	}

	public double finalNota() {
		double media = media();
		if (media < 5.0) {
			return 10 - media;
		}
		return  0;

	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Media Aluno: \n");
		sb.append("Matricula " + matricula + "\n");
		sb.append("Nome: " + nome + "\n");
		return sb.toString();

	}
}
