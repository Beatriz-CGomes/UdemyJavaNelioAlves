package projetoLivrariaDoceLar;

import java.io.IOException;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Menu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		List<String> meusLivros = new ArrayList<String>();

		int opcao;
		String nomeLivro;

		while (true) {

			System.out.println("\t----------------------------------------");
			System.out.println("\tPROJETO LIVRARIA -- LIVRARIA DOCE LAR");
			System.out.println("\t");
			System.out.println("\t\tDigite a op��o desejada: ");
			System.out.println("\t");
			System.out.println("\t 1 - Cadastrar Livros  ");
			System.out.println("\t 2 - Listar todos os Livros  ");
			System.out.println("\t 3 - Alterar Livros  ");
			System.out.println("\t 4 - Deletar Livros  ");
			System.out.println("\t 5 - Buscar Livro por nome ");
			System.out.println("\t 6 - Sair  ");
			System.out.println("\t----------------------------------------");
			System.out.println("\t         ");
			System.out.println("\t         ");

			// fazendo um tratamento de erro caso digite um valor invalido!
			try {
				opcao = sc.nextInt();
			} catch (InputMismatchException e) {
				System.err.println("Digite apenas valores inteiros");
				sc.nextLine();

				opcao = 0;
			}

			// caso a op��o digitada seja a 9 o sistema ir� sair automaticamente
			if (opcao == 6) {
				System.out.println("\nLIVRARIA DOCE LAR - O SEU PLANEJAMENTO DE LEITURA COME�A AQUI!");
				sc.close();
				System.exit(0);
			}

			switch (opcao) {
			case 1:
				System.out.println("1 - Cadastrar Livros\n");
				sc.nextLine();

				System.out.println(" Digite o nome do Livro para ser cadastrado: ");
				nomeLivro = sc.nextLine();

				meusLivros.add(nomeLivro);

				keyPress();
				break;

			case 2:
				System.out.println("2 - Listar Livros\n");
				sc.nextLine();

				if (meusLivros.isEmpty()) {
					System.out.println("Estante de Livros VAZIA!");
				} else {
					System.out.println(meusLivros);
				}

				keyPress();
				break;

			case 3:
				System.out.println("3 - Alterar Livros\n");
				sc.nextLine();

				System.out.println("Digite o nome do livro que voc� deseja alterar: ");
				nomeLivro = sc.nextLine();

				System.out.println("Digite o nome atualizado");
				String novoNome = sc.nextLine();
				if (meusLivros.contains(nomeLivro)) {
					meusLivros.remove(nomeLivro);
					meusLivros.add(novoNome);
				} else {
					System.out.println("Livro n�o cadastrado!");
				}

				keyPress();
				break;

			case 4:
				System.out.println("4 - Deletar Livros\n");
				sc.nextLine();

				System.out.println(" Digite o nome do Livro que voc� deseja deletar: ");
				nomeLivro = sc.nextLine();

				if (meusLivros.contains(nomeLivro)) {
					meusLivros.remove(nomeLivro);

				} else {
					System.out.println("Livro inexistente ");
				}

				keyPress();
				break;

			case 5:
				System.out.println("5 - Buscar Livros\n");
				sc.nextLine();

				keyPress();
				break;

			default:
				System.out.println("Op��o Invalida! Tente novamente");
				sc.nextLine();

				keyPress();
				break;

			}

		}
	}

	// utilizado para tornar o menu mais dinamico, pressionando o entrer para
	// continuar a interagir com sistema.
	public static void keyPress() {
		try {
			System.out.println("\nPressione a tecla Enter para Continuar a utilizar nosso servi�o...\n");
			System.in.read();
		} catch (IOException e) {
			System.out.println("Utilize a tecla Enter para continuar!");
		}
	}

}
