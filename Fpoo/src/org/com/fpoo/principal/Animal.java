package org.com.fpoo.principal;

public class Animal {
	protected String nome;
	protected double peso;
	
	/********* GETTERS AND SETTERS **********/
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getPeso() {
		return peso;
	}
	public void setPeso(double peso) {
		this.peso = peso;
	}
	 
	public void imprimir() {
		System.out.println("Nome: " + nome + "\nPeso: " + peso + "kg");
	}
}
