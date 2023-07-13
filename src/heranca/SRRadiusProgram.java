package heranca;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.enums.Color;

public class SRRadiusProgram {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the number of shapes:");
		int n = sc.nextInt();

		List<Shapee> list = new ArrayList<>();

		for (int i = 0; i < n; i++) {
			System.out.println("Shape # " + (i + 1) + " data: ");
			System.out.println("Rectangle or Circle (r/c)??");
			char resp = sc.next().charAt(0);

			System.out.println("Color (BLACK/BLUE/RED):");
			Color color = Color.valueOf(sc.next());

			if (resp == 'r') {
				System.out.print("Width:");
				double width = sc.nextDouble();

				System.out.println("Height");
				double height = sc.nextDouble();

				list.add(new Rectangle(color, width, height));

			} else {
				System.out.println("Radius");
				double radius = sc.nextDouble();

				list.add(new Radius(color, radius));

			}
		}

		System.out.println("SHAPE AREAS");
		for (Shapee shape : list) {
			System.out.println(String.format("%.2f", shape.area()));
		}

		sc.close();
	}
}
