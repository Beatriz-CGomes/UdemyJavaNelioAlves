package nelioEntites;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import nelioEnum.PedidoStatus;

public class Pedido {

	private static SimpleDateFormat sdf = new SimpleDateFormat("DD/MM/YYYY");

	private Date momento;
	private PedidoStatus status;

	private PedidoCliente cliente;
	private List<PedidoItem> item = new ArrayList<>();

	public Pedido() {
	}

	public Pedido(Date momento, PedidoStatus status, PedidoCliente cliente) {
		this.momento = momento;
		this.status = status;
		this.cliente = cliente;
	}

	public Date getMomento() {
		return momento;
	}

	public void setMomento(Date momento) {
		this.momento = momento;
	}

	public PedidoStatus getStatus() {
		return status;
	}

	public void setStatus(PedidoStatus status) {
		this.status = status;
	}

	public PedidoCliente getCliente() {
		return cliente;
	}

	public void setCliente(PedidoCliente cliente) {
		this.cliente = cliente;
	}

	public void addItem(PedidoItem item) {
		this.item.add(item);
	}

	public void removerItem(PedidoItem item) {
		this.item.remove(item);
	}

	public double total() {
		double soma = 0;
		for (PedidoItem itens : item) {
			soma += itens.subTotal();
		}

		return soma;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Pedido: ");
		sb.append(sdf.format(momento) + "\n");
		sb.append("Status do pedido: ");
		sb.append(status + "\n");
		sb.append("Cliente: ");
		sb.append(cliente + "\n");
		sb.append("Lista de pedidos: ");
		for (PedidoItem itens : item) {
			sb.append(itens + "\n");
		}
		sb.append("Total do pedido R$");
		sb.append(String.format("%.2f", total()));
		return sb.toString();

	}

}
