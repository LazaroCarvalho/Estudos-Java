package entities;

public class ItemPedido {
	private int quantidade;
	private double preco;

	// Atributos do tipo Classe
	private Produto produto;

	/* Construtor */
	public ItemPedido(int quantidade, double preco, Produto produto) {
		this.quantidade = quantidade;
		this.preco = preco;
		this.produto = produto;
	}

	/* Getters */
	public int getQuantidade() {
		return quantidade;
	}

	public double getPreco() {
		return preco;
	}

	public Produto produto() {
		return produto;
	}

	/* toString() */
	public String toString() {
		return produto + ", " + "Quantidade: " + quantidade + ", Subtotal: R$" + subTotal();
	}

	/* Método que retorna o preço total dos itens */
	public double subTotal() {
		return quantidade * preco;
	}
}
