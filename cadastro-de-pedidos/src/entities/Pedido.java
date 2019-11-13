package entities;

import java.util.ArrayList;
import java.util.Date;

import enums.StatusPedido;

public class Pedido {
	private Date momento;
	private StatusPedido status;

	public ArrayList<ItemPedido> itensDePedido = new ArrayList<>();

	// Construtor
	public Pedido(Date momento, StatusPedido status) {
		this.momento = momento;
		this.status = status;
	}

	// Getters e Setters
	public Date getMomento() {
		return momento;
	}

	public StatusPedido getStatus() {
		return status;
	}

	// Métodos
	public ArrayList<ItemPedido> getItensDePedido() {
		return itensDePedido;
	}
	
	public void addItem(ItemPedido item) {
		itensDePedido.add(item);
	}

	public void removeitem(ItemPedido item) {
		itensDePedido.remove(item);
	}

	public double total() {
		double total = 0;
		for (ItemPedido x : itensDePedido) {
			total = total + x.subTotal();
		}
		return total;
	}
}
