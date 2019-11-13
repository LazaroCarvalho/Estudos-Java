// Classe referente a todos os contribuintes.
package entities;

public abstract class Contribuinte {
	private String nome;
	private Double renda;
	
	// Construtores
	public Contribuinte() {
		
	}
	
	public Contribuinte(String nome, Double renda) {
		this.nome = nome;
		this.renda = renda;
	}

	// Getters e Setters
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Double getRenda() {
		return renda;
	}

	public void setRenda(Double renda) {
		this.renda = renda;
	}
	
	// Método para calculo de impostos.
	public abstract double impostos();
}
