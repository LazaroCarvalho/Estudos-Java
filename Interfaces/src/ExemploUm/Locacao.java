package ExemploUm;

import java.util.Calendar;
import java.util.Date;

public class Locacao {
	
	private double valorHora;
	private double valorDia;
	private String modeloVeiculo;
	private Calendar inicioLocacao = Calendar.getInstance();
	private Calendar fimLocacao = Calendar.getInstance();
	private static final long TEMPO_LIMITE_SEGUNDOS = 43200; // Valor de 12 horas em segundos. Tempo limite para cobrança por valor diário
	
	// Construtor
	public Locacao() {
		
	}

	// Getters e Setters
	public double getValorHora() {
		return valorHora;
	}

	public void setValorHora(double valorHora) {
		this.valorHora = valorHora;
	}

	public double getValorDia() {
		return valorDia;
	}

	public void setValorDia(double valorDia) {
		this.valorDia = valorDia;
	}

	public String getModeloVeiculo() {
		return modeloVeiculo;
	}

	public void setModeloVeiculo(String modeloVeiculo) {
		this.modeloVeiculo = modeloVeiculo;
	}

	public Calendar getInicioLocacao() {
		return inicioLocacao;
	}

	public void setInicioLocacao(Date inicioLocacao) {
		this.inicioLocacao.setTime(inicioLocacao);
	}

	public Calendar getFimLocacao() {
		return fimLocacao;
	}

	public void setFimLocacao(Date fimLocacao) {
		this.fimLocacao.setTime(fimLocacao);
	}
	
	// Retorna o tempo da locação em segundos.
	public long tempoTotal() {
		return (this.fimLocacao.getTimeInMillis() - this.inicioLocacao.getTimeInMillis()) / 1000;
	}
	
	// Retorna o valor do imposto cobrado sobre o valor total da locação.
	public double valorImposto() {
		
		double valorLocacao = valorLocacao();
		
		if(valorLocacao > 100)
			return valorLocacao * 0.15;
		else
			return valorLocacao * 0.2;
			
	}
	
	// Valor total da locação, de acordo com valor por dia/hora e tempo.
	public double valorLocacao() {
		
		long tempoLocacao = tempoTotal();
		
		if(tempoLocacao > 43200) {
			
			double dias = (double) tempoLocacao / 60 / 60 / 24;
			
			return Math.round(dias + 0.5) * this.valorDia;
			
		} else {
			
			double horas = (double) tempoLocacao / 60 / 60;
			
			return Math.round(horas + 0.5) * this.valorHora;
			
		}
		
	}
	 
	// Soma dos impostos sobre o valor da locação e o valor da locação
	public double valorTotal() {
		
		return valorLocacao() + valorImposto();
		
	}
	
}
