package heranca;

public class TIndividual extends TaxPayer {

	private Double healthExpenditures;

	public TIndividual() {
	}

	public TIndividual(String name, Double anuallncome, Double healthExpenditures) {
		super(name, anuallncome);
		this.healthExpenditures = healthExpenditures;
	}

	public Double getHealthExpenditures() {
		return healthExpenditures;
	}

	public void setHealthExpenditures(Double healthExpenditures) {
		this.healthExpenditures = healthExpenditures;
	}

	@Override
	public double tax() {
		double impostoPFisica;
		if (getAnuallncome() < 20000.0) {
			impostoPFisica = getAnuallncome() * 0.15;
		} else {
			impostoPFisica = getAnuallncome() * 0.25;
		}

		impostoPFisica -= getHealthExpenditures() * 0.5;

		return impostoPFisica;
	}

	// expressão condicional termaria
	// double impostoPFisica = (getAnuallncome() < 20000.0) ? getAnuallncome() *
	// 0.15 : getAnuallncome() * 0.25;
}
