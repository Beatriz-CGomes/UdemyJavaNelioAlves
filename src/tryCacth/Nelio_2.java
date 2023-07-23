package tryCacth;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Nelio_2 {

	public static void main(String[] args) {

		// method2();
		method1();

		System.out.println("Fim do programa!");
	}

	public static void method1() {
		System.out.println("***** METHOD1 START **** ");

		method2();
		System.out.println("***** METHOD1 end **** ");

	}

	public static void method2() {
		System.out.println("***** METHOD2 START **** ");
		Scanner sc = new Scanner(System.in);
		try {
			String[] vect = sc.nextLine().split(" ");
			int position = sc.nextInt();
			System.out.println(vect[position]);

		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Posição Invalida!");

			// AQUI ESTÁ MOSTRANDO O ERRO E A CAMADA DOS ERROS
			// e.printStackTrace();
			// sc.next();
		} catch (InputMismatchException e) {
			System.out.println("Erro de Input!");
		}
		System.out.println("***** METHOD2 end **** ");
		sc.close();
	}

}
