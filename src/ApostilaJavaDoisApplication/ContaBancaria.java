package ApostilaJavaDoisApplication;

import java.util.Scanner;

import ApostilaJavaDoisEntities.ContaCorrente;

public class ContaBancaria {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		ContaCorrente conta = new ContaCorrente();

		System.out.println("Quantas contas você deseja cadastrar?");
		int n = sc.nextInt();

		char resp2 = 0, resp = 0;

		for (int i = 0; i < n; i++) {
			System.out.println("Número da conta: ");
			int numberoConta = sc.nextInt();

			System.out.println("Nome: ");
			sc.nextLine();
			String nome = sc.nextLine();

			System.out.println("Saldo");
			double saldo = sc.nextDouble();

			conta = new ContaCorrente(numberoConta, nome, saldo);
		}

		System.out.println("Você quer fazer um deposito (y/n)?: ");
		char response = sc.next().charAt(0);

		if (response == 'y') {
			System.out.println("Entre com deposito: ");
			double deposito = sc.nextDouble();
			conta.deposito(deposito);
		}

		System.out.println("Você quer fazer um saque (y/n)?: ");
		char respon = sc.next().charAt(0);

		if (response == 'y') {
			System.out.println("Entre com valor do saque: ");
			double saque = sc.nextDouble();
			conta.saque(saque);
		}

		System.out.println("Você quer alterar o nome (y/n)?: ");
		char res = sc.next().charAt(0);

		if (res == 'y') {
			System.out.println("Digite o novo nome ");
			sc.nextLine();
			String novoNome = sc.nextLine();
			conta.alterarNome(novoNome);
		}

		System.out.println(conta);
	}

}
