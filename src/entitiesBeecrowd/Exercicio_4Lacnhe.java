package entitiesBeecrowd;

public class Exercicio_4Lacnhe {

	public double price;
	public int quantity;

	public Exercicio_4Lacnhe() {

	}

	public Exercicio_4Lacnhe(double price, int quantity) {
		super();
		this.price = price;
		this.quantity = quantity;
	}

	
	public double getPrice() {
		return price;
	}

	public int getQuantity() {
		return quantity;
	}

	public double newPrice() {
		return price * quantity;
	}

	@Override
	public String toString() {
		return "TOTAL: R$ " + String.format("%.2f", newPrice());
	}

	
	
	
	
}
