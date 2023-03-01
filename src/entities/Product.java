package entities;

public class Product {

	public String name;
	public double price;
	public int quantity;

	// Construtores

	public Product() {

	}

	public Product(String name, double price, int quantity) {
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}

	public Product(String name, double price) {
		this.name = name;
		this.price = price;
	}

	// Metados
	public double totalValueinStock() {
		double valor = price * quantity;
		return valor;
	}

	public void addProdutcts(int quantity) {
		this.quantity += quantity;
	}

	public void removeProducts(int quantidade) {
		quantity -= quantidade;
	}

	// ToStrig para converter para String
	@Override
	public String toString() {
		return name + ", " + "$ " + String.format("%.2f", price) + ", " + +quantity + " Units, Total: $"
				+ String.format("%.2f", totalValueinStock());
	}

}
