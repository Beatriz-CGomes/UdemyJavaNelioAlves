package EstrturaCondicional;

import java.util.Scanner;

public class Exercicio8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//Em um país imaginário denominado Lisarb, todos os habitantes ficam felizes em pagar seus impostos, 
// pois sabem que nele não existem políticos corruptos e os recursos arrecadados são utilizados em 
// benefício da população, sem qualquer desvio. A moeda deste país é o Rombus, cujo símbolo é o R$.
// Leia um valor com duas casas decimais, equivalente ao salário de uma pessoa de Lisarb. 
		// Em seguida, calcule e mostre o valor que esta pessoa deve pagar de Imposto de
		// Renda,
		// segundo a tabela abaixo.

		Scanner sc = new Scanner(System.in);

		int op;
		float salario, somaImposto;
		System.out.println("/tTabela de imposto");

		System.out.println("Entre com valor do salário");
		salario = sc.nextFloat();

		System.out.println("Tabela de porcentagem do imposto de renda");
		System.out.println("1 - de R$0,00 a R$ 2.000,OO - Isento");
		System.out.println("2 - de R$2.000,01 a R$ 3.000,00 - 8%");
		System.out.println("3 - de R$ 3.000,01 a R$ 4.500,00 - 18%");
		System.out.println("4 - Acima de R$ 4.500,00 - 28%");
		op = sc.nextInt();

		switch (op) {
		case 1:
			if (salario <= 2000) {
				System.out.println("Isento");
			}
			break;

		case 2:
			if (salario > 2000 && salario <= 3000) {
				somaImposto = (salario - 2000) * 8 / 100;
				System.out.println("R$ " + somaImposto);
			}
			break;
		case 3:
			if (salario > 3000 && salario <= 4500) {
				somaImposto = (salario - 3000) * 18 / 100 + 1000 * 8 / 100;
				System.out.println("R$ " + somaImposto);
			}
			break;
		case 4:
			if (salario > 4500) {
				somaImposto = (salario - 4500) * 28 / 100 + 1500 * 18 / 100 + 1000 * 8 / 100;
				System.out.println("R$ " + somaImposto);
			}
			break;
		default:
			System.out.println("Opção invalida!!");
			break;
		}
		sc.close();
	}

}
