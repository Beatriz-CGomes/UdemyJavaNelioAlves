package interfacee;

public class BrazilTaxService_SemInterface {

	public double tax(double amount) {
		if (amount <= 100.00) {
			return amount * 0.20;
		} else {
			return amount * 0.15;
		}
	}

}
