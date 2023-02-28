package application;

import java.util.Scanner;

import entities.Rectangle;

public class ProgramRectangle {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Rectangle re = new Rectangle();
		
		System.out.println("Enter rectangle ");
		System.out.println("Widht: ");
		re.width = sc.nextDouble();
		
		System.out.println("height: ");
		re.height = sc.nextDouble();
		
		System.out.println("Area = " + re.area());
		System.out.println("Perimeter = " + re.perimeter());
		System.out.println("Diagonal = " + re.diagonal());
		
		sc.close();

	}

}
 