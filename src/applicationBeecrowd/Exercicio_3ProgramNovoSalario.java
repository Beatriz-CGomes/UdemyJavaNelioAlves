package applicationBeecrowd;

import java.util.Scanner;

import entitiesBeecrowd.Exercicio_3NovoSalario;

public class Exercicio_3ProgramNovoSalario {

	public static void main(String[] args) {
		// BEE 1048 - Respondedo com metado
		Scanner sc = new Scanner(System.in);

		Exercicio_3NovoSalario novo = new Exercicio_3NovoSalario();

		System.out.println("TABELA DE REAJUSTE SALARIAL ");
		System.out.println("0 a 400  -- 15% ");
		System.out.println("400.01 a 80000  -- 12 %");
		System.out.println("800.01 a 1.200,00 -- 10% ");
		System.out.println("1.2000.01 a 2.000,00 -- 7 %");
		System.out.println("Acima 2000.01 -- 4 %");
		System.out.println();
		System.out.println("Verifique a porcentagem correta correspondete ao seu salário: ");
		System.out.println();
		System.out.println();
		System.out.println("-------------------------------------------------");

		System.out.println("Entre com seu salario ");
		novo.salary = sc.nextDouble();

		System.out.println("Entre com a porcentagem: ");
		novo.porcentagem = sc.nextDouble();

		System.out.println(novo);

		sc.close();

	}

}
