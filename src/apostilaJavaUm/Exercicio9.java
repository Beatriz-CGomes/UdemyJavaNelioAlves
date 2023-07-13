package apostilaJavaUm;

import java.util.Scanner;

public class Exercicio9 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		double soma;
		double jurosAoMes = 0.07;

		System.out.println("Valor depositado: ");
		double valorDepositado = sc.nextDouble();

		soma = (valorDepositado * jurosAoMes) + valorDepositado;

		System.out.println("Rendimento após 1 mês " + soma);

		sc.close();
	}

}
