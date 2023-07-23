package tryCacth;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Nelio_1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		try {
			String[] vect = sc.nextLine().split(" ");
			int position = sc.nextInt();
			System.out.println(vect[position]);

		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Posição Invalida!");
		} catch (InputMismatchException e) {
			System.out.println("Erro de Input!");
		}

		System.out.println("Fimd o programa!");

		sc.close();

	}

}
