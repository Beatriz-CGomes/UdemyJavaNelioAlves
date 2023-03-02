package VetoresEMatrizes;

import java.util.Scanner;

public class Exercicio_16 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("How many rooms will be rented? ");
		int number = sc.nextInt();

		String[] name = new String[number];
		String[] email = new String[number];
		int[] room = new int[number];

		for (int i = 0; i < number; i++) {
			System.out.println("Rent " + i);
			System.out.println("Name: ");
			name[i] = sc.next();

			System.out.println("Email");
			email[i] = sc.next();

			System.out.println("Room: ");
			room[i] = sc.nextInt();
		}

		System.out.println("Busy room:  ");
		
		for (int i = 0; i < number; i++) {
			System.out.println(room[i]);
			System.out.println(name[i]);
			System.out.println(email[i]);
		}

		sc.close();

	}

}
