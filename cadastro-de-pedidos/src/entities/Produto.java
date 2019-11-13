package entities;

public class Produto {
	private String nome;
	private double preco;

	/* Construtor */
	public Produto(String nome, double preco) {
		this.nome = nome;
		this.preco = preco;
	}

	/* Getters */
	public String getnome() {
		return nome;
	}

	public double getPreco() {
		return preco;
	}

	/* toString() */
	public String toString() {
		return nome + ", R$" + preco;
	}
}
