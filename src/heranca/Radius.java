package heranca;

import entities.enums.Color;

public class Radius extends Shapee {

	private Double radius;

	public Radius() {
		super();
	}

	public Radius(Color color, Double radius) {
		super(color);
		this.radius = radius;
	}

	public Double getRaius() {
		return radius;
	}

	public void setRaius(Double radius) {
		this.radius = radius;
	}

	@Override
	public double area() {
		return Math.PI * radius * radius;
	}

}
