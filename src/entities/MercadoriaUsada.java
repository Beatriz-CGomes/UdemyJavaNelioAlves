package entities;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class MercadoriaUsada extends Mercadoria {

	private LocalDate manuDate;

	public MercadoriaUsada() {
		super();
	}
	
	public MercadoriaUsada(String name, Double price, LocalDate manuDate) {
		super(name, price);
		this.manuDate = manuDate;
	}


	public LocalDate getManuDate() {
		return manuDate;
	}

	public void setManuDate(LocalDate manuDate) {
		this.manuDate = manuDate;
	}

	@Override
	public String priceTag() {
		return getName() + ": R$ " + String.format("%.2f", getPrice()) + " ManuDate date:  "
				+ manuDate.format(DateTimeFormatter.ofPattern("dd/MM/yyyy"));

	}

}
