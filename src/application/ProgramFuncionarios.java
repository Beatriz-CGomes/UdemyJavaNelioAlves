package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.Funcionarios;
import entities.FuncionariosTercerizados;

public class ProgramFuncionarios {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		List<Funcionarios> list = new ArrayList<>();
		Funcionarios fun;

		char res;

		System.out.println("Entre com o números de funcionários: ");
		int n = sc.nextInt();

		for (int i = 0; i < n; i++) {
			System.out.println("Funcionários #" + (i + 1) + " data: ");

			System.out.println("Tercerizado  (y/n) ? ");
			res = sc.next().charAt(0);

			System.out.print("Nome: ");
			sc.nextLine();
			String nome = sc.nextLine();

			System.out.print("Hora: ");
			int hora = sc.nextInt();

			System.out.print("Valor Por Hora: ");
			double valorPorHora = sc.nextDouble();

			if (res == 'y') {
				System.out.println("Taxa adicional: ");
				double addCobraça = sc.nextDouble();
				fun = new FuncionariosTercerizados(nome, hora, valorPorHora, addCobraça);
				list.add(fun);
			} else {
				fun = new Funcionarios(nome, hora, valorPorHora);
				list.add(fun);
			}

		}
		System.out.println();
		System.out.println("Pagamentos: ");
		for (Funcionarios funcio : list) {
			System.out.println(funcio.getNome() + " - R$ " + String.format("%.2f", funcio.pagamento()));

		}

		sc.close();

	}

}
