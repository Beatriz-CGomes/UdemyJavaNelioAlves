package entities;

import entities.enums.Color;

public class ShapeCircle extends Shape{

	private double radius;
	
	public ShapeCircle() {
		super();
	}

	public ShapeCircle(Color color, double radius) {
		super(color);
		this.radius = radius;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	@Override
	public double area() {
		return Math.PI * radius * radius;
	}

	
}
