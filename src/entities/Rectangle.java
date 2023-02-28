package entities;

public class Rectangle {

	public double width;
	public double height;

	public double area() {
		return width * height;
	}

	public double perimeter() {
		double soma = width + width + height + height;
		return soma;
	}

	public double diagonal() {
		double d = Math.sqrt((width * width) + (height * height));
		return d;
	}
}
