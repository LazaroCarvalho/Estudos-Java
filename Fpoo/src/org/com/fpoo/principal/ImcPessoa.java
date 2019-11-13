// Classe IMC.
// Recebe o peso e a altura em "double"
// Retorna o valor do IMC em double
// Retorna o estado da pessoa em "boolean".

package org.com.fpoo.principal;

public class ImcPessoa {
	public String nome;
	public double peso;
	public double altura;
	
	public double calcularImc() {		// Método que calcula o IMC e retorna o resultado;
		return (peso / Math.pow(altura, 2));	 // Calculando o IMC.
	}
	
	public boolean estadoFisico() {		// Verifíca o IMC, e classifica o usuário como acima ou abaixo do peso.
		boolean estado = false;
		if (calcularImc() < 25) {		// Verificando a classificação do IMC.
			estado = true;	
		}
		else {
			estado = false;
		}
		return estado;
	}
	
}
