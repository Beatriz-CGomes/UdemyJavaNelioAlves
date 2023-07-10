package nelioProgram;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import nelioEntites.Listas;

public class ListasProgram {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		List<Listas> lista = new ArrayList<>();

		System.out.println("Quantas pessoas serão registradas? ");
		int n = sc.nextInt();

		for (int j = 0; j < n; j++) {
			System.out.println("Funcionarios #" + (j + 1));
			System.out.println("id: ");
			Integer id = sc.nextInt();
			sc.nextLine();

			System.out.println("Nome: ");
			String nome = sc.nextLine();

			System.out.println("Salário: ");
			Double salario = sc.nextDouble();

			Listas listas = new Listas(id, nome, salario);
			lista.add(listas);
		}

		System.out.println();
		System.out.println("Entra com id do salario que receberá um acrescimo");
		int id = sc.nextInt();
		Listas listas = lista.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
		if (listas == null) {
			System.out.println("Id não existe!");
		} else {
			System.out.println("Encontre com valor da porcentagem: ");
			double p = sc.nextDouble();
			listas.incrementoSalario(p);
		}

		System.out.println("Lista de Funcionários: ");
		// (Tipo que foi usado na minha arraylist - O LISTA (que foi o nome da minha
		// classe)
		// O apelido que estou dando a minha lista
		// aqui é o nome que dei a minha arraylista que foi de LISTA
		for (Listas listasF : lista) {
			System.out.println(listasF);
		}
		sc.close();
	}

}
