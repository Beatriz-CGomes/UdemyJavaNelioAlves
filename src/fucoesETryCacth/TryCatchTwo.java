package fucoesETryCacth;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TryCatchTwo {

	public static void main(String[] args) {

		method1();
		System.out.println("End of program");
	}

	public static void method1() {
		System.out.println("**** METHODO1 START ****");
		method2();

		System.out.println("**** METHODO1 END ****");
	}

	public static void method2() {
		System.out.println("**** METHODO2 START ****");
		Scanner sc = new Scanner(System.in);

		try {

			String[] vect = sc.nextLine().split(" ");
			int position = sc.nextInt();
			System.out.println(vect[position]);
		}

		catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Invalide position!");
			e.printStackTrace();
			sc.next();
		}

		catch (InputMismatchException e) {
			System.out.println("Input error");
		}
		sc.close();
		System.out.println("**** METHODO2 END ****");
	}

}
