package heranca;

public class EmployeeOutsource extends Employee {

	private Double additionalCharge;

	public EmployeeOutsource() {
	}

	public EmployeeOutsource(String name, Integer hours, Double valuePerHour, Double additionalCharge) {
		super(name, hours, valuePerHour);
		this.additionalCharge = additionalCharge;
	}

	public Double getAdditionalCharge() {
		return additionalCharge;
	}

	public void setAdditionalCharge(Double additionalCharge) {
		this.additionalCharge = additionalCharge;
	}

	@Override
	public double payment() {
		additionalCharge =  additionalCharge *  110 / 100;
		return additionalCharge + super.payment();
	}


	
}
