package entities;

public class Product {

	public String name;
	public double price;
	public int quantity;

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

	@Override
	public String toString() {
		return name + ", " + 
	"$ " + String.format("%.2f", price) + ", " 
				+  + quantity + " Units, Total: $"
				+ String.format("%.2f", totalValueinStock());
	}

}
