package entities;

public class TaxPayerIndividual extends TaxPayer {

	private Double heathExpenditures;

	public TaxPayerIndividual() {
		super();
	}

	public TaxPayerIndividual(String name, Double anuallncome, Double heathExpenditures) {
		super(name, anuallncome);
		this.heathExpenditures = heathExpenditures;
	}

	public Double getHeathExpenditures() {
		return heathExpenditures;
	}

	public void setHeathExpenditures(Double heathExpenditures) {
		this.heathExpenditures = heathExpenditures;
	}

	@Override
	public double tax() {
		if (getAnuallncome() < 2000) {
			return getAnuallncome() * 0.15 - getHeathExpenditures() * 0.50;
		} else {
			return getAnuallncome() * 25 / 100 - getHeathExpenditures() * 50 / 100;
		}

	}

}
