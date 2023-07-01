package ApostilaJavaUm;

import java.util.Scanner;

public class Exercicio28 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		double salarioNovo = 0, valorReajuste = 0;

		for (int i = 0; i < 3; i++) {
			System.out.println("Nome: ");
			String nome = sc.next();
			sc.nextLine();

			System.out.println("Salário: ");
			double salario = sc.nextDouble();

			System.out.println("Salário Minimo: ");
			double salarioMinimo = sc.nextDouble();

			System.out.println("/tREAJUSTE EMPRESARIAL");
			System.out.println(" 1 - 50% - GANHAM MENOS DE 10 SALARIOS MINIMOS");
			System.out.println(" 2 - 20% - GANHAM DE 3 ATÉ 10 SALARIOS MINIMOS");
			System.out.println(" 3 - 15% - GANHAM ACIMA DE 10 SALARIOS MINIMOS");
			System.out.println(" 4 - 10% - PARA OS DEMAIS FUNCIONARIOS");
			System.out.println(" 5 - PARA SAIR DO SISTEMA!");
			System.out.println("");
			System.out.println("Entre com a opção correta");
			int op = sc.nextInt();

			switch (op) {
			case 1:
				valorReajuste = salario * 0.50;
				salarioNovo = salario + valorReajuste;
				break;

			case 2:
				valorReajuste = valorReajuste * 0.20;
				salarioNovo = salario + valorReajuste;
				break;

			case 3:
				valorReajuste = valorReajuste * 0.15;
				salarioNovo = salario + valorReajuste;
				break;

			case 4:
				valorReajuste = valorReajuste * 0.10;
				salarioNovo = salario + valorReajuste;
				break;

			case 5:
				System.out.println("Sistema encerrado");
				sc.close();
				System.exit(0);
				break;

			default:
				System.out.println("Opção Invalida!");
				break;

			}
		
		System.out.println("***********************************");
		System.out.println("Funcionario:  " + nome + 
				" O rejuste da empresa foi: " + valorReajuste + 
				" seu salário foi reajustado para: " + salarioNovo);
		System.out.println("***********************************");
		
		}
	
	
	
	
	}

}
