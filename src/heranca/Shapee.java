package heranca;

import entities.enums.Color;

public abstract class Shapee {

	private Color color;

	public Shapee() {
	}

	public Shapee(Color color) {
		this.color = color;
	}

	public Color getColor() {
		return color;
	}

	public void setColor(Color color) {
		this.color = color;
	}

	public abstract double area();

}
