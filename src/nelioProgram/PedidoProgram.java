package nelioProgram;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import nelioEntites.Pedido;
import nelioEntites.PedidoCliente;
import nelioEntites.PedidoItem;
import nelioEntites.PedidoProduto;
import nelioEnum.PedidoStatus;

public class PedidoProgram {

	public static void main(String[] args) throws ParseException {
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("DD/MM/YYYY");

		// passo 1 - dados do cliente
		System.out.println("Entrar dados Cliente: ");
		System.out.print("Nome: ");
		String nome = sc.nextLine();
		// sc.nextLine();
		System.out.print("Email");
		String email = sc.nextLine();
		System.out.println("Data de Aniversário (DD/MM/YYYY)");
		Date dataNascimento = sdf.parse(sc.next());

		PedidoCliente cliente = new PedidoCliente(nome, email, dataNascimento);

		// passo dois - dados do pedido
		System.out.println("Entrar com dados do Pedido: ");
		System.out.println("Status: ");
		PedidoStatus status = PedidoStatus.valueOf(sc.next());

		// aqui estamos instaciando um pedido associado ao cliente
		Pedido pedido = new Pedido(new Date(), status, cliente);

		// passo 3 - quantidade de produtos cadastrados
		System.out.println("Quantos produtos foram comprados? ");
		int n = sc.nextInt();

		for (int i = 1; i <= n; i++) {
			System.out.println("Enter #" + i + " pedido:");
			System.out.print("Nome do Produto: ");
			sc.nextLine();
			String produtoNome = sc.nextLine();
			System.out.print("Preco do Produto: ");
			double produtoPreco = sc.nextDouble();

			System.out.println("Quantidade: ");
			int quantidade = sc.nextInt();

			PedidoProduto produto = new PedidoProduto(produtoNome, produtoPreco);
			PedidoItem item = new PedidoItem(quantidade, produtoPreco, produto);
			// associando um item de produto a um produto

			pedido.addItem(item); // adicionado o item no pedido
		}

		System.out.println();
		System.out.println(pedido);
		sc.close();

		
	}

}
