package util;

public class UtilCurrencyConverter {

	public static double IOF = 0.06;

	public static double dollarToReal(double dollar, double dollarBought) {
		double converte = dollar * dollarBought * (IOF + 1);
		return converte;
	}

}
