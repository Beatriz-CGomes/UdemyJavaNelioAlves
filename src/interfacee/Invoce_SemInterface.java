package interfacee;

public class Invoce_SemInterface {
	
	private Double basicPayment;
	private Double tax;

	public Invoce_SemInterface() {
	}
	
	public Invoce_SemInterface(Double basicPayment, Double tax) {
		this.basicPayment = basicPayment;
		this.tax = tax;
	}

	public Double getBasicPayment() {
		return basicPayment;
	}

	public void setBasicPayment(Double basicPayment) {
		this.basicPayment = basicPayment;
	}

	public Double getTax() {
		return tax;
	}

	public void setTax(Double tax) {
		this.tax = tax;
	}

	public double getTotalPayment() {
		return getBasicPayment() - getTax();
	}

}
