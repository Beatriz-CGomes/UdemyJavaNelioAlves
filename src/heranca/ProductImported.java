package heranca;

import java.text.SimpleDateFormat;

public class ProductImported extends Product {

	private Double customsFee;

	public ProductImported() {
	}

	public ProductImported(String name, Double price, Double customsFee) {
		super(name, price);
		this.customsFee = customsFee;
	}

	public Double getCustomsFee() {
		return customsFee;
	}

	public void setCustomsFee(Double customsFee) {
		this.customsFee = customsFee;
	}

	public double totalPrice() {
		return getPrice() + customsFee;
	}

	@Override
	public String priceTag() {
		return getName() + " " + String.format("%.2f", totalPrice()) + " (Customs fee: R$ "
				+ String.format("%.2f", customsFee);
	}

}
