package org.com.fpoo.principal;

public class ImcPessoa2 {
	private String nome;
	private double peso;
	private double altura;
	
//Construtor
	ImcPessoa2(String nome) {
		this.nome = nome;
	}
	
// Getters e Setters.
	public String getNome() {
		return nome;
	}
	
	public double getPeso() {
		return peso;
	}
	public void setPeso(double peso) {
		this.peso = peso;
	}
	
	public double getAltura() {
		return altura;
	}
	public void setAltura(double altura) {
		this.altura = altura;
	}
	
// Método calculaImc()
	public double calculaImc() {
		return peso / Math.pow(altura, 2);
	}
	
// Método estadoPessoa()
// false - Peso ruim [Peso Ruim]
// true - Peso bom.
	public boolean estadoPessoa() {
		boolean estado = false;
		if (calculaImc() < 25) {
			estado = true;
		}
		else {
			estado = false;
		}
		return estado;
	}
}
