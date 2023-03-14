package entities;

public class RequestItem {

	private Integer quantity;
	private Double price;

	private RequestProduct products;

	public RequestItem() {

	}

	public RequestItem(Integer quantity, Double price, RequestProduct products) {
		super();
		this.quantity = quantity;
		this.price = price;
		this.products = products;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public RequestProduct getProducts() {
		return products;
	}

	public void setProducts(RequestProduct products) {
		this.products = products;
	}

	public double subTotal() {
		return quantity * price;
	}

	@Override
	public String toString() {
		return products.getName() + ", R$ " +
	String.format("%.2f", price) + 
	" Quantity, " + quantity + 
	" SubtTotal:  R$" +  String.format("%.2f", subTotal()); 
	}
	
	
	
	
}
