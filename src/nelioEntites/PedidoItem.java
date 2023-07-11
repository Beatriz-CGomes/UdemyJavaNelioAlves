package nelioEntites;

public class PedidoItem {

	private Integer quantidade;
	private Double preco; // o preço repete aqui para caso o produto mudar o preço ainda está gravada no
							// sistema

	private PedidoProduto produto;

	public PedidoItem() {
	}

	public PedidoItem(Integer quantidade, Double preco, PedidoProduto produto) {
		this.quantidade = quantidade;
		this.preco = preco;
		this.produto = produto;
	}

	public Integer getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(Integer quantidade) {
		this.quantidade = quantidade;
	}

	public Double getPreco() {
		return preco;
	}

	public void setPreco(Double preco) {
		this.preco = preco;
	}

	public PedidoProduto getProduto() {
		return produto;
	}

	public void setProduto(PedidoProduto produto) {
		this.produto = produto;
	}

	public double subTotal() {
		return preco * quantidade;
	}

	@Override
	public String toString() {
		return getProduto().getNome() + " , R$" + String.format("%.2f", preco) + " , quantidade "
				+ quantidade + ", SubTotal R$" + String.format("%.2F", subTotal());

	}

}
