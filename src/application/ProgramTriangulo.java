package application;

import java.util.Scanner;
import entities.Triangulo;

public class ProgramTriangulo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		Triangulo x, y;
		x = new Triangulo();
		y = new Triangulo();

		System.out.println("Entre com valor de xA");
		x.a = sc.nextDouble();

		System.out.println("Entre com valor de xB");
		x.b = sc.nextDouble();

		System.out.println("Entre com valor de xC");
		x.c = sc.nextDouble();

		System.out.println("Entre com valor de yA");
		y.a = sc.nextDouble();

		System.out.println("Entre com valor de yB");
		y.b = sc.nextDouble();

		System.out.println("Entre com valor de yC");
		y.c = sc.nextDouble();

		double areaX = x.area();

		double areaY = y.area();

		System.out.printf("Triangulo X area: %.4f%n", areaX);
		System.out.printf("Triangulo Y area: %.4f%n", areaY);

		if (areaX > areaY) {
			System.out.println("Área X é maior " + areaX);
		} else {
			System.out.println("Área Y é maior " + areaY);
		}

		sc.close();

	}

}
