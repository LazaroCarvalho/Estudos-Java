package model.entities;

import model.exceptions.DadosException;
import model.exceptions.SaqueException;

public class Poupanca {
	private Integer numero;
	private String titular;
	private Double balanco;
	private Double limiteSaque;
	
	// Construtor
	public Poupanca(Integer numero, String titular, Double balanco, Double limiteSaque) {
		if (balanco < 0 || limiteSaque <= 0) {
			throw new DadosException("Balan�o ou limite de saque inv�lidos");
		}
		this.numero = numero;
		this.titular = titular;
		this.balanco = balanco;
		this.limiteSaque = limiteSaque;
	}

	// Getters e Setters
	public Integer getNumero() {
		return numero;
	}

	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	public Double getBalanco() {
		return balanco;
	}

	public void setBalanco(Double balanco) {
		this.balanco = balanco;
	}

	public Double getLimiteSaque() {
		return limiteSaque;
	}

	public void setLimiteSaque(Double limiteSaque) {
		this.limiteSaque = limiteSaque;
	}
	
	// M�todo para sacar uma quantia do balan�o.
	public void saque(double quantia) {
		if (quantia > limiteSaque) {
			throw new SaqueException("ERRO! Excedeu o limite de saque!");
		}
		if (quantia > balanco) {
			throw new SaqueException("ERRO! O saque excedeu o  saldo banc�rio!");
		}
		if (quantia <= 0) {
			throw new SaqueException("ERRO! Saque inv�lido!");
		}
		balanco -= quantia;
	}
}