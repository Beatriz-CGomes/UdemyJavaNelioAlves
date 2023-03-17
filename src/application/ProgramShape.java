package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.Shape;
import entities.ShapeCircle;
import entities.ShapeRectangle;
import entities.enums.Color;

public class ProgramShape {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		List<Shape> list = new ArrayList<>();

		System.out.println("Enter the number of shapes: ");
		int numero = sc.nextInt();

		for (int i = 0; i < numero; i++) {
			System.out.println("Shape # " + (i + 1) + " data: ");
			System.out.print("Rectangle or Circle (r/c)? ");
			char resposta = sc.next().charAt(0);

			System.out.println("Color (BLACK/BLUE/RED): ");
			Color color = Color.valueOf(sc.next());

			if (resposta == 'r') {
				System.out.print("Width: ");
				double Width = sc.nextDouble();

				System.out.print("Height: ");
				double height = sc.nextDouble();

				list.add(new ShapeRectangle(color, Width, height));

			} else {
				System.out.println("Radius: ");
				double radius = sc.nextDouble();
				list.add(new ShapeCircle(color, radius));
			}

		}

		System.out.println();
		System.out.println("SHAPE AREAS");
		for (Shape shape : list) {
			System.out.println(String.format("%.2f", shape.area()));
		}

		sc.close();
	}

}
