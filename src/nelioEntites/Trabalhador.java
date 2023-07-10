package nelioEntites;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import nelioEnum.TrabalhadorStatus;

public class Trabalhador {

	private String nome;
	private TrabalhadorStatus status;
	private Double baseSalario;

	// associação
	private TrabalhadorDepartamento departamento;

	// associação lista por conta do trabalhador ter vários contrato
	private List<TrabalhadorHora> contrato = new ArrayList<>();

	public Trabalhador() {
	}

	public Trabalhador(String nome, TrabalhadorStatus status, Double baseSalario,
			TrabalhadorDepartamento departamento) {
		super();
		this.nome = nome;
		this.status = status;
		this.baseSalario = baseSalario;
		this.departamento = departamento;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public TrabalhadorStatus getStatus() {
		return status;
	}

	public void setStatus(TrabalhadorStatus status) {
		this.status = status;
	}

	public Double getBaseSalario() {
		return baseSalario;
	}

	public void setBaseSalario(Double baseSalario) {
		this.baseSalario = baseSalario;
	}

	public TrabalhadorDepartamento getDepartamento() {
		return departamento;
	}

	public void setDepartamento(TrabalhadorDepartamento departamento) {
		this.departamento = departamento;
	}

	public List<TrabalhadorHora> getContrato() {
		return contrato;
	}

	// metados
	public void addContrato(TrabalhadorHora contrato) {
		this.contrato.add(contrato);
	}

	public void removerContrato(TrabalhadorHora contrato) {
		this.contrato.remove(contrato);
	}

	public double renda(int ano, int mes) {
		// somando o total do salario
		double soma = baseSalario;
		// para poder pegar o mes e o ano instacioamos o calendar
		Calendar cal = Calendar.getInstance();

		for (TrabalhadorHora c : contrato) {
			// aqui estamos pegando a data certinha
			cal.setTime(c.getDate());
			// atribuindo o cal para poder a data certinha
			int c_ano = cal.get(Calendar.YEAR);
			int c_mes = cal.get(Calendar.MONTH);
			// fazendo um if para saber se está lidando com mesmo mes e ano
			if (ano == c_ano && mes == c_mes) {
				// aqui sem o if seria o valor total de todo o contrato
				soma += c.totalValor();
			}
		}
		return soma;
	}

}
