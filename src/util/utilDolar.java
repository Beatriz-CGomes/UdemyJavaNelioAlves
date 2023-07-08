package util;

public class utilDolar {

	static double valorD = 0;
	public static double IOF = 0.06;

	public static double dolares(double dolar, double dolarComprado) {
		valorD = dolar * dolarComprado;
		return valorD;
	}

	public static double dolaresTotal() {
		double valorT = (valorD * IOF) + valorD;
		return valorT;
	}

}
