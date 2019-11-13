package org.com.fpoo.principal;

import java.text.DecimalFormat;
import org.com.unix.tux.principal.*;

public class ImcCliente {
	private String name;
	private String dataNascimento;
	private double peso;
	private double altura;
	private String fraseImcBom = "Peso ok!";
	private String fraseImcRuim = "Peso ok!";
	private String sexo = "Não informado!";

	/*************** CONSTRUCTORS ****************/
	
	ImcCliente(String name){
		this.name = name;
	}
	
	ImcCliente(String name, String dataNascimento){
		this.name = name;
		this.dataNascimento = dataNascimento;
	}

	ImcCliente(String name, String dataNascimento, double peso){
		this.name = name;
		this.dataNascimento = dataNascimento;
		this.peso = peso;
	}

	ImcCliente(String name, String dataNascimento, double peso, double altura){
		this.name = name;
		this.dataNascimento = dataNascimento;
		this.peso = peso;
		this.altura = altura;
	}
	
	/**************** GETTERS AND SETTERS *******************/
	
	public String getName() {
		return name;
	}
	
	public String getDataNascimento() {
		return dataNascimento;
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
	
	public String getFraseImcBom() {
		return fraseImcBom;
	}

	public void setFraseImcBom(String fraseImcBom) {
		this.fraseImcBom = fraseImcBom;
	}

	public String getFraseImcRuim() {
		return fraseImcRuim;
	}

	public void setFraseImcRuim(String fraseImcRuim) {
		this.fraseImcRuim = fraseImcRuim;
	}
	
	public String getSexo() {
		return sexo;
	}
	
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	
	/*************** CÁLCULOS *****************/

	/****** CLASSE calculaImc() *******/
	public double calculaImc() {
		return peso / Math.pow(altura, 2);
	}
	
	/****** CLASSE estadoPessoa() ******/
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
	
	/** Exibe os dados dos atributos na tela **/
	public void exibir() {
		DecimalFormat formato = new DecimalFormat("#00.0");
		System.out.println("Nome: " + name);
		System.out.println("Sexo: " + sexo);
		System.out.println("Imc: " + formato.format(calculaImc()));
		
		if (calculaImc() < 25) {
			System.out.println("Situação: " + fraseImcBom);
		}
		else {
			System.out.println("Situação: " + fraseImcRuim);
		}
		System.out.println();
	}
	
	public int retornaIdade() {
		int idade = 0;
		return idade;
	}
}
