package entities;

public class FuncionariosTercerizados extends Funcionarios {

	private double addCobrança;

	public FuncionariosTercerizados() {
		super();
	}

	public FuncionariosTercerizados(String nome, Integer hora, Double valorPorHora, double addCobrança) {
		super(nome, hora, valorPorHora);
		this.addCobrança = addCobrança;
	}

	public double getAddCobrança() {
		return addCobrança;
	}

	public void setAddCobrança(double addCobrança) {
		this.addCobrança = addCobrança;
	}

	@Override
	public double pagamento() {
		return super.pagamento() + addCobrança * 110 / 100;
	}

}
