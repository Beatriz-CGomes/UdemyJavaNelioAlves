package nelioEntites;

public class Produto {

	public String nome;
	public double preco;
	public int quantidade;

	public Produto() {
	}

	public double totalValorEmEstoque() {
		return preco * quantidade;
	}

	public void addProduto(int quantidade) {
		this.quantidade += quantidade;
	}

	public void removerProduto(int quantidade) {
		this.quantidade -= quantidade;
	}

	
	@Override
	public String toString() {
		return nome + ", R$" + String.format("%.2f", preco) + ", " + quantidade + " unidades, Total R$ "
				+ String.format("%.2f", totalValorEmEstoque()); 
	}

}
