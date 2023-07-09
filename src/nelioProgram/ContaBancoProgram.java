package nelioProgram;

import java.util.Scanner;

import nelioEntites.ContaBanco;

public class ContaBancoProgram {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		ContaBanco cB;
		System.out.println("Número conta");
		int numero = sc.nextInt();

		sc.nextLine();
		System.out.println("Titular da conta");
		String nome = sc.nextLine();

		System.out.println("Entrar com valor inicial? ('y' - sim / 'n' - não)");
		char resp = sc.next().charAt(0);

		if (resp == 'y' || resp == 'Y') {
			System.out.println("Entre com o valor: ");
			double valor = sc.nextDouble();

			cB = new ContaBanco(numero, nome, valor);
		} else {
			cB = new ContaBanco(numero, nome);
		}

		System.out.println();
		System.out.println(cB);

		 System.out.println("Entre para depositar o valor agora? ('y' - sim / 'n' - não)");
		 char resp2 = sc.next().charAt(0);

		 if (resp2 == 'y' || resp == 'Y') {
		System.out.println("Entre com o valor: ");
		double valor = sc.nextDouble();
		cB.depositar(valor);
		 } else {
		System.exit(0);
		 }

		System.out.println();
		System.out.println(cB);

		System.out.println("Entra com valor para retirar: ");
		double valor = sc.nextDouble();
		cB.retirar(valor);
		System.out.println();
		System.out.println(cB);

		sc.close();

	}

}
