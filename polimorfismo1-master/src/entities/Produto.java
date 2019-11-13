// Classe genérica que contém as informações de um produto qualquer.
package entities;

public class Produto {
	private String nome;
	private Double preco;
	
	// Construtor
	public Produto() {
		
	}

	public Produto(String nome, Double preco) {
		this.nome = nome;
		this.preco = preco;
	}

	// Getters e Setters
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Double getPreco() {
		return preco;
	}

	public void setPreco(Double preco) {
		this.preco = preco;
	}
	
	public String precoEtiqueta() {
		return nome + " $ " + preco;
	}
}
