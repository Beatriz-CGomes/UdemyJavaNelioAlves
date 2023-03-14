package beecrowd;

import java.util.Scanner;

public class Exercicio_11 {

	public static void main(String[] args) {
		// ABELHA 1114
		Scanner sc = new Scanner(System.in);
		int senha;

		do {
			System.out.println("Digite a sua senha");
			senha = sc.nextInt();
			sc.nextLine();

			if (senha == 2002) {
				System.out.println("Acesso Permitido");
			} else {
				System.out.println("Senha Invalida");
			}

		} while (senha != 2002);

		sc.close();
	}

}
