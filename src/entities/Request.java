package entities;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import entities.enums.RequestStatus;

public class Request {

	private static final SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

	private Date moment;
	private RequestStatus status;

	private RequestClient client;
	private List<RequestItem> items = new ArrayList<>();

	public Request() {

	}

	public Request(Date moment, RequestStatus status, RequestClient client) {
		this.moment = moment;
		this.status = status;
		this.client = client;
	}

	public Date getMoment() {
		return moment;
	}

	public void setMoment(Date moment) {
		this.moment = moment;
	}

	public RequestStatus getStatus() {
		return status;
	}

	public void setStatus(RequestStatus status) {
		this.status = status;
	}

	public RequestClient getClient() {
		return client;
	}

	public void setClient(RequestClient client) {
		this.client = client;
	}

	public List<RequestItem> getItem() {
		return items;
	}

	public void addItem(RequestItem item) {
		items.add(item);
	}

	public void removeItem(RequestItem item) {
		items.remove(item);
	}

	public double total() {
		double soma = 0;
		for (RequestItem item : items) {
			soma += item.subTotal();
		}
		return soma;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Order moment: ");
		sb.append(sdf.format(moment) + "\n");
		sb.append("Order Status: ");
		sb.append(status + "\n");
		sb.append("Client: ");
		sb.append(client + "\n");
		sb.append("Order Items: " + "\n");
		for (RequestItem item : items) {
			sb.append(item + "\n");
		}

		sb.append("Total Price: ");
		sb.append(total());
		return sb.toString();
	}

}
