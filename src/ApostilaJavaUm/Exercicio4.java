package ApostilaJavaUm;

import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double somaTotal;
		double comissaoP = 0.15;

		System.out.println("Entre com Nome do funcionário: ");
		String nome = sc.nextLine();
		System.out.println("Entre com Salário do funcionário: ");
		double salario = sc.nextDouble();
		System.out.println("Entre com Comissão do funcionário: ");
		double comissao = sc.nextDouble();

		somaTotal = (comissao * comissaoP) + salario;

		System.out.println("Nome " + nome + " Salário Fixo: " + salario + " Salário na folha " + somaTotal);

		sc.close();

	}

}
