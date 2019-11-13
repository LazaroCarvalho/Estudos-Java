// Classe que irá utilizar a classe ImcPessoa.
// Recebe três valores do usuário. Nome, altura, Peso.
package org.com.fpoo.principal;

import java.util.Scanner;
import java.text.DecimalFormat;

public class MainImcPessoa {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		ImcPessoa pessoa = new ImcPessoa();	// Criando um objeto da classe ImcPessoa. Este objeto nos dará acesso aos atributos e aos métodos
		DecimalFormat formato = new DecimalFormat("#00.0");
		
		System.out.print("\nOlá usuário! Digite seu nome: ");
		pessoa.nome = ler.nextLine();	// Armazenando a resposta em um atributo do objeto pessoa.
		
		System.out.print("\nDigite seu peso: ");
		pessoa.peso = ler.nextDouble();	
		
		System.out.print("\nDigite sua altura: ");
		pessoa.altura = ler.nextDouble();
		
		System.out.print("Nome: " + pessoa.nome);
		System.out.println("IMC: " + formato.format(pessoa.calcularImc()));
		
		if (pessoa.estadoFisico()) {
			System.out.println("\nTa saudável bixo");
		}
		else {
			System.out.println("\nNão saudável");
		}
		ler.close();
	}
}
