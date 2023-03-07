package beecrowd;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Exercicio_9 {

	public static void main(String[] args) {
		// Exercicios para treinar collections

		Scanner sc = new Scanner(System.in);

		ArrayList<String> cursos = new ArrayList<>();

		int op;
		do {
			System.out.println("-------------------------");
			System.out.println(" TABELA COLLECTIONS ");
			System.out.println("1 - Desejar incluir um curso na lista: ");
			System.out.println("2 - Deseja excluir um curso da lista: ");
			System.out.println("3 - Deseja Editar um curso da lista: ");
			System.out.println("4 - Deseja listar os cursos : ");
			System.out.println("5 - Deseja sair: ");
			System.out.println("** Entre com a opção desejada **");
			System.out.println("-------------------------");

			op = sc.nextInt();

			switch (op) {
			case 1:
				sc.nextLine();
				System.out.println("Nome para cadastro: ");
				sc.skip("\\R?");
				String name = sc.nextLine();
				cursos.add(name);
				break;

			case 2:
				sc.nextLine();
				System.out.println("Digite o nome do curso que deseja deletar: ");
				String nomeDelete = sc.nextLine();
				if (cursos.contains(nomeDelete)) {
					cursos.remove(nomeDelete);
				} else {
					System.out.println("Curso não contém na lista! ");
				}
				break;
			case 3:
				sc.nextLine();
				System.out.println("Digite o nome do curso que você deseja editar:");
				String editar = sc.nextLine();
				System.out.println("Digite o nome do curso que entrará no lugar: " + editar);
				String novoNome = sc.nextLine();
				if (cursos.contains(editar)) {
					cursos.remove(editar);
					cursos.add(novoNome);
				} else {
					System.out.println("Erro!! ");
				}
				break;

			case 4:
				sc.nextLine();
				System.out.println("Lista com todos os nossos Cursos: ");
				Collections.sort(cursos);
				System.out.println(cursos);
				break;

			case 5:
				System.out.println("Muito obrigada por escolher nossos cursos! ");
				sc.close();
				System.exit(0);
				break;
			default:
				System.out.println("Essa opção não exste");
				break;

			}
		} while (op != 5);
	}

}
