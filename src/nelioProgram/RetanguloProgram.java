package nelioProgram;

import java.util.Scanner;

import nelioEntites.Retangulo;

public class RetanguloProgram {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		Retangulo re = new Retangulo();

		System.out.println("Entre com altura e largura");
		re.altura = sc.nextDouble();
		re.largura = sc.nextDouble();

		System.out.println("Area = " + re.are());
		System.out.println("Perimetro = " + re.perimetro());
		System.out.println("Diagonal = " + re.diagonal());

		sc.close();

	}

}
