package entities;

public class MercadoriaImportada extends Mercadoria {

	private Double customFee;

	public MercadoriaImportada() {
		super();
	}

	public MercadoriaImportada(String name, Double price, Double customFee) {
		super(name, price);
		this.customFee = customFee;
	}

	public Double getCustomFee() {
		return customFee;
	}

	public void setCustomFee(Double customFee) {
		this.customFee = customFee;
	}

	public double totalPrice() {
		return getPrice() + customFee;
	}

	@Override
	public String priceTag() {
		return getName() + ":  R$ " + String.format("%.2f", totalPrice()) + " (Customs fee: $ "
				+ String.format("%.2f", customFee) + ")";
	}
}
