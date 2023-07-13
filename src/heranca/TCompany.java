package heranca;

public class TCompany extends TaxPayer {

	private Integer numberOfEmployees;

	public TCompany() {
	}

	public TCompany(String name, Double anuallncome, Integer numberOfEmployees) {
		super(name, anuallncome);
		this.numberOfEmployees = numberOfEmployees;
	}

	public Integer getNumberOfEmployees() {
		return numberOfEmployees;
	}

	public void setNumberOfEmployees(Integer numberOfEmployees) {
		this.numberOfEmployees = numberOfEmployees;
	}

	@Override
	public double tax() {
		double impostoPJuridica;
		if (numberOfEmployees >= 10) {
			impostoPJuridica = getAnuallncome() * 0.14;
		} else {
			impostoPJuridica = getAnuallncome() * 0.16;
		}

		return impostoPJuridica;
	}

}
