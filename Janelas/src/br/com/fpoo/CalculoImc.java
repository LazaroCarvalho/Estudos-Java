package br.com.fpoo;

public class CalculoImc {
	private double peso;
	private double altura;
	
	// Constructor
	public CalculoImc(double peso, double altura) {
		this.peso = peso;
		this.altura = altura;
	}
	
	// Getters and Setters
	public double getPeso() {
		return peso;
	}
	public double getAltura() {
		return altura;
	}
	
	// Métodos
	public Double calculoImc() {
		return peso / Math.pow(altura, 2);
	}
	
	public String classificacaoImc() {
		if (calculoImc() < 17 ) {
			return "Muito abaixo do peso";
		}
		else if (calculoImc() <= 18.49) {
			return "Abaixo do peso";
		}
		else if (calculoImc() <= 24.99) {
			return "Peso normal";
		}
		else if (calculoImc() <= 29.99) {
			return "Acima do peso";
		}
		else if (calculoImc() <= 34.99) {
			return "Obesidade I";
		}
		else if (calculoImc() <= 39.99) {
			return "Obesidade II";
		}
		else {
			return "Obesidade III";
		}
	}
}
